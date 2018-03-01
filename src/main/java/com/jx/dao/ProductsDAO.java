package com.jx.dao;

import com.jx.bean.Products;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CHEN JX on 2017/11/5.
 */
@Repository
public interface ProductsDAO {

    void add(Products products);

    List<Products> quertAll();
 }
