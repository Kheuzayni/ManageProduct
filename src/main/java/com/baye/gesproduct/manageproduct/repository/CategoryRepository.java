package com.baye.gesproduct.manageproduct.repository;

import com.baye.gesproduct.manageproduct.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(path = "cat")
@CrossOrigin(origins = "http://localhost:3000/") //pour autoriser angular
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
