package com.jmal.clouddisk.controller;

import com.jmal.clouddisk.model.CategoryDTO;
import com.jmal.clouddisk.service.impl.CategoryService;
import com.jmal.clouddisk.service.impl.SettingService;
import com.jmal.clouddisk.util.ResponseResult;
import com.jmal.clouddisk.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jmal
 * @Description 设置
 * @Date 2020/10/28 5:29 下午
 */
@Controller
@Api(tags = "设置")
public class SettingController {

    @Autowired
    private SettingService settingService;

    @ApiOperation("把文件同步到数据库")
    @GetMapping("/setting/sync")
    @ResponseBody
    public ResponseResult<Object> list(@RequestParam String username) {
        settingService.sync(username);
        return ResultUtil.success();
    }
}