package com.aaa.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/8 14:14
 * @Description
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PermInfo implements Serializable {
    private Integer permId;
    private String resPermName;
}
