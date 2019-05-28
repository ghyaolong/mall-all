package com.buildinglife.mall.malladmin.hystric;

import com.buildinglife.mall.malladmin.service.UserService;
import com.buildinglife.mall.qo.UserQO;
import com.buildinglife.mall.vo.UserVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * UserService断路器
 */
@Component
public class UserServiceHystric implements UserService {
    @Override
    public List<UserVO> findAll(UserQO userQO) {
        return null;
    }
}
