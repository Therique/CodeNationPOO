package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.domain.Produto;
import br.com.codenation.aceleradev.rec.loja.util.ConnectionFactory;
import br.com.codenation.aceleradev.rec.loja.util.SQL;

public class ProdutoDao<T> implements IDao<Produto> {


    private ConnectionFactory connectionFactory;
    private SQL sql;

    public ProdutoDao() {

        sql = new SQL();
        this.connectionFactory = new ConnectionFactory();
    }

    @Override
    public List<Produto> findAll() throws SQLException {
        return null;
    }

    @Override
    public Produto findId(int _id) throws SQLException {
        String query = sql.SELECT_PRODUTO_ID;

        ResultSet resultset =  this.connectionFactory.getConnection().createStatement().executeQuery(query);

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