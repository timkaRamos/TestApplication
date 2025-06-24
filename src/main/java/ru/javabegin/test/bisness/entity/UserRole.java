package ru.javabegin.test.bisness.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_role",schema = "tasklist",catalog = "postgres")
@Getter
@Setter

public class UserRole {
     @Basic
     @Column(name = "user_id",nullable = false)
    private  Long userId;
    @Basic
    @Column(name = "role_id",nullable = false)
    private Long roleId;
    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    private  UserData userDataByUserId;
    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id",nullable = false)
    private RoleDate roelDataByRoleId;


}
