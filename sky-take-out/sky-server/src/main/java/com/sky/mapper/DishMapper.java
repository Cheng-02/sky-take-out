package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LDQ
 * @date 2024/4/8
 * @description
 */
@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     *
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);

    /*
     *
     * 插入菜品数据
     *
     * */
    @AutoFill(value = OperationType.INSERT)
    void insert(Dish dish);

    Page<DishVO> pageQuery(DishPageQueryDTO dishPageQueryDTO);

    @Select("select * from dish where id =#{id}")
    Dish getById(Long id);

    @Delete("delete from dish where id=#{id}")
    void deleteById(Long id);

    @Select("select * from dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByIdWithFlavor(Long dishId);

    @AutoFill(value = OperationType.UPDATE)
    void update(Dish dish);
}