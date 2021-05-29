package com.xxx.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxx.server.mapper.AccessIpMapper;
import com.xxx.server.pojo.AccessIp;
import com.xxx.server.service.IAccessIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LBZ
 * @since 2021-05-11
 */
@RestController
@RequestMapping("/access-ip")
public class AccessIpController {

    @Autowired
    private AccessIpMapper accessIpMapper;
    @RequestMapping("/index/{id}")
    @ResponseBody
    public List<AccessIp> index(@PathVariable("id") Integer id) {
        List<AccessIp> accessIpList = accessIpMapper.selectList(new QueryWrapper<AccessIp>().like(null,null));
        return accessIpList;
    }
}
