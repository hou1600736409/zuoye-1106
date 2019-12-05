package com.aaa.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Author: 王晶晶
 * @Date: 2019/11/8 14:12
 * @Description
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User implements Serializable {
    private Long userId;
    private String userName;
    private String userPassword;
    private Integer userStatus;
}
