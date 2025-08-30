package com.CourceRegistation.CourceRegistatonSystem.controller;

import com.CourceRegistation.CourceRegistatonSystem.model.CourceDetail;
import com.CourceRegistation.CourceRegistatonSystem.model.CourseRegitary;
import com.CourceRegistation.CourceRegistatonSystem.service.CourceServicea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:5500")
public class CourceControllera {

    @Autowired
    CourceServicea courceServicea;

    @GetMapping("courses")
    public List<CourceDetail> getAllStudent(){

        return courceServicea.getAllStudents();
    }
    @GetMapping("courses/enrolled")
    public List<CourseRegitary> enrolledStudent(){

        return courceServicea.RegisteredStudent();
    }

    @PostMapping("courses/register")
    public String RegisterStudent(@RequestParam("u_name") String name,
                                  @RequestParam("u_email") String email,
                                  @RequestParam("college") String college,
                                  @RequestParam("cource_name") String courceName){
        courceServicea.RegistrationCourses(name,email,college,courceName);
        return "[" + name + "sucessfully Entrolled" + courceName + "]";
    }
}
