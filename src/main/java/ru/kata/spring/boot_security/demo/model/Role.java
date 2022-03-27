package ru.kata.spring.boot_security.demo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "authorities")
public class Role implements GrantedAuthority {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "authority")
    private String role;

    @Override
    public String getAuthority() {
        return role;
    }

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role.replace("ROLE_", "");
    }
}
