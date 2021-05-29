package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.MessageLogMapper;
import com.xxx.server.pojo.MessageLog;
import com.xxx.server.service.IMessageLogService;
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
public class MessageLogServiceImpl extends ServiceImpl<MessageLogMapper, MessageLog> implements IMessageLogService {

}
