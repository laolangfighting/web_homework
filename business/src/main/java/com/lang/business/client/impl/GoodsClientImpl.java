package com.lang.business.client.impl;

import com.lang.business.client.GoodsClient;
import org.springframework.stereotype.Component;

/**
 * @author: langxc
 * @date: 2020/12/18
 * @description:
 */
@Component
public class GoodsClientImpl implements GoodsClient {
    @Override
    public String getGoodsInfo() {
        return "服务器正忙，请稍后重试...";
    }

}
