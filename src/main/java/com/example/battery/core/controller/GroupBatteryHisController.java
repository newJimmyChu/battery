package com.example.battery.core.controller;


import com.example.battery.core.entity.GroupBattery;
import com.example.battery.core.entity.GroupBatteryHis;
import com.example.battery.core.service.GroupBatteryHisService;
import com.example.battery.core.service.GroupBatteryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/core/groupBatteryHis")
public class GroupBatteryHisController {
    @Resource
    GroupBatteryHisService groupBatteryHisService;

    @GetMapping(value = "/groupBatteryID")
    public List<GroupBatteryHis> getGroupBatteryHistByGroupBatteryID(@RequestParam(name = "ID") int ID) {
        return groupBatteryHisService.getGroupBatteryHistByGroupBatteryID(ID);
    }
}

