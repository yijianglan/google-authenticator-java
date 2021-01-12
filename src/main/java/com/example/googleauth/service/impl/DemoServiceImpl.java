package com.example.googleauth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.googleauth.dao.DemoDao;
import com.example.googleauth.entity.Demo;
import com.example.googleauth.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author: fcz
 * @createDate: 2020/12/23
 */
@SuppressWarnings("ALL")
@Transactional
@Service
public class DemoServiceImpl extends ServiceImpl<DemoDao, Demo> implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<Map<String, Object>> list(Map<String, Object> map) {
        return demoDao.list(map);
    }

    @Override
    public int add(Map<String, Object> map) {
        return demoDao.add(map);
    }

    @Override
    public int updateInitKey(Map<String, Object> map) {
        return demoDao.updateInitKey(map);
    }

    @Override
    public int updateViceKey(Map<String, Object> map) {
        return demoDao.updateViceKey(map);
    }

    @Override
    public int updateInitLogin(Map<String, Object> map) {
        map.put("mark","1");
        return demoDao.updateInitLogin(map);
    }


}
