package ru.javabegin.test.bisness.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.config.Task;

import java.util.Collection;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Basic
    @Column(name = "title",nullable = false,length = -1)
    private String title;
    @Basic
    @Column(name = "completed_count",nullable = false)
    private Long completedCount;
    @Basic
    @Column(name = "uncompleted_count",nullable = false)
    private Long uncompletedCount;
    @Basic
    @Column(name = "user_id",nullable = false)
    private Long userId;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    private UserData userDataByUserId;
    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<Task>tasksById;
}
