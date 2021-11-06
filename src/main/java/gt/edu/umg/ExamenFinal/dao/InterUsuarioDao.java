/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ExamenFinal.dao;

import gt.edu.umg.ExamenFinal.datos.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC
 */
public interface InterUsuarioDao extends CrudRepository<Usuario,Integer>{
    //esta herredando de crudrepository, y es de tipo usuario y el id es de tipo int
}
