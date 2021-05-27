package com.example.battery.core.service.impl;

import com.example.battery.core.entity.Operators;
import com.example.battery.core.mapper.OperatorsDao;
import com.example.battery.core.service.OperatorsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@Service
public class OperatorsServiceImpl extends ServiceImpl<OperatorsDao, Operators> implements OperatorsService {

    @Autowired
    private OperatorsDao operatorsDao;

    @Override
    public Operators getOperatorByWXID(String WXID){
        return operatorsDao.getOperatorByWXID(WXID);
    }
}
