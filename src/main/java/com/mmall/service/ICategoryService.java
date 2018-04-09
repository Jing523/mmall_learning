package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by jingwang on 9/4/18.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
