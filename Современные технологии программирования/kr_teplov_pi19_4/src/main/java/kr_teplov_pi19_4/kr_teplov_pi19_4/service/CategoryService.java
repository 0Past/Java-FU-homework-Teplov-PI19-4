package kr_teplov_pi19_4.kr_teplov_pi19_4.service;


import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.Category;
import kr_teplov_pi19_4.kr_teplov_pi19_4.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public void create(Category category){
        categoryRepository.save(category);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }

    public void updateCategory(Category category, Long id){
        if (findById(id).isPresent()){
            category.setId(id);
            categoryRepository.save(category);
        }
    }
    public boolean deleteCategory(Long id) {
        if (findById(id).isPresent()) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAll(){
        categoryRepository.deleteAll();
    }
}
