package com.example.battery.core.mapper;

import com.example.battery.core.entity.GroupBattery;
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
public interface GroupBatteryDao extends BaseMapper<GroupBattery> {

    List<GroupBattery> getGroupBatteryByContrallerID(int contrallerID);
}
