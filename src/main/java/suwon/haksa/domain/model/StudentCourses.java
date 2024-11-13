package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentCourses extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private Long student_id;
    private Long semester;
    private Long course_id;
    private float grade;
    private float points;
    private boolean is_retake;
    private String course_category;

    @Builder
    public StudentCourses(Long id, Long student_id, Long semester, Long course_id, float grade, float points, boolean is_retake, String course_category){
        this.id = id;
        this.student_id = student_id;
        this.semester = semester;
        this.course_id = course_id;
        this.grade = grade;
        this.points = points;
        this.is_retake = is_retake;
        this.course_category = course_category;
    }
}
