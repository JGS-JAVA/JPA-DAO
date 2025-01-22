package edu.kh.com.jpadao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/product")
    public String getProduct() {
        return "product";
    }

    /*
    * @RequestParam 파라미터 요청해서 가져오기
    * */
    @GetMapping("/user")
    public String getUser(@RequestParam("id")int id) {
        return "userDetail";
    }
    @GetMapping("/products/detail")
    public String getProduct(@RequestParam("id")int id) {
        return "productDetail";
    }

    @GetMapping("/books")
    public String getBooks() {
        return "bookDetail";
    }
    @GetMapping("/book")
    public String getBookById(@RequestParam("id") int id) {
        return "bookDetail";
    }
    @GetMapping("/book/add")
    public String saveBook() {
        return "newBooks";

    }
    @GetMapping("/user/add")
    public String saveUser() {
        return "saveUser";

    }
    @GetMapping("/user/add")
    public String saveUserImage() {
        return "saveUserImage";

    }
}
