package com.neusoft.springboot_demo02.mapper;

import com.neusoft.springboot_demo02.entity.ProductEntity;

public interface ProductEntityMapper {
    int deleteByPrimaryKey(Integer goodsno);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    ProductEntity selectByPrimaryKey(Integer goodsno);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);
}