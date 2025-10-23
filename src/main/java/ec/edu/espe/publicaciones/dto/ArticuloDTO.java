package ec.edu.espe.publicaciones.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArticuloDTO {
    //Atributo del padre
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String isbn;
    private String resumen;

    //Atributos propios de articulo
    private String areaInvestigacion;
    private String revista;
    private String indexacion;
    private Long idAutor;

}
