package com.lsl.zz.VO.system;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiliang.li
 * @date 2020/6/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO implements Serializable {

    private static final long serialVersionUID = 1732918894372560826L;
    private String resourceUrl;

    private String resourceName;
}
