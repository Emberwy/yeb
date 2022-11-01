package com.ember.server.service.impl;

import com.ember.server.pojo.Department;
import com.ember.server.mapper.DepartmentMapper;
import com.ember.server.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
