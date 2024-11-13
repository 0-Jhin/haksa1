package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Professor extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private String professor_name;
    private Long professor_code;
    private Long department_id;
    private Long created_at; //Date

    @Builder
    public Professor(Long id, String professor_name, Long professor_code, Long department_id, Long created_at){
        this.id = id;
        this.professor_name = professor_name;
        this.professor_code = professor_code;
        this.department_id = department_id;
        this.created_at = created_at;
    }
}
