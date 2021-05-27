package com.example.battery.core.controller;


import com.example.battery.core.entity.GroRunError;
import com.example.battery.core.entity.GroRunEvent;
import com.example.battery.core.service.GroRunErrorService;
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
@RequestMapping("/core/groRunError")
public class GroRunErrorController {
    @Resource
    GroRunErrorService groRunErrorService;

    @GetMapping(value = "/groupBatteryID")
    public List<GroRunError> getGroRunErrorByGroupBatteryID(@RequestParam(name = "ID") int ID) {
        return groRunErrorService.getGroRunErrorByGroupBatteryID(ID);
    }

}

