package com.apiweb.coursebackend.service;

import com.apiweb.coursebackend.dto.CourseContentDto;

public interface CoursecontentService {
    CourseContentDto createCoursecontent(CourseContentDto courseContentDto);

    CourseContentDto getCoursecontentById(Long coursecontentId);
}
