package com.lang.business.controller;

import com.lang.business.client.GoodsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: langxc
 * @date: 2020/12/17
 * @description:
 */
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("/goodsInfo")
    public String goodsInfo() {
        return goodsClient.getGoodsInfo();
    }

}
