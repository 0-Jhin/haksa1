package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Courses;

public class CoursesDto {
    public record CoursesRequest(
            Long id,
            Long subject_code,
            String course_name,
            String faculty_division_name,
            Long points,
            Long subject_establishment_year,
            Long category_code,
            Long professor_id,
            Long department_id,
            Long evaluation_type_code,
            String schedule_summary,
            Long class_section,
            boolean is_video_lecture,
            Long subject_establishment_semester
    ){}
    @Builder
    public record CoursesResponse(
            Long id,
            Long subject_code,
            String course_name,
            String faculty_division_name,
            Long points,
            Long subject_establishment_year,
            Long category_code,
            Long professor_id,
            Long department_id,
            Long evaluation_type_code,
            String schedule_summary,
            Long class_section,
            boolean is_video_lecture,
            Long subject_establishment_semester
    ) {
        public static CoursesResponse of(Courses courses){
            return CoursesResponse.builder()
                    .id(courses.getId())
                    .subject_code(courses.getSubject_code())
                    .course_name(courses.getCourse_name())
                    .faculty_division_name(courses.getFaculty_division_name())
                    .points(courses.getPoints())
                    .subject_establishment_year(courses.getSubject_establishment_year())
                    .category_code(courses.getCategory_code())
                    .professor_id(courses.getProfessor_id())
                    .department_id(courses.getDepartment_id())
                    .evaluation_type_code(courses.getEvaluation_type_code())
                    .schedule_summary(courses.getSchedule_summary())
                    .class_section(courses.getClass_section())
                    .is_video_lecture(courses.is_video_lecture())
                    .subject_establishment_semester(courses.getSubject_establishment_semester())
                    .build();
        }
    }
}
