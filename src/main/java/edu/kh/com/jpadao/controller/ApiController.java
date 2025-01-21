package edu.kh.com.jpadao.controller;

import edu.kh.com.jpadao.dao.KHTProduct;
import edu.kh.com.jpadao.dao.KHTUser;
import edu.kh.com.jpadao.service.KHTUserService;
import edu.kh.com.jpadao.service.KHTProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ApiController {

    @Autowired
    private KHTUserService khtUserService;

    @GetMapping("/api/users")

    public List<KHTUser> findAll() {
        List<KHTUser> users = khtUserService.findAll();
        log.info(users.toString());
        return users;
    }

    @PostMapping("/api/saveUser")
    public KHTUser saveUser(@RequestBody KHTUser khtUser) {
        return khtUserService.save(khtUser);
    }

    @Autowired
    private KHTProductService khtProductService;

    @GetMapping("/api/products")
    public List<KHTProduct> findAllProducts() {
        List<KHTProduct> products = khtProductService.findAll();
        log.info(products.toString());
        return products;
    }

    @PostMapping("/api/saveProduct")
    public KHTProduct saveProduct(@RequestBody KHTProduct khtProduct) {
        return khtProductService.save(khtProduct);

    }
}
