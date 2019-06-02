package com.megatravel.agentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megatravel.agentbackend.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

}
