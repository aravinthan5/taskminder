package com.aravinth.taskminder.user.model;

import com.aravinth.taskminder.task.model.Task;
import java.util.List;

public class User {
  private String firstName;
  private String lastName;
  private String userId;
  private List<Role> roles;
  private List<Permission> permissions;
  private List<Task> taskList;

  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public User(
      String firstName,
      String lastName,
      List<Role> roles,
      List<Permission> permissions,
      List<Task> taskList) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.roles = roles;
    this.permissions = permissions;
    this.taskList = taskList;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  public List<Task> getTaskList() {
    return taskList;
  }

  public void setTaskList(List<Task> taskList) {
    this.taskList = taskList;
  }
}
