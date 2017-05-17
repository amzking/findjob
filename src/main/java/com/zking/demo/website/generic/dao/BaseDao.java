package com.zking.demo.website.generic.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zk on 17.5.17.
 */
public interface BaseDao<T extends Serializable, ID extends Number> {

    void create(T t);

    List<T> query(String statement, T t);

    List<T> list();

    T search(ID id);

    void modify(T t);

    void remove(ID id);

    public List<T> queryByMap(String statement, Map map);
}
