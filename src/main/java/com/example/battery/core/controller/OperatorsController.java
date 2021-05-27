package com.example.battery.core.controller;


import com.example.battery.core.entity.Operators;
import com.example.battery.core.service.OperatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chuzefang
 * @since 2021-05-22
 */
@RestController
@RequestMapping("/core/operators")
public class OperatorsController {
    @Autowired
    private OperatorsService operatorsService;

    @GetMapping(value = "/WXID")
    public int getOperatorIDByWXID(@RequestParam(name = "WXID") String WXID) {
        return operatorsService.getOperatorByWXID(WXID).getID();

    }

}

