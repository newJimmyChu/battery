package com.example.battery.core.service;

import com.example.battery.core.entity.OpeLevel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface OpeLevelService extends IService<OpeLevel> {
    List<OpeLevel> getAllContrallerByOperatorID(int OperatorsID);
}
