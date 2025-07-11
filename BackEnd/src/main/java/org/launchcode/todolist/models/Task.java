package org.launchcode.todolist.models;


import com.mysql.cj.xdevapi.Table;

import org.launchcode.todolist.data.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Table(name = "task")
public class Task implements TaskRepository {

    @Autowired
    TaskRepository taskRepository;

    private static int nextId = 1;
    private final int id;

    private String task;

    private final LocalDate dateRegistered = LocalDate.now();

    private String description;

    public Task(String task, String description) {
        this.id = nextId;
        this.task = task;
        this.description = description;
        nextId++;
    }

    public Task save(Task task){return taskRepository.save(task);}

    public Task createTask(Task task){ return taskRepository.save(task);}

    public TaskRepository getTaskRepository() {
        return taskRepository;
    }

    public void setTaskRepository(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
