package com.example.battery.core.controller;


import com.example.battery.core.entity.Customer;
import com.example.battery.core.entity.GroupBattery;
import com.example.battery.core.service.CustomerService;
import com.example.battery.core.service.GroupBatteryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@RestController
@RequestMapping("/core/groupBattery")
public class GroupBatteryController {
    @Resource
    GroupBatteryService groupBatteryService;

    @GetMapping(value = "/contrallerID")
    public List<GroupBattery> getGroupBatteryByContrallerID(@RequestParam(name = "ID") int ID) {
        return groupBatteryService.getGroupBatteryByContrallerID(ID);
    }

}

