package penterest_spring.demo.web.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * User의 권한을 설정하기 위한 enum class
 */
@AllArgsConstructor
@Getter
public enum Role {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private String value;

}
