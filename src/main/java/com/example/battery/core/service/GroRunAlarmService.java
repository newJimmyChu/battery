package com.example.battery.core.service;

import com.example.battery.core.entity.GroRunAlarm;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.battery.core.entity.GroRunEvent;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface GroRunAlarmService extends IService<GroRunAlarm> {
    List<GroRunAlarm> getGroRunAlarmByGroupBatteryID(int GroupBatteryID);
}
