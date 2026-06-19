package distributed_task_queue.service;

import distributed_task_queue.model.Task;
import distributed_task_queue.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {

        return taskRepository.save(task);
    }
}