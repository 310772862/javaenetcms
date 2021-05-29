package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.ProductMessageMapper;
import com.xxx.server.pojo.ProductMessage;
import com.xxx.server.service.IProductMessageService;
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
public class ProductMessageServiceImpl extends ServiceImpl<ProductMessageMapper, ProductMessage> implements IProductMessageService {

}
