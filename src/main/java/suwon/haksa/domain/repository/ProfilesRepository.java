package suwon.haksa.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suwon.haksa.domain.model.Profiles;

public interface ProfilesRepository extends JpaRepository<Profiles, Long> {
}
