package com.springmvcstudy.congroller;

import com.springmvcstudy.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/converter")
public class ConvertHandler {

    @RequestMapping("/date")
    public String date(Date date) {
        return date.toString();
    }

    @RequestMapping("/student")
    public String student(Student student) {
        return student.toString();
    }

}
