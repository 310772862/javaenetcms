package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.WechatConfigMapper;
import com.xxx.server.pojo.WechatConfig;
import com.xxx.server.service.IWechatConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class WechatConfigServiceImpl extends ServiceImpl<WechatConfigMapper, WechatConfig> implements IWechatConfigService {

}
