package org.launchcode.todolist.controllers;

import org.launchcode.todolist.models.Task;
import org.launchcode.todolist.data.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("task")
public class TaskController {

    @Autowired TaskRepository taskRepository;

    @GetMapping("")
    public String displayAddTaskForm() {
        return "task/add";
    }

    @PostMapping("")
    public ResponseEntity<?> createTask(@RequestBody Map<String, String> taskData) {

        String task = taskData.get("task");
        String description = taskData.get("description");

        Task newTask = new Task();
        newTask.setTask(task);
        newTask.setDescription(description);

        taskRepository.save(newTask);

        return ResponseEntity.ok(newTask);
    }
}

