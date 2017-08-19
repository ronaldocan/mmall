package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/9.
 */
public interface IOrderService {
    /**
     * 添加订单
     * @param userId
     * @param shippingId
     * @return
     */
    ServerResponse createOrder(Integer userId, Integer shippingId);

    ServerResponse cancel(Integer userId, Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse getOrderDetail(Integer userId, long orderNo);

    ServerResponse getOrderList(Integer userId, Integer pageNum, Integer pageSize);



    //Pay
    ServerResponse pay(Integer userId, Long orderNo, String path);

    //backend
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    ServerResponse manageDetail(long orderNo);

    ServerResponse manageSearch(long orderNo,int pageNum, int pageSize);

    ServerResponse manageSendGoods(long orderNo);

    ServerResponse aliPayCallBack(long orderNo,Map<String, String> params);

    ServerResponse queryOrderPayStatus(Integer userId, long orderNo);
}
