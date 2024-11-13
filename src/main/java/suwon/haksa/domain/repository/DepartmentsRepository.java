package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
