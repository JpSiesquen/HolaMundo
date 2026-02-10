package pe.edu.cibertec.productos.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.productos.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
