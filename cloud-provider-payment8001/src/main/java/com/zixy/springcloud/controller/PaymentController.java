package com.zixy.springcloud.controller;

import com.zixy.springcloud.entity.CommonResult;
import com.zixy.springcloud.entity.Payment;
import com.zixy.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2022-03-06 15:27:55
 */
@RestController
@RequestMapping("payment")
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = paymentService.queryById(id);
        return initCommonResult(payment);
    }

    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        Payment insert = paymentService.insert(payment);
        return initCommonResult(insert);
    }

    private CommonResult<Payment> initCommonResult(Payment payment) {
        CommonResult<Payment> result = new CommonResult<>();
        result.setCode(200);
        result.setMessage("Success");
        result.setData(payment);
        return result;
    }

}