package com.example.googleauth.service;

import java.util.List;
import java.util.Map;

/**
 * @author: fcz
 * @createDate: 2020/12/23
 */
public interface DemoService {

    List<Map<String,Object>> list(Map<String, Object> map);

    int add(Map<String, Object> map);

    int updateInitKey(Map<String, Object> map);

    int updateViceKey(Map<String, Object> map);

    int updateInitLogin(Map<String ,Object> map);
}
