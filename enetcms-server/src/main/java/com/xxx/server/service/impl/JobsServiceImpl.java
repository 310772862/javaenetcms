package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.JobsMapper;
import com.xxx.server.pojo.Jobs;
import com.xxx.server.service.IJobsService;
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
public class JobsServiceImpl extends ServiceImpl<JobsMapper, Jobs> implements IJobsService {

}
