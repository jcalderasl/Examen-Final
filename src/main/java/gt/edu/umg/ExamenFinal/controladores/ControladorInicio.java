
package gt.edu.umg.ExamenFinal.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author PC
 */
@Controller// Este componente es el que responde a la interacción que hace el usuario en la interfaz 
public class ControladorInicio {

    @GetMapping("/")//nos permite simplificar el manejo de los diferentes métodos de Spring 
    public String inicio() {
        return "index";
    }

  
}
