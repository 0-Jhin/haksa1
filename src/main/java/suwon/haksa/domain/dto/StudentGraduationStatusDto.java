package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.StudentGraduationStatus;

public class StudentGraduationStatusDto {
    public record StudentGraduationStatusRequest(
            Long id,
            Long student_id,
            Long graduation_criteria_id,
            boolean credits_fulfilled,
            boolean language_cert_fulfilled,
            boolean semesters_fulfilled,
            boolean gpa_fulfilled,
            boolean thesis_fulfilled,
            boolean graduation_status,
            Long checked_at
    ){}
    @Builder
    public record StudentGraduationStatusResponse(
            Long id,
            Long student_id,
            Long graduation_criteria_id,
            boolean credits_fulfilled,
            boolean language_cert_fulfilled,
            boolean semesters_fulfilled,
            boolean gpa_fulfilled,
            boolean thesis_fulfilled,
            boolean graduation_status,
            Long checked_at
    ){
        public static StudentGraduationStatusResponse of(StudentGraduationStatus studentGraduationStatus){
            return StudentGraduationStatusResponse.builder()
                    .id(studentGraduationStatus.getStudent_id())
                    .student_id(studentGraduationStatus.getStudent_id())
                    .graduation_criteria_id(studentGraduationStatus.getStudent_id())
                    .credits_fulfilled(studentGraduationStatus.isCredits_fulfilled())
                    .language_cert_fulfilled(studentGraduationStatus.isLanguage_cert_fulfilled())
                    .semesters_fulfilled(studentGraduationStatus.isSemesters_fulfilled())
                    .gpa_fulfilled(studentGraduationStatus.isGpa_fulfilled())
                    .thesis_fulfilled(studentGraduationStatus.isThesis_fulfilled())
                    .graduation_status(studentGraduationStatus.isGraduation_status())
                    .build();
        }
    }
}
