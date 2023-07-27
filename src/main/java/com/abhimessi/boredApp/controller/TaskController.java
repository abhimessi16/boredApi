package com.abhimessi.boredApp.controller;

import com.abhimessi.boredApp.model.Task;
import com.abhimessi.boredApp.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@AllArgsConstructor
public class TaskController {

    /*
        ideally you want to create a DTO task object
        you wouldn't want to send the whole task object
        like you wouldn't send the taskId right?

        also try to check for correctness and send proper status codes
        try this later in the day (29-07-23)
        for now create the api
     */

    private TaskService taskService;

    @GetMapping("/get")
    public Task getTask(){
        return taskService.getTask();
    }

    // example -> 'Wake up early'
    @GetMapping("/get/{taskname}")
    public Task getTask(@PathVariable String taskname){
        return taskService.getTask(taskname);
    }

    @PostMapping("/add")
    public void createTask(@RequestBody Task task){
        taskService.createTask(task);
    }

    @GetMapping("/{taskname}/delete")
    public void deleteTask(@PathVariable String taskname) {
        taskService.deleteTask(taskname);
    }

    // must find a better approach to set the status of task
    @GetMapping("/{taskname}/{status}")
    public void updateTaskStatus(@PathVariable String taskname, @PathVariable String status){
        taskService.setTaskStatus(taskname, status);
    }

    @GetMapping("/get-all")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/delete-all")
    public void deleteAllTasks() {
        taskService.removeAllTasks();
    }

}
