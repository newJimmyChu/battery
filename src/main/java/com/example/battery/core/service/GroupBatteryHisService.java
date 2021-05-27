package com.example.battery.core.service;

import com.example.battery.core.entity.GroupBatteryHis;
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
public interface GroupBatteryHisService extends IService<GroupBatteryHis> {
    List<GroupBatteryHis> getGroupBatteryHistByGroupBatteryID(int GroupBatteryID);
}
