package ec.edu.espe.publicaciones.repository;

import ec.edu.espe.publicaciones.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository  extends JpaRepository<Articulo, Long> {
}
