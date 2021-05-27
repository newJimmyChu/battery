package com.example.battery.core.service;

import com.example.battery.core.entity.GroupBattery;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface GroupBatteryService extends IService<GroupBattery> {
    List<GroupBattery> getGroupBatteryByContrallerID(int ContrallerID);
}
