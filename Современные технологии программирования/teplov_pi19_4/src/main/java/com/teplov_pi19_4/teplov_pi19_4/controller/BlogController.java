package com.teplov_pi19_4.teplov_pi19_4.controller;

import com.teplov_pi19_4.teplov_pi19_4.entity.Blog;
import com.teplov_pi19_4.teplov_pi19_4.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    private final BlogService blogService;
    @Autowired
    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }
    
    @PostMapping(value = "/api/blogs")
    public ResponseEntity<?> create(@RequestBody Blog blog){
        blogService.create(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/blogs")
    public  ResponseEntity<List<Blog>> findAll(){
        final List<Blog> blogList = blogService.findAll();
        if (blogList != null) {
            return new ResponseEntity<>(blogList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/blogs/{id}")
    public ResponseEntity<?> find(@PathVariable(name = "id") Long id){
        final Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()) {
            return new ResponseEntity<>(blog, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/api/blogs/{id}")
    public ResponseEntity<?> updateBlog(@RequestBody Blog blog, @PathVariable(name = "id")Long id){
        if (blogService.findById(id).isPresent()) {
            blogService.updateBlog(blog, id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping(value = "/api/blogs/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable(name = "id") Long id){
        if (blogService.findById(id).isPresent()){
            blogService.deleteBlog(id);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/blogs")
    public void deleteAll(){
        blogService.deleteAll();
    }

}
