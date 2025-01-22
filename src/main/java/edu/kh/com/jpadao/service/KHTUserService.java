package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.entity.KHTUser;
import edu.kh.com.jpadao.repository.KHTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTUserService {
    @Autowired
    private KHTUserRepository khtUserRepository;

    @Value("${upload-img}") //application.properties 에 작성한 이미지 경로 가져옴
    private String uploadImg; //가져온 경로는 uploadImg 공간 안에 담아줌


    public List<KHTUser> findAll() {
        return khtUserRepository.findAll();
    }

    @Autowired // @Bean 또는 @Bean 내장된 것들 호출
    private PasswordEncoder passwordEncoder; // SecurityConfig.java 에 작성된 기능 가져오기
    

    public KHTUser save(KHTUser khtUserid) {
        // get 가져오기 encode 암호화하기 set 저장하기
        System.out.println(khtUserid.getPassword()); // html - controller - service 로 비밀번호 가져오기

        String encodePassword = passwordEncoder.encode(khtUserid.getPassword()); // 비번 암호화 처리 확인 변수명
        System.out.println(passwordEncoder.encode(khtUserid.getPassword()));

        khtUserid.setPassword(passwordEncoder.encode(khtUserid.getPassword()));
        return khtUserRepository.save(khtUserid);
    }

    public KHTUser findById(int id) {
        return khtUserRepository.findById(id);
    }
}
