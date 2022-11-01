package com.ember.server.service.impl;

import com.ember.server.pojo.AdminRole;
import com.ember.server.mapper.AdminRoleMapper;
import com.ember.server.service.IAdminRoleService;
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
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
