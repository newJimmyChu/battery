package com.example.battery.core.service.impl;

import com.example.battery.core.entity.GroRunError;
import com.example.battery.core.entity.GroRunEvent;
import com.example.battery.core.mapper.GroRunErrorDao;
import com.example.battery.core.mapper.GroRunEventDao;
import com.example.battery.core.service.GroRunErrorService;
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
public class GroRunErrorServiceImpl extends ServiceImpl<GroRunErrorDao, GroRunError> implements GroRunErrorService {
    @Autowired
    private GroRunErrorDao groRunErrorDao;
    @Override
    public List<GroRunError> getGroRunErrorByGroupBatteryID(int GroupBatteryID){
        return groRunErrorDao.getGroRunErrorByGroupBatteryID(GroupBatteryID);
    }
}
