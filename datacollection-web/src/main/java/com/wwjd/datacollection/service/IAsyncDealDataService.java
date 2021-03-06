package com.wwjd.datacollection.service;

import org.springframework.scheduling.annotation.Async;

import java.util.Map;

/**
 * async do something
 *
 * @author 阿导
 * @CopyRight 青团社
 * @Created 2018年12月14日 16:09:00
 */
public interface IAsyncDealDataService {

    /**
     * async do something service interface
     *
     * @author adao
     * @time 2018/12/14 16:11
     * @CopyRight 杭州弧途科技有限公司（qtshe）
     * @param map
     * @return
     */
    @Async
    void dealThirdSomething(Map<String, String> map);
}
