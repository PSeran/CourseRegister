package com.CourceRegistation.CourceRegistatonSystem.Repo;

import com.CourceRegistation.CourceRegistatonSystem.model.CourceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourceDetail,String> {

}
