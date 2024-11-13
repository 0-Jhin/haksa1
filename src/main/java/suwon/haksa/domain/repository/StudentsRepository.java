package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {
}
