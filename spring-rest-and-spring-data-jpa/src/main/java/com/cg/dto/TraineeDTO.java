package com.cg.dto;

public class TraineeDTO {

	private Integer id;
    private String name;
    private String domain;
    private String location;

    public TraineeDTO() {
    }

    public TraineeDTO(Integer id, String name, String domain, String location) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.location = location;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}