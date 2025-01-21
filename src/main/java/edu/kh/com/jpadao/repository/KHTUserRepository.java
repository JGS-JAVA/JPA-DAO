package edu.kh.com.jpadao.repository;

import edu.kh.com.jpadao.dao.KHTUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
*Repository 는 매퍼와 비슷한 기능
* Repository 는 쿼리(sql)작성 없이 메서드명으로 동작하는 기본 CRUD 메서드 제공
* 아이디찾기 = findById
* 회원저장 = save
* 삭제 = delete
* 전체조회 = findAll
* */

@Repository
public interface KHTUserRepository extends JpaRepository<KHTUser, Long> {
    KHTUser findByUsername(String username);
    KHTUser findById(int id);



}
