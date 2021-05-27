package com.example.battery.core.controller;


import com.example.battery.core.entity.OpeLevel;
import com.example.battery.core.service.OpeLevelService;
import com.example.battery.core.service.OperatorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
@RequestMapping("/core/opeLevel")
public class OpeLevelController {
    @Autowired
    private OpeLevelService opeLevelService;

    @GetMapping(value = "/Operators")
    public List<Integer> getAllContrallerIDByOperatorID(@RequestParam(name = "OperatorsID") int operartorsID) {
        List<OpeLevel> searchResult=opeLevelService.getAllContrallerByOperatorID(operartorsID);
        List<Integer> result= new ArrayList<Integer>();
        for(OpeLevel opeLevel:searchResult){
            result.add(opeLevel.getContrallerID());
        }
        return result;

    }
}

