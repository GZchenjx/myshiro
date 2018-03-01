package com.jx.controller;

import com.jx.bean.Products;
import com.jx.service.ProductsService;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by CHEN JX on 2017/11/5.
 */
@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;



    @GetMapping("all")
    public ModelAndView queryAll(){
        List<Products> products = productsService.quertAll();
        ModelAndView modelAndView = new ModelAndView("all");
        modelAndView.addObject("products",products);
        return modelAndView;
    }
}
