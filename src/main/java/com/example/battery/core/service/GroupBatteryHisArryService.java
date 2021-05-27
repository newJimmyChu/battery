package com.example.battery.core.service;

import com.example.battery.core.entity.GroupBatteryHis;
import com.example.battery.core.entity.GroupBatteryHisArry;
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
public interface GroupBatteryHisArryService extends IService<GroupBatteryHisArry> {
    List<GroupBatteryHisArry> getGroupBatteryHistArryByGroupBatteryHisID(int GroupBatteryHisID);
}
