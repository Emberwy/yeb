package com.ember.server.service.impl;

import com.ember.server.pojo.Oplog;
import com.ember.server.mapper.OplogMapper;
import com.ember.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
