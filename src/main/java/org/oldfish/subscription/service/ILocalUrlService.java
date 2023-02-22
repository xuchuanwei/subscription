package org.oldfish.subscription.service;

import org.oldfish.subscription.domain.LocalUrl;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author chuanwei.xu
 * @since 2023-02-22
 */
public interface ILocalUrlService extends IService<LocalUrl> {

    List<LocalUrl> findLocalUrl();
}
