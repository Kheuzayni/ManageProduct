package com.baye.gesproduct.manageproduct.restcontrollers;

import com.baye.gesproduct.manageproduct.entities.Category;
import com.baye.gesproduct.manageproduct.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class categorieRESTcontroller {
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(method= RequestMethod.GET)
    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Category getCategorieById(@PathVariable("id") Long id) {
        return categoryRepository.findById(id).get();
    }
}
