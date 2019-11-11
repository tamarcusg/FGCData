package com.fgc.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgc.data.entity.Match;


public interface MatchRepository extends JpaRepository<Match, String> {

}
