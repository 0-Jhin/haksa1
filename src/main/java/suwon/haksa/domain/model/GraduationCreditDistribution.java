package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GraduationCreditDistribution extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private String department; //Long?
    private Long admission_year; //Date
    private Long required_credits;
    private Long major_core_required;
    private Long major_selection_required;
    private Long important_core_required;
    private Long basic_liberal_arts_required;
    private Long selective_liberal_arts_required;
    private Long character_education_required;
    private Long general_electives_required;

    @Builder
    public GraduationCreditDistribution(Long id, String department, Long admission_year, Long required_credits, Long major_core_required, Long major_selection_required, Long important_core_required, Long basic_liberal_arts_required, Long selective_liberal_arts_required, Long character_education_required, Long general_electives_required){
        this.id = id;
        this.department = department;
        this.admission_year = admission_year;
        this.required_credits = required_credits;
        this.major_core_required = major_core_required;
        this.major_selection_required = major_selection_required;
        this.important_core_required = important_core_required;
        this.basic_liberal_arts_required = basic_liberal_arts_required;
        this.selective_liberal_arts_required = selective_liberal_arts_required;
        this.character_education_required = character_education_required;
        this.general_electives_required = general_electives_required;
    }
}
