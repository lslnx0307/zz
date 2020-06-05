package com.lsl.zz.service.system;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsl.zz.VO.PageInfo;
import com.lsl.zz.VO.system.UserRequestVO;
import com.lsl.zz.VO.system.UserResponseVO;
import com.lsl.zz.mapper.TSysUserMapper;
import com.lsl.zz.model.TSysUser;
import com.lsl.zz.result.BaseResult;

import lombok.extern.slf4j.Slf4j;

/**
 * 后台用户service
 * @author shiliang.li
 * @date 2020/6/1
 */
@Slf4j
@Service
public class ISysUserService {

    @Autowired
    private TSysUserMapper tSysUserMapper;
    /**
     * 用户列表
     * @param userRequestVO
     * @return
     */
    public BaseResult<PageInfo> listUser(UserRequestVO userRequestVO){
        userRequestVO.parsePage();
        List<UserResponseVO> userResponseVOS = tSysUserMapper.listUser(userRequestVO);
        Integer count = tSysUserMapper.countUser(userRequestVO);
        PageInfo page = new PageInfo(userResponseVOS, count);
        return BaseResult.success(page);
    }

    /**
     * 新增用户
     * @param userRequestVO
     * @return
     */
    public BaseResult addUser(UserRequestVO userRequestVO) {
        try {
            TSysUser tSysUser = new TSysUser();
            BeanUtils.copyProperties(userRequestVO, tSysUser);
            int addFlag = tSysUserMapper.insertSelective(tSysUser);
            return addFlag == 1 ? BaseResult.success("用户添加成功") : BaseResult.success("用户添加失败");
        }catch (Exception e) {
            log.error("ISysUserService addUser exception{}", e);
            return BaseResult.success("用户添加异常");
        }
    }
}
