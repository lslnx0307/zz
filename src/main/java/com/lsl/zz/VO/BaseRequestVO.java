package com.lsl.zz.VO;

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
public class BaseRequestVO implements Serializable {
    private static final long serialVersionUID = -9202128946977285614L;

    private Integer pageSize;

    private Integer pageNo;

    private Integer limit;

    private Integer offset;

    public void parsePage() {
        if (pageNo == null || pageNo < 0) {
            pageNo = 1;
        }
        if (pageSize == null || pageSize < 10) {
            pageSize = 10;
        }
        this.limit = pageSize;
        this.offset = (pageNo - 1) * pageSize;
    }

}
