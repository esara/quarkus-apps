package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class TodoRepo implements PanacheRepository<Todo> {
    public List<Todo> findNotCompleted() {
        return list("completed", false);
    }

    public List<Todo> search(String word, Integer pageIndex) {
        return find("completed", false).page(pageIndex, 3).list();
    }
}