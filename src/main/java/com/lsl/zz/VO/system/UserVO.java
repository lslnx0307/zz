package com.lsl.zz.VO.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户的所有信息vo
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO implements Serializable {

    private static final long serialVersionUID = 3126486162688765770L;
    private Integer id;

    private String loginAccount;

    private String realName;

    private String loginPwd;

    private Date lastLogin;

    private Boolean lock;

    private List<RoleVO> roleList;


}
