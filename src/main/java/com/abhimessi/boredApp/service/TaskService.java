package com.abhimessi.boredApp.service;

import com.abhimessi.boredApp.model.Task;
import com.abhimessi.boredApp.model.TaskStatus;
import com.abhimessi.boredApp.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task getTask(){
        return taskRepository.findAll().get(0);
    }

    public Task getTask(String taskName){
        return taskRepository.findByTaskName(taskName);
    }

    public void createTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(String taskName){
        int taskId = taskRepository.findByTaskName(taskName).getId();
        taskRepository.deleteById(taskId);
    }

    public void setTaskStatus(String taskName, String taskStatus){
        Task task = taskRepository.findByTaskName(taskName);
        task.setTaskStatus(TaskStatus.valueOf(taskStatus));
        taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void removeAllTasks(){
        taskRepository.deleteAll();
    }

}
