package edu.kh.com.jpadao.controller;

import edu.kh.com.jpadao.entity.KHTBook;
import edu.kh.com.jpadao.entity.KHTProduct;
import edu.kh.com.jpadao.entity.KHTUser;
import edu.kh.com.jpadao.service.KHTBookService;
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


    @GetMapping("/user/{id}")
    public KHTUser findById(@PathVariable("id") int id) {
        KHTUser khtUser = khtUserService.findById(id);
        log.info(khtUser.toString());
        return khtUserService.findById(id); // html에 전달
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

    
    /* @param id 는 @RequestParam 으로 전달받은 id 값을
    // URLSearchParams = url 주소에서 파라미터들을 검색해서 
    // urlParams 란 변수명에 ? 뒤에 오는 키=값 모두 담기
    // urlParams 에서 원하는 키의 값을 가져온다
    // id 란 변수명에 키에 해당한 값 저장
    // const urlParams = new URLSearchParams(window.location.search);
    /    const id = urlParams.get('id');

     */

    @GetMapping("/products/{productId}")
    public KHTProduct findByIdProduct(@PathVariable("id") int id) {
        KHTProduct khtProduct = khtProductService.findById(id);
        log.info(khtProduct.toString());
       return khtProductService.findById(id); // html에 전달
    }

    @Autowired
    private KHTBookService khtBookService;

    @GetMapping("/books/{bookId}")
    public KHTBook findByIdBook(@PathVariable("id") int id) {
        KHTBook khtBook = khtBookService.findById(id);
        log.info(khtBook.toString());
       return khtBookService.findById(id); // html에 전달
    }
    @GetMapping("/books")
    public List<KHTBook> findAllProducts() {
        List<KHTProduct> products = khtProductService.findAll();
        log.info(products.toString());
        return products;
    }
    @PostMapping("/saveBook")
    public KHTBook saveProduct(@RequestBody KHTProduct khtProduct) {
        KHTProduct savedProduct = khtProductService.save(khtProduct);
        log.info(savedProduct.toString());
        return savedProduct;

    }


    @GetMapping("/books")
    public apiBooks(){

    }
    @GetMapping("/book")
    public apiBook(){

    }
    @GetMapping("/bookSave")
    public apisaveBook(){

    }
}
