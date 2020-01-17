package com.huffstler.persistence.model;

import org.h2.util.json.JSONObject;

import javax.persistence.*;

@Entity
public class Project {
    public long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getMetadata() {
        return metadata;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String projectName;

    @Column(nullable = false)
    private String metadata;
}
