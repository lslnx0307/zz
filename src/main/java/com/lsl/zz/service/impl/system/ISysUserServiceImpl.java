package com.lsl.zz.service.impl.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lsl.zz.VO.system.UserRequestVO;
import com.lsl.zz.VO.system.UserResponseVO;
import com.lsl.zz.mapper.TSysUserMapper;
import com.lsl.zz.result.BaseResult;
import com.lsl.zz.service.system.ISysUserService;

/**
 * @author shiliang.li
 * @date 2020/6/1
 */
@Service
public class ISysUserServiceImpl implements ISysUserService {

    @Autowired
    private TSysUserMapper tSysUserMapper;

    @Override
    public BaseResult<PageInfo> listUser(UserRequestVO userRequestVO) {
        PageHelper.startPage(userRequestVO.getPageNo(), userRequestVO.getPageSize());
        List<UserResponseVO> userResponseVOS = tSysUserMapper.listUser(userRequestVO);
        PageInfo page = new PageInfo(userResponseVOS);
        return BaseResult.success(page);
    }
}
