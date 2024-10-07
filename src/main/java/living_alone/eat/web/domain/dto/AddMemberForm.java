package living_alone.eat.web.domain.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddMemberForm {

    @NotEmpty(message = "{required.id}")
    private String loginId;

    @NotEmpty(message = "{required.password}")
    @Size(min = 4, max = 16, message = "{size.password}")
    private String password;

    @NotEmpty(message = "{required.name}")
    private String username;

    private String city;
    private String street;
    private String zipcode;
}