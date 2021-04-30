package org.example.modle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
@ToString

public class User {
    private String username;
    private String password;

}
