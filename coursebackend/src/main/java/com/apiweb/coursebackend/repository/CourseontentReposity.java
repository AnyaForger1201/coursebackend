package com.apiweb.coursebackend.repository;

import com.apiweb.coursebackend.entity.Coursecontent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseontentReposity extends JpaRepository<Coursecontent,Long> {
}
