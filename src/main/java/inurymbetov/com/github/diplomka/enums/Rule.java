package inurymbetov.com.github.diplomka.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum Rule {

    USER(1),
    ADMIN(2),
    TEACHER(3);

    private int id;

    public static Rule getRule(int id){
        return Arrays.stream(Rule.values()).filter(rule -> rule.id == id).findAny().orElse(USER);
    }
}
