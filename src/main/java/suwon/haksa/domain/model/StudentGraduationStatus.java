package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentGraduationStatus extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private Long student_id;
    private Long graduation_criteria_id;
    private boolean credits_fulfilled;
    private boolean language_cert_fulfilled;
    private boolean semesters_fulfilled;
    private boolean gpa_fulfilled;
    private boolean thesis_fulfilled;
    private boolean graduation_status;
    private Long checked_at; //Date

    @Builder
    public StudentGraduationStatus(Long id, Long student_id, Long graduation_criteria_id, boolean credits_fulfilled, boolean language_cert_fulfilled, boolean semesters_fulfilled, boolean gpa_fulfilled, boolean thesis_fulfilled, boolean graduation_status, Long checked_at){
        this.id = id;
        this.student_id = student_id;
        this.graduation_criteria_id = graduation_criteria_id;
        this.credits_fulfilled = credits_fulfilled;
        this.language_cert_fulfilled = language_cert_fulfilled;
        this.semesters_fulfilled = semesters_fulfilled;
        this.gpa_fulfilled = gpa_fulfilled;
        this.thesis_fulfilled = thesis_fulfilled;
        this.graduation_status = graduation_status;
        this.checked_at = checked_at;
    }
}
