package app.user;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRest {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
