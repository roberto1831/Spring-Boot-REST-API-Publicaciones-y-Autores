package ec.edu.espe.publicaciones.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LibroDTO {
    //atributos clase padre
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String isbn;
    private String resumen;
    //atributos propios de libro
    private String genero;
    private int numeroPaginas;
    private Long idAutor;
}
