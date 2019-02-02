package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.domain.Produto;
import br.com.codenation.aceleradev.rec.loja.util.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.util.SQL;

public class ProdutoDao<T> implements IDao<Produto> {

    private ConnectionFactory connectionFactory;

    public ProdutoDao() {
        this.connectionFactory = (ConnectionFactory) new ConnectionFactory().getConnection();
    }

    @Override
    public List<Produto> findAll() throws SQLException {
        Produto produto = new Produto();
        List<Produto> listProduto= new ArrayList<Produto>();

        String query = "select * from produto";
        ResultSet resultset = this.connectionFactory.getConnection().createStatement().executeQuery(query);

        while (resultset.next()) {
            // produto.setId(resultset.getInt("id"));
            // produto.setNome(resultset.getString("nome"));
            // produto.setId(resultset.getInt("cpf"));

            listProduto.add(produto);
        }
        return listProduto;
    }

    @Override
    public Produto findId(int id) throws SQLException {
        PreparedStatement preparedStatement = null;
        String query = SQL.SELECT_PRODUTO_ID;

        ResultSet resultset =  this.connectionFactory.getConnection().createStatement().executeQuery(query);
        preparedStatement.setInt(1, id);


while (resultset.next()) {

    
}

          return null;
    }

    @Override
    public Produto insert(Produto Tentity) {
        return null;
    }

    @Override
    public Produto update(Produto Tentity) {
        return null;
    }

    @Override
    public Produto Remove(int _id) {
        return null;
    }
    
}