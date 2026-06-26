package distributed_task_queue.dto;

import distributed_task_queue.model.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskResponse {

    private Long id;

    private String type;

    private String payload;

    private TaskStatus status;

}