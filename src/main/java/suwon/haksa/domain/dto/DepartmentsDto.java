package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Departments;

public class DepartmentsDto {
    public record DepartmentsRequest(
            Long id,
            Long department_code,
            String established_department_name,
            Long created_at,
            Long update_at
    ){}
    @Builder
    public record DepartmentsResponse(
            Long id,
            Long department_code,
            String established_department_name,
            Long created_at,
            Long update_at
    ){
        public static DepartmentsResponse of(Departments departments){
            return DepartmentsResponse.builder()
                    .id(departments.getId())
                    .department_code(departments.getDepartment_code())
                    .established_department_name(departments.getEstablished_department_name())
                    .created_at(departments.getCreated_at())
                    .update_at(departments.getUpdate_at())
                    .build();
        }
    }
}
