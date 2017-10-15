package com.nstyle.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by mumarm45 on 15/10/2017.
 */
@Entity
public class Employee {

    @Id
    public long id;

    @NotNull
            @Size(min = 3,max = 25)
    public String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)

    private Set<Assessts> assessts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Assessts>  getAssessts() {
        return assessts;
    }

    public void setAssessts(Set<Assessts>  assessts) {
        this.assessts = assessts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assessts=" + assessts +
                '}';
    }
}
