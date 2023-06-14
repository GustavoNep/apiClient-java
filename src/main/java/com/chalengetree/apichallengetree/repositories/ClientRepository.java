package com.chalengetree.apichallengetree.repositories;

import com.chalengetree.apichallengetree.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
