package com.buildinglife.mall.malladmin.service;

import com.buildinglife.mall.malladmin.hystric.UserServiceHystric;
import com.buildinglife.mall.qo.UserQO;
import com.buildinglife.mall.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "user-service",fallback = UserServiceHystric.class)
public interface UserService {

    @RequestMapping(value = "/user/findAll",method = RequestMethod.POST)
    List<UserVO> findAll(@RequestBody UserQO userQO);
}
