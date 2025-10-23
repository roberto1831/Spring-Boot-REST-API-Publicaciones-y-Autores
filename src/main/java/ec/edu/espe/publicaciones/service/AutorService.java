package ec.edu.espe.publicaciones.service;


import ec.edu.espe.publicaciones.dto.AutorDTO;
import ec.edu.espe.publicaciones.dto.ResponseDTO;
import ec.edu.espe.publicaciones.entity.Autor;
import ec.edu.espe.publicaciones.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    //Crear un nuevo autor
    public ResponseDTO crearAutor(AutorDTO dto) {
        Autor autor = new Autor();
        autor.setNombre(dto.getNombre());
        autor.setApellido(dto.getApellido());
        autor.setEmail(dto.getEmail());
        autor.setInstitucion(dto.getInstitucion());
        autor.setOrcid(dto.getOrcid());
        autor.setNacionalidad(dto.getNacionalidad());



        Autor savedAutor = autorRepository.save(autor);
        return new ResponseDTO("Autor registrado exitosamente",savedAutor);


    }
    //Buscar por ID
    public ResponseDTO buscarAutorPorId(Long id) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Autor no encontrado"));
        return new ResponseDTO("Autor con id encontrado",autor);

    }

    //Actualizar autor
    public ResponseDTO actualizarAutor(Long id, AutorDTO dto) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Autor no encontrado"));
        autor.setNombre(dto.getNombre());
        autor.setApellido(dto.getApellido());
        autor.setEmail(dto.getEmail());
        autor.setInstitucion(dto.getInstitucion());
        autor.setOrcid(dto.getOrcid());
        autor.setNacionalidad(dto.getNacionalidad());


        return new ResponseDTO("Autor actualizado exitosamente",
                autorRepository.save(autor));

    }


    //Eliminar autor
    public ResponseDTO eliminarAutor(Long id) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Autor no encontrado"));
        autorRepository.delete(autor);
        return new ResponseDTO("Autor eliminado exitosamente",id);
    }


    //Listar todos los autores
    public ResponseDTO listarAutores() {
        List<Autor> autores = autorRepository.findAll();
        int totalAutores = autores.size();
        return new ResponseDTO("Se encontraron: " + totalAutores + "autores",autores);
    }

    public List<Autor> listarTodos() {

        return autorRepository.findAll();
    }
}
