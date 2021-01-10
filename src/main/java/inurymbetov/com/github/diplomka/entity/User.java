package inurymbetov.com.github.diplomka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer     id;
    private String      firstName;
    private String      secondName;
    private String      login;
    private String      password;
    private String      phone;
    private Integer     role;
}

