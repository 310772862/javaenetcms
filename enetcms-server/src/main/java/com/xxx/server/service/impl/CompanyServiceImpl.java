package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.CompanyMapper;
import com.xxx.server.pojo.Company;
import com.xxx.server.service.ICompanyService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author LBZ
 * @since 2021-05-18
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
