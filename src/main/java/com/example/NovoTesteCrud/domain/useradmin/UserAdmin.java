package com.example.NovoTesteCrud.domain.useradmin;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "user_admin")
@Entity(name = "user_admin")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class UserAdmin {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;

    public UserAdmin(RequestUserAdmin requestUserAdmin){
        this.name = requestUserAdmin.name();
        this.email = requestUserAdmin.email();
        this.senha = requestUserAdmin.senha();
    }
}
