package com.teplov_pi19_4.teplov_pi19_4.service;

import com.teplov_pi19_4.teplov_pi19_4.entity.Blog;
import com.teplov_pi19_4.teplov_pi19_4.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public void create(Blog blog){
        blogRepository.save(blog);
    }
    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    public Optional<Blog> findById(Long id){
        return blogRepository.findById(id);
    }

    public void updateBlog(Blog blog, Long id) {
        if (findById(id).isPresent()) {
            blog.setId(id);
            blogRepository.save(blog);
        }
    }

    public boolean deleteBlog(Long id) {
        if (findById(id).isPresent()) {
            blogRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAll(){
        blogRepository.deleteAll();
    }

}
