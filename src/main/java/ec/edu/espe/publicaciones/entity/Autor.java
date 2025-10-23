package ec.edu.espe.publicaciones.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name="autores")
@Setter
@Getter


public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;
    private String apellido;
    private String email;
    private String nacionalidad;
    private String orcid;
    private String institucion;

    @OneToMany (mappedBy = "autor")
    private List<Libro> libros;


    @OneToMany (mappedBy = "autor")
    private List<Articulo> articulos;


}
