package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * @author Cheng-02
 * @version V1.0
 * @Package com.sky.service
 * @date 2024/5/5 下午7:06
 */
public interface DishService {


    void saveWithFlavor(DishDTO dishDTO);


    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);



    DishVO getByIdWithFlavor(Long id);



    void updateWithFlavor(DishDTO dishDTO);
}
