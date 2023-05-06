package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {

//    http://localhost:8080/hello로 요청시 hello메서드에서 처리
//    http는 국제 통신프로토콜이다. https는 s(secure) 보안이 강화된 통신 프로토콜
//    port란 한 IP 내에 여러 프로그램을 구분짓는 단위, 집주소가 ip, 각집의 방문이 port
//    data만을 return 할 때는 ResponseBody를 사용한다.

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

//  jsp/thymeleaf같은 템플릿 엔진을 사용하여 화면을 return 할 때는 responsebody를 사용하면 안된다.
//    그리고 Model이라는 객체에 data를 담아 return xxx.html파일로 데이터를 보낸다. templates아래 디렉토리로 뒤지기 시작함

    @GetMapping("hello-thymeleaf")
    public String hello2(Model model){
        model.addAttribute("getdata","hello2 world");
        return "hello";
    }
// 데이터를 첨부시키지 않고, 화면만을 렌더링 한다.
    @GetMapping("hello-html")
    public String helloHtml(){
        return "hello-html";
    }

}
