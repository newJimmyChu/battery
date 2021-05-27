package com.example.battery.core.mapper;

import com.example.battery.core.entity.Operators;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
public interface OperatorsDao extends BaseMapper<Operators> {
    Operators getOperatorByWXID(String WXID);
}
