package com.ember.server.service.impl;

import com.ember.server.pojo.Salary;
import com.ember.server.mapper.SalaryMapper;
import com.ember.server.service.ISalaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ember
 * @since 2022-10-19
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
