package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Professor;

public class ProfessorDto {
    public record ProfessorRequest(
            Long id,
            String professor_name,
            Long professor_code,
            Long department_id,
            Long created_at
    ){}
    @Builder
    public record ProfessorResponse(
            Long id,
            String professor_name,
            Long professor_code,
            Long department_id,
            Long created_at
    ){
        public static ProfessorResponse of(Professor professor){
            return ProfessorResponse.builder()
                    .id(professor.getId())
                    .professor_name(professor.getProfessor_name())
                    .professor_code(professor.getProfessor_code())
                    .department_id(professor.getDepartment_id())
                    .created_at(professor.getCreated_at())
                    .build();
        }
    }
}
