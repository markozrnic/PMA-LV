package com.example.pma_lv1;
import java.util.ArrayList;

import java.util.List;

HO HO HOHOHHOHO RADI SADDSAD OBRO

public class MyDataStorage {
    private List<Student> students;

    private MyDataStorage() {
        this.students = new ArrayList<>();
    }

    static private MyDataStorage instance;

    static MyDataStorage getInstance(){
        if(instance==null)
        {
            instance = new MyDataStorage();
        }
        return instance;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }
}
