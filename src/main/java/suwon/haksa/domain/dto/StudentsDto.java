package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Students;

public class StudentsDto {
    public record StudentsRequest(
            Long id,
            String portal_username,
            Long department_id,
            Long major_id,
            Long secondary_major_id,
            Long admission_year,
            boolean is_transfer_student,
            boolean is_graduated,
            String status,
            Long semester_enrolled,
            Long created_at,
            Long updated_at
    ){}
    @Builder
    public record StudentsResponse(
            Long id,
            String portal_username,
            Long department_id,
            Long major_id,
            Long secondary_major_id,
            Long admission_year,
            boolean is_transfer_student,
            boolean is_graduated,
            String status,
            Long semester_enrolled,
            Long created_at,
            Long updated_at
    ){
        public static StudentsResponse of(Students students){
        return StudentsResponse.builder()
                .id(students.getId())
                .portal_username(students.getPortal_username())
                .department_id(students.getDepartment_id())
                .major_id(students.getMajor_id())
                .secondary_major_id(students.getSecondary_major_id())
                .admission_year(students.getAdmission_year())
                .is_transfer_student(students.is_transfer_student())
                .is_graduated(students.is_graduated())
                .status(students.getStatus())
                .semester_enrolled(students.getSemester_enrolled())
                .created_at(students.getCreated_at())
                .updated_at(students.getUpdated_at())
                .build();
        }
    }
}
