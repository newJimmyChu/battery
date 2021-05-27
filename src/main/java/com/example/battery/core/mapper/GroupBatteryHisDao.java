package com.example.battery.core.mapper;

import com.example.battery.core.entity.GroupBatteryHis;
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
public interface GroupBatteryHisDao extends BaseMapper<GroupBatteryHis> {

    List<GroupBatteryHis> getGroupBatteryHistByGroupBatteryID(int groupBatteryID);
}
