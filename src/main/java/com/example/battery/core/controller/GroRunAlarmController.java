package com.example.battery.core.controller;


import com.example.battery.core.entity.GroRunAlarm;
import com.example.battery.core.entity.GroRunEvent;
import com.example.battery.core.service.GroRunAlarmService;
import com.example.battery.core.service.GroRunEventService;
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
@RequestMapping("/core/groRunAlarm")
public class GroRunAlarmController {
    @Resource
    GroRunAlarmService groRunAlarmService;

    @GetMapping(value = "/groupBatteryID")
    public List<GroRunAlarm> getGroRunAlarmByGroupBatteryID(@RequestParam(name = "ID") int ID) {
        return groRunAlarmService.getGroRunAlarmByGroupBatteryID(ID);
    }

}

