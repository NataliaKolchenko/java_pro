package org.example;

import java.util.UUID;

public class Product {

    private UUID id;
    private String title;
    private String description;

    public Product(String title, String description) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
