package org.example;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private int edad;
}
