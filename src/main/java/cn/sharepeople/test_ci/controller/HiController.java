/*
 * Copyright (c) 2021-2021 QiDa All Rights Reserved.
 */

package cn.sharepeople.test_ci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Welcome interface controller
 *
 * @author QiDa
 * @since 2021-01-01
 */
@RestController
public class HiController {
    @RequestMapping("/hi")
    @ResponseBody
    public String streamingResponseBody() {
        return "hello main";
    }
}
