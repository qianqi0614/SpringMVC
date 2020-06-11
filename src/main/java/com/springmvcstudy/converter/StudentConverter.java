package com.springmvcstudy.converter;

import com.springmvcstudy.entity.Student;
import org.springframework.core.convert.converter.Converter;

public class StudentConverter implements Converter<String, Student> {
    @Override
    public Student convert(String s) {
        // s = "1-张三-22"
        String[] args = s.split("-");
        // args = {"1", "张三", "2"}
        Student student = new Student();
        student.setId(Long.parseLong(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        return student;
    }
}
