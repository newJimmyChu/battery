package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroupBattery;
import com.example.battery.core.mapper.GroupBatteryDao;
import com.example.battery.core.service.GroupBatteryService;
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
public class GroupBatteryServiceImpl extends ServiceImpl<GroupBatteryDao, GroupBattery> implements GroupBatteryService {
    @Autowired
    private GroupBatteryDao groupBatteryDao;
    @Override
    public List<GroupBattery> getGroupBatteryByContrallerID(int ContrallerID){
        return groupBatteryDao.getGroupBatteryByContrallerID(ContrallerID);
    }
}
