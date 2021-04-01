package kr_teplov_pi19_4.kr_teplov_pi19_4.service;

import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.Task;
import kr_teplov_pi19_4.kr_teplov_pi19_4.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void create(Task task){
        taskRepository.save(task);
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id){
        return taskRepository.findById(id);
    }

    public void updateTask(Task task, Long id){
        if (findById(id).isPresent()){
            task.setId(id);
            taskRepository.save(task);
        }
    }
    public boolean deleteTask(Long id) {
        if (findById(id).isPresent()) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAll(){
        taskRepository.deleteAll();
    }
}
