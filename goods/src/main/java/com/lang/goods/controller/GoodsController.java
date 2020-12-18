package com.lang.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: langxc
 * @date: 2020/12/17
 * @description:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/info")
    public String getGoodsInfo() {
//        int i = 1 / 0;  用于测试熔断类

        System.out.println("Node1");
        return "Goods Information";
    }

}
