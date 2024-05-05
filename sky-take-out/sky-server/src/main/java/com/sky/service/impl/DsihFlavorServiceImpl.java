package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.mapper.DishMapper;
import com.sky.service.DishFlavorService;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cheng-02
 * @version V1.0
 * @Package com.sky.service.impl
 * @date 2024/5/5 下午7:07
 */
@Service
@Slf4j
public class DsihFlavorServiceImpl implements DishFlavorService {

    @Autowired
    private DishMapper dishMapper;




}
