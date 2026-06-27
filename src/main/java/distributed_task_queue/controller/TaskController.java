package distributed_task_queue.controller;

import distributed_task_queue.dto.CreateTaskRequest;
import distributed_task_queue.dto.TaskResponse;
import distributed_task_queue.model.Task;
import distributed_task_queue.service.TaskService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public TaskResponse createTask( @Valid @RequestBody CreateTaskRequest request) {
        return taskService.createTask(request);
    }
}
