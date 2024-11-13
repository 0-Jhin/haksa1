package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Departments extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private Long department_code;
    private String established_department_name;
    private Long created_at; //Date
    private Long update_at; //Date

    @Builder
    public Departments(Long id, Long department_code, String established_department_name, Long created_at, Long update_at){
        this.id = id;
        this.department_code = department_code;
        this.established_department_name = established_department_name;
        this.created_at = created_at;
        this.update_at = update_at;
    }
}
