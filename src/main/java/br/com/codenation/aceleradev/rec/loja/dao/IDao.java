package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface IDao<T>  {
    
List<T> findAll() throws SQLException;
T findId();
T insert(T Tentity);
T update(T Tentity);
T Remove(int _id);

}
