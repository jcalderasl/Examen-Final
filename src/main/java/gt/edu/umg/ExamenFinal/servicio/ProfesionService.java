/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ExamenFinal.servicio;

import gt.edu.umg.ExamenFinal.datos.Profesion;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ProfesionService {
    public List<Profesion> listar();
    public void guardar(Profesion profesion);
    public void eliminar(Profesion profesion);
    public Profesion encontrar(Profesion profesion);
    public long contar();
}
