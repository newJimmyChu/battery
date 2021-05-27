package com.example.battery.core.service.impl;

import com.example.battery.core.entity.OpeLevel;
import com.example.battery.core.mapper.OpeLevelDao;
import com.example.battery.core.service.OpeLevelService;
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
public class OpeLevelServiceImpl extends ServiceImpl<OpeLevelDao, OpeLevel> implements OpeLevelService {
    @Autowired
    private OpeLevelDao opeLevelDao;

    @Override
    public List<OpeLevel> getAllContrallerByOperatorID(int OperatorsID){ return opeLevelDao.getAllContrallerByOperatorID(OperatorsID);}

}
