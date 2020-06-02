package com.lsl.zz.service.system;

import com.lsl.zz.VO.PageInfo;
import com.lsl.zz.VO.system.UserRequestVO;
import com.lsl.zz.result.BaseResult;

/**
 * 后台用户service
 * @author shiliang.li
 * @date 2020/6/1
 */
public interface ISysUserService {

    /**
     * 用户列表
     * @param userRequestVO
     * @return
     */
    BaseResult<PageInfo> listUser(UserRequestVO userRequestVO);
}
