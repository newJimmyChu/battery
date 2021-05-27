package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroupBatteryHis;
import com.example.battery.core.mapper.GroupBatteryDao;
import com.example.battery.core.mapper.GroupBatteryHisDao;
import com.example.battery.core.service.GroupBatteryHisService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@Service
public class GroupBatteryHisServiceImpl extends ServiceImpl<GroupBatteryHisDao, GroupBatteryHis> implements GroupBatteryHisService {
    @Autowired
    private GroupBatteryHisDao groupBatteryHisDao;
    @Override
    public List<GroupBatteryHis> getGroupBatteryHistByGroupBatteryID(int GroupBatteryID){
        return groupBatteryHisDao.getGroupBatteryHistByGroupBatteryID(GroupBatteryID);
    }
}
