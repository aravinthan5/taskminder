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
}
