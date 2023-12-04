package repositorio;

import modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
