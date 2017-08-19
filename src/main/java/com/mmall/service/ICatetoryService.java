package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
public interface ICatetoryService {
    /**
     * 添加商品分类
     * @param categoryName
     * @param parentId
     * @return
     */
    ServerResponse addCategory(String categoryName, Integer parentId);

    /**
     * 更新商品分类的名字
     * @param categoryName
     * @param categoryId
     * @return
     */
    ServerResponse updateCategoryName(String categoryName, Integer categoryId);

    /**
     * 获取同级分类
     * @param categoryId
     * @return
     */
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 获取当前分类及子分类的ID
     * @param categoryId
     * @return
     */
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
