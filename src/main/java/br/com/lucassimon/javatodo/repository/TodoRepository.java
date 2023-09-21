package br.com.lucassimon.javatodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucassimon.javatodo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
