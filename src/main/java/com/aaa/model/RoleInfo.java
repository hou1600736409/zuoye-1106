package com.aaa.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/8 14:14
 * @Description
 */
@Setter
@Getter
@EqualsAndHashCode
public class RoleInfo implements Serializable {
    private Integer roleId;
    private String roleName;
}
