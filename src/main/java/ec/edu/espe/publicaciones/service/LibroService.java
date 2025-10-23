package ec.edu.espe.publicaciones.service;

import ec.edu.espe.publicaciones.dto.LibroDTO;
import ec.edu.espe.publicaciones.dto.ResponseDTO;
import ec.edu.espe.publicaciones.entity.Autor;
import ec.edu.espe.publicaciones.entity.Libro;
import ec.edu.espe.publicaciones.repository.AutorRepository;
import ec.edu.espe.publicaciones.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    AutorRepository autorRepository;

    public ResponseDTO crearLibro(LibroDTO dto){

        Autor autor = autorRepository.findById(dto.getIdAutor())
                .orElseThrow(()->new RuntimeException("Autor no encontrado"));

        Libro libro = new Libro();
        libro.setAutor(autor);
        libro.setTitulo(dto.getTitulo());
        libro.setResumen(dto.getResumen());
        libro.setEditorial(dto.getEditorial());
        libro.setIsbn(dto.getIsbn());
        libro.setAnioPublicacion(dto.getAnioPublicacion());
        libro.setEditorial(dto.getEditorial());
        libro.setNumeroPaginas(dto.getNumeroPaginas());
        libro.setGenero(dto.getGenero());
        return new ResponseDTO("Libro registrado exitosamente",libroRepository.save(libro));



    }
}
