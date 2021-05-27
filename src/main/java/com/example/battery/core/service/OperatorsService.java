package com.example.battery.core.service;

import com.example.battery.core.entity.Operators;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface OperatorsService extends IService<Operators> {
    Operators getOperatorByWXID(String WXID);
}
