package com.apiweb.coursebackend.service.impl;

import com.apiweb.coursebackend.dto.CourseContentDto;
import com.apiweb.coursebackend.entity.Coursecontent;
import com.apiweb.coursebackend.exception.ResourceNotFoundException;
import com.apiweb.coursebackend.mapper.CoursecontentMapper;
import com.apiweb.coursebackend.repository.CourseontentReposity;
import com.apiweb.coursebackend.service.CoursecontentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoursecontentServiceimpl implements CoursecontentService {

    @Autowired
    private CourseontentReposity courseontentReposity;

    @Override
    public CourseContentDto createCoursecontent(CourseContentDto courseContentDto) {

        Coursecontent coursecontent = CoursecontentMapper.mapToCoursecontent(courseContentDto);
        Coursecontent savedCoursecontent = courseontentReposity.save(coursecontent);

         return CoursecontentMapper.mapToCourseContentDto(savedCoursecontent);
    }

    @Override
    public CourseContentDto getCoursecontentById(Long coursecontentId) {
        Coursecontent coursecontent = courseontentReposity.findById(coursecontentId)
                .orElseThrow(() -> new ResourceNotFoundException("Content is not exists"));
        return CoursecontentMapper.mapToCourseContentDto(coursecontent);
    }
}
