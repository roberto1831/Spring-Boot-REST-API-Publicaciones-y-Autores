package ec.edu.espe.publicaciones.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AutorDTO {
    private String nombre;
    private String apellido;
    private String email;
    private String nacionalidad;
    private String institucion;
    private String orcid;
}

