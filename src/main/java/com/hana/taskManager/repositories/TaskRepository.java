package com.hana.taskManager.repositories;

import com.hana.taskManager.entities.Task;
import com.hana.taskManager.entities.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByDueDateBefore(LocalDate date);
}
