package kr_teplov_pi19_4.kr_teplov_pi19_4.controller;

import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.Category;
import kr_teplov_pi19_4.kr_teplov_pi19_4.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping(value = "/api/categories")
    public ResponseEntity<?> create(@RequestBody Category category){
        categoryService.create(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/categories")
    public  ResponseEntity<List<Category>> findAll(){
        final List<Category> categoryList = categoryService.findAll();
        if (categoryList != null) {
            return new ResponseEntity<>(categoryList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/categories/{id}")
    public ResponseEntity<?> find(@PathVariable(name = "id") Long id){
        final Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()) {
            return new ResponseEntity<>(category, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/api/categories/{id}")
    public ResponseEntity<?> updateCategory(@RequestBody Category category, @PathVariable(name = "id")Long id){
        if (categoryService.findById(id).isPresent()) {
            categoryService.updateCategory(category, id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/categories/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable(name = "id") Long id){
        if (categoryService.findById(id).isPresent()){
            categoryService.deleteCategory(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/categories")
    public void deleteAll(){
        categoryService.deleteAll();
    }
}
