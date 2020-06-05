package com.lsl.zz.VO.system;

import com.lsl.zz.VO.BaseRequestVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiliang.li
 * @date 2020/6/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleRequestVO extends BaseRequestVO {
    private static final long serialVersionUID = 1186554273319850752L;

    private String roleName;
}
