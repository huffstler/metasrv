package com.huffstler.persistence.repo;

import com.huffstler.persistence.model.Project;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;
import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Book> findByProjectName(String projectName);
}
