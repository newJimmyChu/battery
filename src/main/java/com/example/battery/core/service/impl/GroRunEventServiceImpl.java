package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroRunEvent;
import com.example.battery.core.mapper.GroRunEventDao;
import com.example.battery.core.mapper.GroupBatteryHisDao;
import com.example.battery.core.service.GroRunEventService;
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
public class GroRunEventServiceImpl extends ServiceImpl<GroRunEventDao, GroRunEvent> implements GroRunEventService {
    @Autowired
    private GroRunEventDao groRunEventDao;
    @Override
    public List<GroRunEvent> getGroRunEventByGroupBatteryID(int GroupBatteryID){
        return groRunEventDao.getGroRunEventByGroupBatteryID(GroupBatteryID);
    }
}
