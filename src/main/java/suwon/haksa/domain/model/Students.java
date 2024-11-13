package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Students extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private String portal_username;
    private Long department_id;
    private Long major_id;
    private Long secondary_major_id;
    private Long admission_year; //Date
    private boolean is_transfer_student;
    private boolean is_graduated;
    private String status; //boolean?
    private Long semester_enrolled;
    private Long created_at; //Date
    private Long updated_at; //Date

    @Builder
    public Students(Long id, String portal_username, Long department_id, Long major_id, Long secondary_major_id, Long admission_year, boolean is_transfer_student, boolean is_graduated, String status, Long semester_enrolled, Long created_at, Long updated_at){
        this.id = id;
        this.portal_username = portal_username;
        this.department_id = department_id;
        this.major_id = major_id;
        this.secondary_major_id = secondary_major_id;
        this.admission_year = admission_year;
        this.is_transfer_student = is_transfer_student;
        this.is_graduated = is_graduated;
        this.status = status;
        this.semester_enrolled = semester_enrolled;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
