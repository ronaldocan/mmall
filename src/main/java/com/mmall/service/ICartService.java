package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

/**
 * Created by Administrator on 2017/5/7.
 */
public interface ICartService {
    /**
     * 添加货品到购物车
     * @param userId
     * @param productId
     * @param count
     * @return
     */
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    /**
     * 更新货品数量
     * @param userId
     * @param productId
     * @param count
     * @return
     */
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    /**
     * 删除货品
     * @param userId
     * @param productIds
     * @return
     */
    ServerResponse<CartVo> delete(Integer userId,String productIds);

    /**
     *
      * @param userId
     * @return
     */
    ServerResponse<CartVo> list (Integer userId);

    /**
     * 查看购物车商品是否选中状态
     * @param userId
     * @param productId
     * @param checked
     * @return
     */
    ServerResponse<CartVo> checkSelectedOrUnSelected(Integer userId, Integer productId, Integer checked);

    /**
     * 获取购物车中的货品总数量
     * @param userId
     * @return
     */
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
