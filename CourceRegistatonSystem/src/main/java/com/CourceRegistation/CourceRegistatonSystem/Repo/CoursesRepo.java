package com.CourceRegistation.CourceRegistatonSystem.Repo;

import com.CourceRegistation.CourceRegistatonSystem.model.CourseRegitary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<CourseRegitary,Integer> {
}
