package com.example.dockerfileex;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Entity
@Table(name = "users")
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public UserEntity() {}
    public UserEntity(String name) { this.name = name; }
    public Long getId() { return id; }
    public String getName() { return name; }
}

