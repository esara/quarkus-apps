package org.acme.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue public  Long id;
    public String title;
    public String url;
    public boolean completed;
    public int order;
}
