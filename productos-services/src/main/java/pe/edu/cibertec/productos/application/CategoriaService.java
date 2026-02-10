package pe.edu.cibertec.productos.application;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.productos.infrastructure.CategoriaRepository;
import pe.edu.cibertec.productos.domain.Categoria;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository repo;

    // Constructor para inyectar el repositorio
    public CategoriaService(CategoriaRepository repo) {
        this.repo = repo;
    }

    // Metodo para listar todas las categorías
    //public List<Categoria> listar() {
        //return repo.findAll();
    //}

    //Prueba
    public List<Categoria> listar() {
        List<Categoria> categorias = repo.findAll();
        System.out.println("Categorias encontradas: " + categorias.size());
        return categorias;
    }

}
