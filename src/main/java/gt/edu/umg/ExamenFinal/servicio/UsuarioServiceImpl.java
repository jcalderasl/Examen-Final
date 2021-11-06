/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ExamenFinal.servicio;

import gt.edu.umg.ExamenFinal.dao.InterUsuarioDao;
import gt.edu.umg.ExamenFinal.datos.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author PC
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {//es una capa intermedia entre el dao  que es lo que se conecta a la bd

    @Autowired
    private InterUsuarioDao InterUsuarioDao;

    @Override
    @Transactional(readOnly = true)//este metodo se conecta a la base de datos pero que no haya transaciones sole lecturas
    public List<Usuario> listar() {
        return (List<Usuario>) InterUsuarioDao.findAll();
    }

    @Override
    @Transactional//es para usar el roldback y el commit
    public void guardar(Usuario usuario) {
        InterUsuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {
        InterUsuarioDao.delete(usuario);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Usuario encontrar(Usuario usuario) {
        return InterUsuarioDao.findById(usuario.getID_USUARIO()).orElse(null);
    }

}
