package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
