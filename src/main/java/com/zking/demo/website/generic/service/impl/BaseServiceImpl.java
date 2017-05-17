package com.zking.demo.website.generic.service.impl;

import com.zking.demo.website.generic.dao.BaseDao;
import com.zking.demo.website.generic.service.BaseService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zk on 17.5.17.
 */
public abstract class BaseServiceImpl<T extends Serializable, ID extends Number> implements BaseService<T, ID> {

    BaseDao<T, ID> baseDao;

    public abstract void setBaseDao(BaseDao<T, ID> baseDao);

    @Override
    public void create(T t) {
        baseDao.create(t);
    }

    @Override
    public List<T> query(String statement, T t) {
        return baseDao.query(statement, t);
    }

    @Override
    public List<T> list() {
        return baseDao.list();
    }

    @Override
    public T search(ID id) {
        return baseDao.search(id);
    }

    @Override
    public void modify(T t) {
        baseDao.modify(t);
    }

    @Override
    public void remove(ID id) {
        baseDao.remove(id);
    }

    @Override
    public List<T> queryByMap(String statement, Map map) {
        return baseDao.queryByMap(statement, map);
    }
}
