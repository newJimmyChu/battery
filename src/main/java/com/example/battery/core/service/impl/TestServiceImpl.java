package com.example.battery.core.service.impl;

import com.example.battery.core.entity.Test;
import com.example.battery.core.mapper.TestDao;
import com.example.battery.core.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

}
