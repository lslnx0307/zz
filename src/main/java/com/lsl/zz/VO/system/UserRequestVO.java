package com.lsl.zz.VO.system;

import java.io.Serializable;

import com.lsl.zz.VO.BaseRequestVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user request vo
 * @author shiliang.li
 * @date 2020/6/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestVO extends BaseRequestVO implements Serializable {
    private static final long serialVersionUID = 4552651695095786359L;

    private String userName;

    private String loginAccount;
}
