package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroupBatteryHisArry;
import com.example.battery.core.mapper.GroupBatteryHisArryDao;
import com.example.battery.core.service.GroupBatteryHisArryService;
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
public class GroupBatteryHisArryServiceImpl extends ServiceImpl<GroupBatteryHisArryDao, GroupBatteryHisArry> implements GroupBatteryHisArryService {
    @Autowired
    private GroupBatteryHisArryDao groupBatteryHisArryDao;
    @Override
    public List<GroupBatteryHisArry> getGroupBatteryHistArryByGroupBatteryHisID(int GroupBatteryHisID){
        return groupBatteryHisArryDao.getGroupBatteryHistArryByGroupBatteryHisID(GroupBatteryHisID);
    }
}
