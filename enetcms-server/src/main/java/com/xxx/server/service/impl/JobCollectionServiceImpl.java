package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.JobCollectionMapper;
import com.xxx.server.pojo.JobCollection;
import com.xxx.server.service.IJobCollectionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 职位收藏表 服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class JobCollectionServiceImpl extends ServiceImpl<JobCollectionMapper, JobCollection> implements IJobCollectionService {

}
