package org.oldfish.subscription.service.impl;

import org.oldfish.subscription.domain.LocalUrl;
import org.oldfish.subscription.mapper.LocalUrlMapper;
import org.oldfish.subscription.service.ILocalUrlService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
@Service
public class LocalUrlServiceImpl extends ServiceImpl<LocalUrlMapper, LocalUrl> implements ILocalUrlService {

    @Override
    public List<LocalUrl> findLocalUrl() {
        return baseMapper.selectList(null);
    }
}
