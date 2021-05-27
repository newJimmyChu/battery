package com.example.battery.core.controller;


import com.example.battery.core.entity.GroupBatteryHisArry;
import com.example.battery.core.service.GroupBatteryHisArryService;
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
@RequestMapping("/core/groupBatteryHisArry")
public class GroupBatteryHisArryController {
    @Resource
    GroupBatteryHisArryService groupBatteryHisArryService;

    @GetMapping(value = "/groupBatteryHisID")
    public List<GroupBatteryHisArry> getGroupBatteryHistByGroupBatteryID(@RequestParam(name = "ID") int ID) {
        return groupBatteryHisArryService.getGroupBatteryHistArryByGroupBatteryHisID(ID);
    }
}

