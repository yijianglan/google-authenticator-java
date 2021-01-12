package com.example.googleauth.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.googleauth.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: lsl
 * @createDate: 2020/12/22
 */
@Mapper
public interface DemoDao extends BaseMapper<Demo> {

    List<Map<String,Object>> list(Map<String, Object> map);

    int add(Map<String, Object> map);

    int updateInitKey(Map<String, Object> map);

    int updateViceKey(Map<String, Object> map);

    int updateInitLogin(Map<String ,Object> map);
}
