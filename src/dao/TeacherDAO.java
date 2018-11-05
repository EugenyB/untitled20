package dao;

import entities.Teacher;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class TeacherDAO {
    @PersistenceContext
    EntityManager em;

    public List<Teacher> findAll() {
        return em.createQuery("select t from Teacher t", Teacher.class).getResultList();
    }

    public Teacher createNewTeacher(String name, int experience) {
        // Создаем новый объект
        Teacher teacher = new Teacher(name, experience);

        // После вызова метода persist() объект меняет свой
        // статус на управляемый. Во время очередной
        // операции записи в БД объект будет помещен в БД.
        em.persist(teacher);

        return teacher;
    }

    public void removeTeacher(int teacherId) {

        Teacher teacher = em.find(Teacher.class, teacherId);

        // Объект будет удален из БД при очередной
        // операции записи в БД. Доступ к удаленному
        // объекту приводит к непредсказуемым
        // результатам
        em.remove(teacher);
    }

    public Teacher updateTeacher(Teacher teacher) {
        // Метод merge возвращает управляемую копию
        // переданного отсодиненного объекта. Если состояние
        // отсоединного объекта было изменено, то изменения
        // будут отражены в возвращаемой копии
        return em.merge(teacher);
    }
}
