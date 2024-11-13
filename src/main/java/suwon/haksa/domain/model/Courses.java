package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Courses extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private Long subject_code;
    private String course_name;
    private String faculty_division_name;
    private Long points;
    private Long subject_establishment_year; //Date?
    private Long category_code;
    private Long professor_id;
    private Long department_id;
    private Long evaluation_type_code;
    private String schedule_summary;
    private Long class_section;
    private boolean is_video_lecture;
    private Long subject_establishment_semester;

    @Builder
    public Courses(Long id, Long subject_code, String course_name, String faculty_division_name, Long points, Long subject_establishment_year, Long category_code, Long professor_id, Long department_id, Long evaluation_type_code, String schedule_summary, Long class_section, boolean is_video_lecture, Long subject_establishment_semester){
        this.id=id;
        this.subject_code = subject_code;
        this.course_name = course_name;
        this.faculty_division_name = faculty_division_name;
        this.points = points;
        this.subject_establishment_year = subject_establishment_year;
        this.category_code = category_code;
        this.professor_id = professor_id;
        this. department_id = department_id;
        this.evaluation_type_code = evaluation_type_code;
        this.schedule_summary = schedule_summary;
        this.class_section = class_section;
        this.is_video_lecture = is_video_lecture;
        this.subject_establishment_semester = subject_establishment_semester;
    }
}
