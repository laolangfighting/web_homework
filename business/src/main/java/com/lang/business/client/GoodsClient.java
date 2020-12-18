package com.lang.business.client;

import com.lang.business.client.impl.GoodsClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: langxc
 * @date: 2020/12/17
 * @description:
 */

@FeignClient(name = "goods", fallback = GoodsClientImpl.class)
public interface GoodsClient {

    /**
     * 获取商品信息
     *
     * @return
     */
    @GetMapping("/goods/info")
    String getGoodsInfo();

}
