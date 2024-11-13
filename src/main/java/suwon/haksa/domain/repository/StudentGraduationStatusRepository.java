package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.StudentGraduationStatus;

public interface StudentGraduationStatusRepository extends JpaRepository<StudentGraduationStatus, Long> {
}
