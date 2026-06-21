package distributed_task_queue.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateTaskRequest {
    @NotBlank
    private String type;

    private String payload;
}