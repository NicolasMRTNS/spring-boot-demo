package com.demo.conferencedemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

	Session saveAndFlush(Optional<Session> existingSession);
}
