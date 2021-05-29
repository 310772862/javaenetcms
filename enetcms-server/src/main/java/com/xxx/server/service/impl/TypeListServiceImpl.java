package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.TypeListMapper;
import com.xxx.server.pojo.TypeList;
import com.xxx.server.service.ITypeListService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类型信息表 服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class TypeListServiceImpl extends ServiceImpl<TypeListMapper, TypeList> implements ITypeListService {

}
