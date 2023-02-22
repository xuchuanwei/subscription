package org.oldfish.subscription.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.oldfish.subscription.domain.PreferredIp;
import org.oldfish.subscription.mapper.PreferredIpMapper;
import org.oldfish.subscription.service.IPreferredIpService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
@Service
public class PreferredIpServiceImpl extends ServiceImpl<PreferredIpMapper, PreferredIp> implements IPreferredIpService {


    @Override
    public String findPreferredIp() {
        PreferredIp preferredIp = baseMapper.selectById(1);
        return preferredIp.getIp();
    }
}
