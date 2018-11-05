package beans;

import entities.Teacher;

import java.util.List;

public class TeacherBean {
    public TeacherBean() {
    }

    public TeacherBean(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
