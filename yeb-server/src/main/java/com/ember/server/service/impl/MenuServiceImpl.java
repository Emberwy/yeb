package com.ember.server.service.impl;

import com.ember.server.pojo.Menu;
import com.ember.server.mapper.MenuMapper;
import com.ember.server.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
