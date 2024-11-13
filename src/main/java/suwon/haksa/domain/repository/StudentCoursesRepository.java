package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.StudentCourses;

public interface StudentCoursesRepository extends JpaRepository<StudentCourses, Long> {
}
