package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.domain.Usuario;
import br.com.codenation.aceleradev.rec.loja.util.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.util.SQL;

public class UsuarioDao<T> implements IDao<Usuario> {

    private ConnectionFactory connectionFactory;
    private SQL sql;

    public UsuarioDao() {

        sql = new SQL();
        this.connectionFactory = new ConnectionFactory();
    }

    public boolean Acess() throws  SQLException{
        return   this.connectionFactory.getConnection().createStatement().execute(sql.SELECT_USUARIO_CPF);

    }

    @Override
    public List<Usuario> findAll() throws SQLException {
        
      //  this.connectionFactory.getConnection().createStatement().execute(sql.SELECT_USUARIO_CPF);


        return null;

    }

    @Override
    public Usuario findId() {
        return null;
    }

    @Override
    public Usuario insert(Usuario Tentity) {
        return null;
    }

    @Override
    public Usuario update(Usuario Tentity) {
        return null;
    }

    @Override
    public Usuario Remove(int _id) {
        return null;
    }
    
}