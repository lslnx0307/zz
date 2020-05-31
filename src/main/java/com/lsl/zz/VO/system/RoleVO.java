package com.lsl.zz.VO.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 角色的vo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleVO implements Serializable {

    private static final long serialVersionUID = 3621028377019949889L;
    private Integer roleId;

    private String roleName;
}
