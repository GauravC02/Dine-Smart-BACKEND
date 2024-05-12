package com.example.photostorage_service.photostorage_service.Models;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Photo {
    @Id
    @UuidGenerator
    @Column(unique = true, updatable = false)
    private String id;
    private String location;

    public Photo() {

    }

    public String getId() {
        return this.id;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}