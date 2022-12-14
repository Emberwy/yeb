package com.ember.server.service.impl;

import com.ember.server.pojo.PoliticsStatus;
import com.ember.server.mapper.PoliticsStatusMapper;
import com.ember.server.service.IPoliticsStatusService;
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
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus> implements IPoliticsStatusService {

}
