package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.model.vo.VerificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class VerificationService {

    @Autowired
    private JavaMailSender mailSender;
    private Map<String, String> verificationCodes = new HashMap<String, String>();
    // 이메일 회사에서 회원가입 진행시 인증번호 받는 회원 여러명일수 있어서
    // 이메일을 key 로 , 인증번호를 value 로 설정해 verifyCodes 변수명에 저장하기
    
    
    public String randomCode() {
        Random rand = new Random();
        int randomNum = 100000 + rand.nextInt(900000); // 6자리 랜덤숫자 생성
        return String.valueOf(randomNum); // 숫자값을 글자로 변환해 전달 -> 메일 기본타입이 string 이기 때문

    }

    public void sendEmail(String email, String code) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email); //사용자가 쓴 이메일로 메시지 보내기
        message.setSubject("인증번호 보냅니다"); // 이메일 제목
        message.setText("인증번호입니다" + code);
        mailSender.send(message);
        System.out.println("이메일 보내기 성공" + email);

    }

    public void saveEmailCode(String email, String code) {
        System.out.println("=====Service- Save Email Code=========");
        verificationCodes.put(email.toLowerCase(), code); // 이메일(소문자로), 인증번호 저장하기
        System.out.println("Save Email Code: " +email.toLowerCase() + code);
    }

    // verifyCodeWithVO = model.vo 의 이메일코드 저장파일
    public boolean verifyCodeWithVO(VerificationRequest request) {
        String email = request.getEmail().toLowerCase();
        System.out.println(" Email : " +email);

        String inputCode = request.getCode(); // 이메일로 인증번호 확인한 사용자가 입력한 인증코드
        System.out.println(" inputCode : " +inputCode);

        String saveCode = verificationCodes.get(email); // vo 객체에 저장된 자바에서 만든 랜덤숫자 6개 가져오기
        System.out.println(" saveCode : " +saveCode);

                                                        // verificationCodes = 해당 이메일의 인증번호 가져오기
        return inputCode.equals(saveCode); // equals = 일치하면 true
    }
}
