package com.demo.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
