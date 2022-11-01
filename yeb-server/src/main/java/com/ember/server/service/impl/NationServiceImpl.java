package com.ember.server.service.impl;

import com.ember.server.pojo.Nation;
import com.ember.server.mapper.NationMapper;
import com.ember.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
