package com.jx.service;

import com.jx.bean.Products;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/5.
 */
public interface ProductsService {

    void add(Products products);

    List<Products> quertAll();
}
