package com.example.battery.core.mapper;

import com.example.battery.core.entity.GroupBatteryHisArry;
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
public interface GroupBatteryHisArryDao extends BaseMapper<GroupBatteryHisArry> {

    List<GroupBatteryHisArry> getGroupBatteryHistArryByGroupBatteryHisID(int groupBatteryHisID);
}
