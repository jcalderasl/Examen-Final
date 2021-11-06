
package gt.edu.umg.ExamenFinal.dao;

import gt.edu.umg.ExamenFinal.datos.Departamento;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC
 */
public interface InterDepartamentoDao extends CrudRepository<Departamento,Integer>{
    //esta herredando de crudrepository, y es de tipo departamento y el id es de tipo int
    
}
