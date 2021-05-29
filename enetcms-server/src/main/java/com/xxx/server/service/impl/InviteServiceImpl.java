package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.InviteMapper;
import com.xxx.server.pojo.Invite;
import com.xxx.server.service.IInviteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邀请表 服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class InviteServiceImpl extends ServiceImpl<InviteMapper, Invite> implements IInviteService {

}
