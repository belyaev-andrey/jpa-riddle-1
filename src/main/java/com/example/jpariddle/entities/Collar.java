package com.example.jpariddle.entities;

import javax.persistence.*;

@Table(name = "collar")
@Entity
public class Collar {

    @EmbeddedId
    private CollarLabel collarLabel;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CollarLabel getCollarLabel() {
        return collarLabel;
    }

    public void setCollarLabel(CollarLabel collarLabel) {
        this.collarLabel = collarLabel;
    }


}