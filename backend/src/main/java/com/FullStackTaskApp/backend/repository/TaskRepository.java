package com.FullStackTaskApp.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.FullStackTaskApp.backend.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
