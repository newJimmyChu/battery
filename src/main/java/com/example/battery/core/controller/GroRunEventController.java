package com.example.battery.core.controller;


import com.example.battery.core.entity.GroRunEvent;
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
@RequestMapping("/core/groRunEvent")
public class GroRunEventController {
    @Resource
    GroRunEventService groRunEventService;

    @GetMapping(value = "/groupBatteryID")
    public List<GroRunEvent> getGroRunEventByGroupBatteryID(@RequestParam(name = "ID") int ID) {
        return groRunEventService.getGroRunEventByGroupBatteryID(ID);
    }
}

