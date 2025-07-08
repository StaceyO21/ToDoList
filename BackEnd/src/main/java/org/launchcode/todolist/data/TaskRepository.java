package org.launchcode.todolist.data;

import org.launchcode.todolist.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    public Task createTask(Task task);


}
