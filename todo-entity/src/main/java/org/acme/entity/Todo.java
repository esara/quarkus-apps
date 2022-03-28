package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Todo extends PanacheEntity {
    public String title;
    public String url;
    public boolean completed;
    public int order;

    public static List<Todo> findNotCompleted() {
        return list("completed", false);
    }

    public static List<Todo> search(String word, Integer pageIndex) {
        return find("completed", false).page(pageIndex, 3).list();
    }
}
