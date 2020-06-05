package com.lsl.zz.VO.system;

import java.io.Serializable;

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
public class MenuRequestVO  extends BaseRequestVO implements Serializable {
    private static final long serialVersionUID = -4148676038447207598L;

    private String resourceName;

    private String resourceUrl;

}
