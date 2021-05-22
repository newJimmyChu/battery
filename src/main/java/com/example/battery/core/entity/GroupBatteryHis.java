package com.example.battery.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class GroupBatteryHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    private Integer GroupBatteryID;

    private Integer runState;

    private Float groCurrent;

    private Float groVoltage;

    private Float BalanceDegree;

    private LocalDateTime DataTime;

    private Float DefVoltage;


}
