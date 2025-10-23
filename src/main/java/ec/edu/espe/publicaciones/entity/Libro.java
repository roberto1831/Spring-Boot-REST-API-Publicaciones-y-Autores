package ec.edu.espe.publicaciones.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="libros")


public class Libro extends Publicacion {
    private String genero;
    private int numeroPaginas;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

}
