package org.oldfish.subscription.service.impl;

import org.oldfish.subscription.domain.Subscription;
import org.oldfish.subscription.mapper.SubscriptionMapper;
import org.oldfish.subscription.service.ISubscriptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
@Service
public class SubscriptionServiceImpl extends ServiceImpl<SubscriptionMapper, Subscription> implements ISubscriptionService {

}
