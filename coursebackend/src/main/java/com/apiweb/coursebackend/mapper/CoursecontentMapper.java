package com.apiweb.coursebackend.mapper;

import com.apiweb.coursebackend.dto.CourseContentDto;
import com.apiweb.coursebackend.entity.Coursecontent;

public class CoursecontentMapper {

    public static CourseContentDto mapToCourseContentDto(Coursecontent coursecontent){
        return new CourseContentDto(
                coursecontent.getId(),
                coursecontent.getBuoi1(),
                coursecontent.getBuoi2(),
                coursecontent.getBuoi3(),
                coursecontent.getBuoi4(),
                coursecontent.getBuoi5(),
                coursecontent.getBuoi6(),
                coursecontent.getBuoi7(),
                coursecontent.getBuoi8()
        );
    }

    public static Coursecontent mapToCoursecontent(CourseContentDto courseContentDto){
        return new Coursecontent(
                courseContentDto.getId(),
                courseContentDto.getBuoi1(),
                courseContentDto.getBuoi2(),
                courseContentDto.getBuoi3(),
                courseContentDto.getBuoi4(),
                courseContentDto.getBuoi5(),
                courseContentDto.getBuoi6(),
                courseContentDto.getBuoi7(),
                courseContentDto.getBuoi8()
        );

    }
}
