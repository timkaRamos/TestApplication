package ru.javabegin.test.bisness.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name = "role_data",schema = "tasklist",catalog = "postgres")
@Getter
@Setter
public class RoleDate {
    @Id
    @Column(name = "id",nullable = false)
    private Long id;
    @Basic
    @Column(name = "name",nullable = false,length = -1)
    private String name;
    @OneToMany(mappedBy = "roleDataByRoleId")
    private Collection<UserRole>userRolesById;
}
