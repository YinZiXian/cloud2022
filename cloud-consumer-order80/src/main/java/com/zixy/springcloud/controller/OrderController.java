package com.zixy.springcloud.controller;

import com.zixy.springcloud.entity.CommonResult;
import com.zixy.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author: Zixy
 * @since: 2022-03-06 16:27
 **/
@RestController
@RequestMapping("consumer")
public class OrderController {
    public static final String URL = "http://localhost:8001";
    @Resource
    RestTemplate restTemplate;

    @GetMapping("payment/selectOne/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/payment/selectOne/" + id, CommonResult.class);
    }

    @PostMapping("payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }
}
