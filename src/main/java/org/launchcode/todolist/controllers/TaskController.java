package org.launchcode.todolist.controllers;

import org.launchcode.todolist.data.TaskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("task")
public class TaskController {

    @GetMapping("")
    public String displayAddTaskForm() {
        return "task/add";
    }

    @PostMapping("")
    public ResponseEntity<?> createTask(@RequestBody Map<String, String> taskData){

        String task = taskData.get("task");
        String description = taskData.get("description");

        Task newTask = new Task();
        newTask.setTask(task);
        newTask.setDescription(description);



    }
}
