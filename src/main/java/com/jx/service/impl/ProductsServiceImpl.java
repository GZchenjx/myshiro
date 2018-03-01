package com.jx.service.impl;

import com.jx.bean.Products;
import com.jx.dao.ProductsDAO;
import com.jx.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/5.
 */
@Service
public class ProductsServiceImpl implements ProductsService{
    @Autowired
    private ProductsDAO productsDAO;

    @Override
    public void add(Products products) {
        productsDAO.add(products);
    }

    @Override
    public List<Products> quertAll() {
        return productsDAO.quertAll();
    }
}
