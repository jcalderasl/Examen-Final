/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ExamenFinal.dao;

import gt.edu.umg.ExamenFinal.datos.Profesion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC
 */
public interface InterProfesionDao extends CrudRepository<Profesion,Integer>{
    //esta herredando de crudrepository, y es de tipo profesion y el id es de tipo int
    
}
