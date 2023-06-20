package dto;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AntiHeroDto {
    private UUID id;

    @NotNull(message = "First Name Required")
    private String firstName;
    private String lastName;
    private String house;
    private String knownAs;
}
