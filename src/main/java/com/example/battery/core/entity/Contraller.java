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

@EqualsAndHashCode(callSuper = false)
@Data
public class Contraller implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    private String ContrallerName;

    private Integer CustomerID;

    private String QHDM;

    private Float PosX;

    private Float PosY;


}
