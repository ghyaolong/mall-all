package com.buildinglife.mall.qo;

import com.buildinglife.mall.vo.UserVO;
import com.github.pagehelper.PageInfo;
import lombok.Data;

@Data
public class UserQO {
    private PageInfo pageInfo;
    private UserVO UserVO;
}
