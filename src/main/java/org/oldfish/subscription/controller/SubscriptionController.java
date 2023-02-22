package org.oldfish.subscription.controller;

import org.oldfish.subscription.domain.LocalUrl;
import org.oldfish.subscription.service.ILocalUrlService;
import org.oldfish.subscription.service.IPreferredIpService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: chuanwei.xu
 * @createDate: 2023/2/22
 * @description:
 */
@RestController
public class SubscriptionController {

    @Autowired
    private ILocalUrlService localUrlService;
    @Autowired
    private IPreferredIpService preferredIpService;

    @GetMapping("/subscription")
    public String subscription() {
        StringBuilder sb = new StringBuilder();

        List<LocalUrl> localUrlList = localUrlService.findLocalUrl();
        String preferredIp = preferredIpService.findPreferredIp();
        for (LocalUrl localUrl : localUrlList) {
            String url;
            if (localUrl.getType() == 1) {
                url = localUrl.getUrl().replace("54.192.20.148", preferredIp);
            } else {
                url = localUrl.getUrl();
            }
            sb.append(url).append("\n");
        }
        return Base64.encodeBase64String(sb.toString().getBytes());
    }

}
