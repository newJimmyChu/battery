package com.example.battery.core.mapper;

import com.example.battery.core.entity.GroRunAlarm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface GroRunAlarmDao extends BaseMapper<GroRunAlarm> {

    List<GroRunAlarm> getGroRunAlarmByGroupBatteryID(int groupBatteryID);
}
