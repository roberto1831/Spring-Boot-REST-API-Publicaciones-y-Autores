package ec.edu.espe.publicaciones.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name="articulos")
@Setter
@Getter


public class Articulo extends Publicacion {
    private String areaInvestigacion;
    private String revista;
    private String indexacion;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

}
