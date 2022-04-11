package com.demo.conferencedemo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

	Speaker saveAndFlush(Optional<Speaker> existingSpeaker);
}
