package com.steinkeit.persistentH2.infrastructure.persistence;

import com.steinkeit.persistentH2.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
