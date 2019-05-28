package com.buildinglife.mall.userservice.controller;

import com.buildinglife.mall.dao.TbUserMapper;
import com.buildinglife.mall.enums.ExceptionCode;
import com.buildinglife.mall.po.TbUser;
import com.buildinglife.mall.qo.UserQO;
import com.buildinglife.mall.vo.BizException;
import com.buildinglife.mall.vo.UserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import utils.MyBeanUtils;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TbUserMapper tbUserMapper;

    /**
     * 查询所有用户
     * @return
     */
    @PostMapping("/getAll")
    public PageInfo<UserVO> findAll(@RequestBody UserQO userQO){
        UserVO userVO = userQO.getUserVO();
        PageInfo pageInfo = userQO.getPageInfo();
        if(pageInfo!=null){
            PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize(),true);
            Example example = new Example(TbUser.class);
            if(userVO!=null){
                Example.Criteria criteria = example.createCriteria();
                if(StringUtils.isNotEmpty(userVO.getUsername())){
                    criteria.andLike("username",userVO.getUsername());
                }
                if(StringUtils.isNotEmpty(userVO.getEmail())){
                    criteria.andEqualTo("email",userVO.getEmail());
                }
                if (StringUtils.isNotEmpty(userVO.getPhone())){
                    criteria.andLike("phone",userVO.getPhone());
                }
                if (userVO.getState()!=null){
                    criteria.andEqualTo("state",userVO.getState());
                }
                if (userVO.getRoleId()!=null){
                    criteria.andEqualTo("roleId",userVO.getRoleId());
                }
            }
            List<TbUser> tbUsers = tbUserMapper.selectByExample(example);
            List<UserVO> userVOS = MyBeanUtils.copyList(tbUsers, UserVO.class,new String[]{"password"});
            return new PageInfo<UserVO>(userVOS);
        }
        return null;
    }

    @PostMapping("/login")
    public void login(String username,String password){
         if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
             throw new BizException(ExceptionCode.REQUEST_PARAM_ERROR);
         }
         Example example = new Example(TbUser.class);
         example.createCriteria().andEqualTo("username",username).andEqualTo("password",password);
        TbUser tbUser = tbUserMapper.selectOneByExample(example);
        if(tbUser!=null){
            //todo 登录成功
        }else{
            //todo 用户名或密码不正确
        }
    }

}
