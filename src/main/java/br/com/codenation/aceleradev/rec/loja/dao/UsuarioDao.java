package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.domain.Usuario;
import br.com.codenation.aceleradev.rec.loja.util.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.util.SQL;

public class UsuarioDao<T> implements IDao<Usuario> {

    private ConnectionFactory connectionFactory;

    public UsuarioDao() {

        this.connectionFactory = (ConnectionFactory) new ConnectionFactory().getConnection();
    }

    public Usuario Acess(String cpf) throws SQLException {

        Usuario usuario = null;
        PreparedStatement preparedStatement = null;

        ResultSet resultset = this.connectionFactory.getConnection().createStatement().executeQuery(SQL.SELECT_USUARIO_CPF);
        preparedStatement.setString(1, cpf);

        while (resultset.next()) {
            usuario = new Usuario();
            usuario.setId(resultset.getInt("id"));
            usuario.setNome(resultset.getString("nome"));
            usuario.setId(resultset.getInt("cpf"));
        }
        this.connectionFactory.getConnection().close();
        return usuario;

    }

    @Override
    public List<Usuario> findAll() throws SQLException {
        Usuario usuario = new Usuario();
        List<Usuario> listUsuario = new ArrayList<Usuario>();

        String query = "select * from usuario";
        ResultSet resultset = this.connectionFactory.getConnection().createStatement().executeQuery(query);

        while (resultset.next()) {
            usuario.setId(resultset.getInt("id"));
            usuario.setNome(resultset.getString("nome"));
            usuario.setId(resultset.getInt("cpf"));

            listUsuario.add(usuario);
        }
        return listUsuario;
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

    @Override
    public Usuario findId(int _id) throws SQLException {
        return null;
    }

}