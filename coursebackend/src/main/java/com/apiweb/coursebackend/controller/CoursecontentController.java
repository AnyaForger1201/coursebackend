package com.apiweb.coursebackend.controller;

import com.apiweb.coursebackend.dto.CourseContentDto;
import com.apiweb.coursebackend.service.CoursecontentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/coursecontent")
public class CoursecontentController {

    private CoursecontentService coursecontentService;

    //Build Add Coursecontent REST API
    @PostMapping
    public ResponseEntity<CourseContentDto> createCoursecontent(@RequestBody CourseContentDto courseContentDto){
        CourseContentDto savedCoursecontent = coursecontentService.createCoursecontent(courseContentDto);
        return new ResponseEntity<>(savedCoursecontent, HttpStatus.CREATED);
    }
}
