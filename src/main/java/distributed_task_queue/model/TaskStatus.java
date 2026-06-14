package distributed_task_queue.model;

public enum TaskStatus {
    CREATED,
    QUEUED,
    PROCESSING,
    COMPLETED,
    FAILED
}