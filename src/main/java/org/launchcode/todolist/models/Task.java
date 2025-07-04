package org.launchcode.todolist.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
//@Table(name = "task")
public class Task extends AbstractEntity{

    private String name;

    private LocalDate dateRegistered = LocalDate.now();

    private String description;


}
