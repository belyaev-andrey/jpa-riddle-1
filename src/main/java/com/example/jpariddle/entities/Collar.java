package com.example.jpariddle.entities;

import javax.persistence.*;

@Table(name = "collar")
@Entity
public class Collar {

    @EmbeddedId
    private CollarLabel collarLabel;

    @MapsId("petId")
    @OneToOne(orphanRemoval = true)
    private Pet pet;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public CollarLabel getCollarLabel() {
        return collarLabel;
    }

    public void setCollarLabel(CollarLabel collarLabel) {
        this.collarLabel = collarLabel;
    }


}