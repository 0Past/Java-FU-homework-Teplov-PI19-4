package kr_teplov_pi19_4.kr_teplov_pi19_4.controller;

import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.Task;
import kr_teplov_pi19_4.kr_teplov_pi19_4.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping(value = "/api/tasks")
    public ResponseEntity<?> create(@RequestBody Task task){
        taskService.create(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/tasks")
    public  ResponseEntity<List<Task>> findAll(){
        final List<Task> taskList = taskService.findAll();
        if (taskList != null) {
            return new ResponseEntity<>(taskList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/tasks/{id}")
    public ResponseEntity<?> find(@PathVariable(name = "id") Long id){
        final Optional<Task> task = taskService.findById(id);
        if (task.isPresent()) {
            return new ResponseEntity<>(task, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/api/tasks/{id}")
    public ResponseEntity<?> updateTask(@RequestBody Task task, @PathVariable(name = "id")Long id){
        if (taskService.findById(id).isPresent()) {
            taskService.updateTask(task, id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/tasks/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable(name = "id") Long id){
        if (taskService.findById(id).isPresent()){
            taskService.deleteTask(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/api/tasks")
    public void deleteAll(){
        taskService.deleteAll();
    }
}
