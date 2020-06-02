package com.lsl.zz.VO;

import java.io.Serializable;
import java.util.List;

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
public class PageInfo<E> implements Serializable {

    private static final long serialVersionUID = 5030105231639811861L;
    private List<E> list;

    private Integer count;


}
