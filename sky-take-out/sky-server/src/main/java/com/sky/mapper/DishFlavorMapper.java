package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Cheng-02
 * @version V1.0
 * @Package com.sky.mapper
 * @date 2024/5/5 下午7:23
 */


@Mapper
public interface DishFlavorMapper {


    void insertBatch(List<DishFlavor> flavors);

    @Delete("DELETE  from dish_flavor where dish_id=#{id}")
    void deleteByDishId(Long id);
}
