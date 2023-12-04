package controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositorio.EmpleadoRepositorio;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @GetMapping("empleados")
    public List<Empleado> listarTodosLosEmpleados(){
        return repositorio.findAll();
    }
}
