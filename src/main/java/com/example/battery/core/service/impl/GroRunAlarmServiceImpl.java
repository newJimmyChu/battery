package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroRunAlarm;
import com.example.battery.core.entity.GroRunEvent;
import com.example.battery.core.mapper.GroRunAlarmDao;
import com.example.battery.core.mapper.GroRunEventDao;
import com.example.battery.core.service.GroRunAlarmService;
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
public class GroRunAlarmServiceImpl extends ServiceImpl<GroRunAlarmDao, GroRunAlarm> implements GroRunAlarmService {
    @Autowired
    private GroRunAlarmDao groRunAlarmDao;
    @Override
    public List<GroRunAlarm> getGroRunAlarmByGroupBatteryID(int GroupBatteryID){
        return groRunAlarmDao.getGroRunAlarmByGroupBatteryID(GroupBatteryID);
    }
}
