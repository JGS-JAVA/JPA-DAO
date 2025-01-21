package edu.kh.com.jpadao.controller;

import edu.kh.com.jpadao.dao.KHTProduct;
import edu.kh.com.jpadao.dao.KHTUser;
import edu.kh.com.jpadao.service.KHTUserService;
import edu.kh.com.jpadao.service.KHTProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api") // 앞에 적는 공통 주소
public class ApiController {

    @Autowired
    private KHTUserService khtUserService;

    @GetMapping("/users") //  /api/users

    public List<KHTUser> findAll() {
        List<KHTUser> users = khtUserService.findAll();
        log.info(users.toString());
        return users;
    }

    @PostMapping("/saveUser")
    public KHTUser saveUser(@RequestBody KHTUser khtUser) {
        return khtUserService.save(khtUser);
    }

    @Autowired
    private KHTProductService khtProductService;

    @GetMapping("/products")
    public List<KHTProduct> findAllProducts() {
        List<KHTProduct> products = khtProductService.findAll();
        log.info(products.toString());
        return products;
    }

    @PostMapping("/saveProduct")
    public KHTProduct saveProduct(@RequestBody KHTProduct khtProduct) {
        KHTProduct savedProduct = khtProductService.save(khtProduct);
        log.info(savedProduct.toString());
        return savedProduct;

    }
}
