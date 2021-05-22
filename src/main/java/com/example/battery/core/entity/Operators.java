package com.example.battery.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Operators implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    private String OpName;

    private String LoginName;

    private String OpPassword;

    private Integer CustomerID;

    private Integer Level;


}
