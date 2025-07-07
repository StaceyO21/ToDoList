package org.launchcode.todolist.models;


import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "Task")
public class Task{

    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String task;

    private LocalDate dateRegistered = LocalDate.now();

    private String description;


}
