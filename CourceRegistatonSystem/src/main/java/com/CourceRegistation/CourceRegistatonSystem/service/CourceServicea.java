package com.CourceRegistation.CourceRegistatonSystem.service;

import com.CourceRegistation.CourceRegistatonSystem.Repo.CourseRepository;
import com.CourceRegistation.CourceRegistatonSystem.Repo.CoursesRepo;
import com.CourceRegistation.CourceRegistatonSystem.model.CourceDetail;
import com.CourceRegistation.CourceRegistatonSystem.model.CourseRegitary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourceServicea {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CoursesRepo coursesRepo;

    public List<CourceDetail> getAllStudents() {

        return courseRepository.findAll();
    }

    public List<CourseRegitary> RegisteredStudent() {
        return coursesRepo.findAll();
    }

    public void RegistrationCourses(String name, String email, String college, String courceName) {
        CourseRegitary coure=new CourseRegitary(name,email,college,courceName);
        coursesRepo.save(coure);
    }
}
