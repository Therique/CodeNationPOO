package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T>  {
    
List<T> findAll() throws SQLException, Exception;
T findId(int _id) throws SQLException;
T insert(T Tentity);
T update(T Tentity);
T Remove(int _id);

}
