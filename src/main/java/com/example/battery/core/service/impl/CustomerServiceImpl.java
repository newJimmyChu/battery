package com.example.battery.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.battery.core.entity.Customer;
import com.example.battery.core.mapper.CustomerDao;
import com.example.battery.core.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerDao, Customer> implements CustomerService {

    public List<Customer> getAllCustomer() {
        LambdaQueryWrapper<Customer> wrapper = new LambdaQueryWrapper<>();
        return baseMapper.selectList(wrapper.ne(Customer::getID, 0));
    }

}
