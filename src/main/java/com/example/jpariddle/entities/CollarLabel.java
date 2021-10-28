package com.example.jpariddle.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CollarLabel implements Serializable {

    @Column(name = "collar_id", nullable = false)
    private Long collarId;

    @Column(name = "pet_id", nullable = false)
    private Long petId;

    public CollarLabel() {
    }

    public CollarLabel(Long collarId, Long petId) {
        this.collarId = collarId;
        this.petId = petId;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Long getCollarId() {
        return collarId;
    }

    public void setCollarId(Long collarId) {
        this.collarId = collarId;
    }
}