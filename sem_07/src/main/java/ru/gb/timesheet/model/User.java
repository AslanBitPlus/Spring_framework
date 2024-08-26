package ru.gb.timesheet.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @Column(name = "login")
  private String login;

  @Column(name = "password")
  private String password;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name="roles",
          joinColumns=  @JoinColumn(name="user_id", referencedColumnName="id"),
          inverseJoinColumns= @JoinColumn(name=" roles_id", referencedColumnName="id") )
  private Set<RoleCl> roles = new HashSet<RoleCl>();

}
