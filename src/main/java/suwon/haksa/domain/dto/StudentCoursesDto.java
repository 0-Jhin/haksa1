package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.StudentCourses;

public class StudentCoursesDto {
    public record StudentCoursesRequest(
            Long id,
            Long student_id,
            Long semester,
            Long course_id,
            float grade,
            float points,
            boolean is_retake,
            String course_category
    ){}
    @Builder
    public record StudentCoursesResponse(
            Long id,
            Long student_id,
            Long semester,
            Long course_id,
            float grade,
            float points,
            boolean is_retake,
            String course_category
    ){
        public static StudentCoursesResponse of(StudentCourses studentCourses){
            return StudentCoursesResponse.builder()
                    .id(studentCourses.getStudent_id())
                    .student_id(studentCourses.getStudent_id())
                    .semester(studentCourses.getStudent_id())
                    .course_id(studentCourses.getStudent_id())
                    .grade(studentCourses.getStudent_id())
                    .points(studentCourses.getStudent_id())
                    .is_retake(studentCourses.is_retake())
                    .course_category(studentCourses.getCourse_category())
                    .build();
        }
    }
}
