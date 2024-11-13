package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.GraduationCreditDistribution;

public class GraduationCreditDistributionDto {
    public record GraduationCreditDistributionRequest(
            Long id,
            String department,
            Long admission_year,
            Long required_credits,
            Long major_core_required,
            Long major_selection_required,
            Long important_core_required,
            Long basic_liberal_arts_required,
            Long selective_liberal_arts_required,
            Long character_education_required,
            Long general_electives_required
    ){}
    @Builder
    public record GraduationCreditDistributionResponse(
            Long id,
            String department,
            Long admission_year,
            Long required_credits,
            Long major_core_required,
            Long major_selection_required,
            Long important_core_required,
            Long basic_liberal_arts_required,
            Long selective_liberal_arts_required,
            Long character_education_required,
            Long general_electives_required
    ){
        public static GraduationCreditDistributionResponse of(GraduationCreditDistribution graduationCreditDistribution){
            return GraduationCreditDistributionResponse.builder()
                    .id(graduationCreditDistribution.getId())
                    .department(graduationCreditDistribution.getDepartment())
                    .admission_year(graduationCreditDistribution.getAdmission_year())
                    .required_credits(graduationCreditDistribution.getRequired_credits())
                    .major_core_required(graduationCreditDistribution.getMajor_core_required())
                    .major_selection_required(graduationCreditDistribution.getMajor_selection_required())
                    .important_core_required(graduationCreditDistribution.getImportant_core_required())
                    .basic_liberal_arts_required(graduationCreditDistribution.getBasic_liberal_arts_required())
                    .selective_liberal_arts_required(graduationCreditDistribution.getSelective_liberal_arts_required())
                    .character_education_required(graduationCreditDistribution.getCharacter_education_required())
                    .general_electives_required(graduationCreditDistribution.getGeneral_electives_required())
                    .build();
        }
    }
}
