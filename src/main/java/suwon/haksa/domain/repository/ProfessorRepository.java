package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
