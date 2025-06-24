package ru.javabegin.test.bisness.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Activity {

    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Basic
    @Column (name = "activated",nullable = false)
    private Short activated;
    @Basic
    @Column(name = "uuid",nullable = false,length = -1)
    private String uuid;
    @Basic
    @Column(name = "user_id",nullable = false)
    private  Long userId;
    @Basic
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    private UserData userDataByUserId;

}
