package br.com.codenation.aceleradev.rec.loja.dao;

import java.util.Collection;
import java.util.List;

public interface IDao<T> extends Collection<T> {
    
List<T> findAll();
T findId();

T insert(T Tentity);
T update(T Tentity);
T Remove(int _id);

}
