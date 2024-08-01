package org.example.timesheet.controller;

import org.example.timesheet.model.Project;
import org.example.timesheet.model.Timesheet;
import org.example.timesheet.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    // /projects/{id}
    @GetMapping("/{id}") // получить все
    public ResponseEntity<Project> get(@PathVariable Long id) {
        Optional<Project> pr = service.getById(id);

        if (pr.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(pr.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping // получить все
    public ResponseEntity<List<Project>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping // создание нового ресурса
    public ResponseEntity<Project> create(@RequestBody Project project) {
        project = service.create(project);

        // 201 Created
        return ResponseEntity.status(HttpStatus.CREATED).body(project);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);

        // 204 No Content
        return ResponseEntity.noContent().build();
    }
}
