package inurymbetov.com.github.diplomka.entity;

import inurymbetov.com.github.diplomka.dao.AbDao;
import inurymbetov.com.github.diplomka.enums.Rule;
import lombok.Data;

@Data
public class User extends AbDao {

    private int         id;

    private String      fullName;

    private String      phone;

    private String      login;

    private String      password;

    private Rule        rule;

    @Override
    protected void mapper() {

    }
}
