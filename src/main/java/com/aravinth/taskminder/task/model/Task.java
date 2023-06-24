package com.aravinth.taskminder.task.model;

import com.aravinth.taskminder.user.model.User;

public class Task {
  private String taskId;
  private String title;
  private String description;
  private User assignedTo;

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public Task(String title, String description, User assignedTo) {
    this.title = title;
    this.description = description;
    this.assignedTo = assignedTo;
  }

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public User getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(User assignedTo) {
    this.assignedTo = assignedTo;
  }
}
