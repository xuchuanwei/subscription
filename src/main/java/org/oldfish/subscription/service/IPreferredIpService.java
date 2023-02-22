package org.oldfish.subscription.service;

import org.oldfish.subscription.domain.PreferredIp;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
public interface IPreferredIpService extends IService<PreferredIp> {

    String findPreferredIp();
}
