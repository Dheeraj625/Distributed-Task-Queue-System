package distributed_task_queue.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String payload;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private Integer retryCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}