package org.example.timesheet.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Timesheet {

  private Long id;
  private String project;
  private int minutes;
  private LocalDate createdAt;

  public Object getId() {
    return id;
  }

  public void setId(Long aLong) {
    this.id = id;
  }
}
