package com.z8q.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "numbers")
public class ArrayModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "numArray can't be empty")
    private int[] numArray;
    @NotBlank(message = "number can't be empty")
    private int number;

    public ArrayModel() {}

    public ArrayModel(int[] numArray, int number) {
        this.numArray = numArray;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int[] getNumArray() {
        return numArray;
    }

    public void setNumArray(int[] numArray) {
        this.numArray = numArray;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
