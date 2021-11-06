/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ExamenFinal.datos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author PC
 */
@Data // sirve para generar los get and set y otras funcionalidades mas
@Entity //convertimos en edentidad
@Table(name = "tb_profesion")
public class Profesion implements Serializable {

    private static final long serialVersionUI = 1L;
    //aquí le decimos que es la llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PROFESION;
    
    @NotEmpty
    private String DESCRIPCION_PROFESION;

}
