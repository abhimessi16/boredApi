package com.abhimessi.boredApp.repository;

import com.abhimessi.boredApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findByTaskName(String taskName);
}
