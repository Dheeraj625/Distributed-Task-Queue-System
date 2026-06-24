package distributed_task_queue.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter
@Setter
public class CreateTaskRequest {
    @NotBlank
    private String type;
    @NotBlank
    @Size(max = 10000)
    private String payload;
}