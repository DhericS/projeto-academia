package com.example.NovoTesteCrud.domain.user;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "user_academia")
@Entity(name = "user_academia")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class UserAcad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;
    @NotBlank
    private String telefone;

    public UserAcad(RequestUserAcad requestUserAcad) {
        this.name = requestUserAcad.name();
        this.email = requestUserAcad.email();
        this.senha = requestUserAcad.senha();
    }
}
