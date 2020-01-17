package com.huffstler.controller;

import com.huffstler.persistence.model.Project;
import com.huffstler.persistence.repo.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepo;

    @GetMapping
    public Iterable findAll() {
        return projectRepo.findAll();
    }

    @GetMapping("/name/{projectName}")
    public List findByName(@PathVariable String projectName) {
        return projectRepo.findByProjectName(projectName);
    }

    @GetMapping("/{id}")
    public Project findOne(@PathVariable Long id) {
        return projectRepo.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Project create(@RequestBody Project project) {
        return projectRepo.save(project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectRepo.findById(id)
                .orElseThrow(RuntimeException::new);
        projectRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public Project updateProject(@RequestBody Project project, @PathVariable Long id) {
        if (project.getId() != id) {
            throw new RuntimeException();
        }
        projectRepo.findById(id)
                .orElseThrow(RuntimeException::new);
        return projectRepo.save(project);
    }

}
