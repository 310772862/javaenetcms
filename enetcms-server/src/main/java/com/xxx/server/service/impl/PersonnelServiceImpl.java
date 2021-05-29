package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.PersonnelMapper;
import com.xxx.server.pojo.Personnel;
import com.xxx.server.service.IPersonnelService;
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
public class PersonnelServiceImpl extends ServiceImpl<PersonnelMapper, Personnel> implements IPersonnelService {

}
