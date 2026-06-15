package distributed_task_queue.repository;

import distributed_task_queue.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository
        extends JpaRepository<Task, Long> {

}
