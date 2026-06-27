package distributed_task_queue.service;

import distributed_task_queue.dto.CreateTaskRequest;
import distributed_task_queue.dto.TaskResponse;
import distributed_task_queue.model.Task;
import distributed_task_queue.model.TaskStatus;
import distributed_task_queue.repository.TaskRepository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import distributed_task_queue.dto.CreateTaskRequest;
import distributed_task_queue.model.TaskStatus;
import java.time.LocalDateTime;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskResponse createTask(CreateTaskRequest request) {

        Task task = new Task();

        task.setType(request.getType());
        task.setPayload(request.getPayload());

        task.setStatus(TaskStatus.CREATED);

        task.setRetryCount(0);

        task.setCreatedAt(LocalDateTime.now());

        task.setUpdatedAt(LocalDateTime.now());

        //return taskRepository.save(task);jgjh
        Task savedTask = taskRepository.save(task);

        TaskResponse response = new TaskResponse(
        savedTask.getId(),
        savedTask.getType(),
        savedTask.getPayload(),
        savedTask.getStatus()
        );
        return response;
    }
}