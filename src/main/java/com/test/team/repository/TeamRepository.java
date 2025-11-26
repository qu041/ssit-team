package com.test.team.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.team.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {


}
