package com.nstyle.Model;

import javax.persistence.*;

/**
 * Created by mumarm45 on 15/10/2017.
 */

@Entity
public class Assessts {

    @Id
    long id;

    String title;


    @ManyToOne
    @JoinColumn(name = "employee_id")
    Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Assessts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
