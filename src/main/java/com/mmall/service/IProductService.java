package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;
import com.mmall.vo.ProductListVo;

/**
 * Created by Administrator on 2017/5/4.
 */
public interface IProductService {
    /**
     * 添加或修改商品
     * @param product
     * @return
     */
    ServerResponse saveOrUpdateProduct(Product product);

    /**
     * 修改商品状态
     * @param productId
     * @param status
     * @return
     */
    ServerResponse setProductStatus(Integer productId,Integer status);

    /**
     *填充商品
     * @param productId
     * @return
     */
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    /**
     * 得到商品分页结果
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse getProductList(Integer pageNum,Integer pageSize);

    /**
     * 查找商品
     * @param productName
     * @param productId
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse searchProduct(String productName,Integer productId,Integer pageNum,Integer pageSize);

    /**
     * 获取商品详情
     *
     * @param productId
     * @return
     */
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    /**
     * 搜索商品
     * @param keywork
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @param orderBy
     * @return
     */
    ServerResponse<PageInfo> getProductByKeyWorkAndCategoryId(String keywork, Integer categoryId, Integer pageNum, Integer pageSize, String orderBy);
}
