package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

/**
 * @author Cheng-02
 * @version V1.0
 * @Package com.sky.service
 * @date 2024/5/5 下午7:06
 */
public interface DishService {


    void saveWithFlavor(DishDTO dishDTO);


    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
