package springframework.springrestmvcapi;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class CustomerDTO {

    private UUID id;
    private Integer version;

    @NotBlank
    @NotNull
    private String customerName;
    @NotNull
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
