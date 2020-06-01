package com.lsl.zz.secutiry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.lsl.zz.VO.system.RoleVO;
import com.lsl.zz.VO.system.UserResponseVO;
import com.lsl.zz.exception.ZzException;
import com.lsl.zz.mapper.TSysUserMapper;

/**
 * @author shiliang.li
 * @date 2020/5/28
 */
@Component("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TSysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //todo 1.查找用户
        //todo 2.设置权限
        if (StringUtils.isBlank(username)) {
            throw new ZzException("用户名不可为空", "用户名不可为空");
        }
        UserResponseVO sysUserVO = sysUserMapper.getUserInfoByUserName(username);
        if (null == sysUserVO) {
            throw new ZzException("未找到用户" + username , "用户不存在");
        }
        //权限组
        Collection<GrantedAuthority> grantedAuthorityCollection = new ArrayList<>();
        List<RoleVO> roleList = sysUserVO.getRoleList();
        roleList.forEach(e->{
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(e.getRoleName());
            grantedAuthorityCollection.add(grantedAuthority);
        });

        return new User(username, sysUserVO.getLoginPwd(), grantedAuthorityCollection);
    }
}
