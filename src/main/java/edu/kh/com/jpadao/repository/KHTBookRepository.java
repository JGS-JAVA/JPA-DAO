package edu.kh.com.jpadao.repository;

import edu.kh.com.jpadao.model.entity.KHTBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KHTBookRepository extends JpaRepository<KHTBook, Long> {
   // 기존에 JPA 에서 만든 SAVE 메서드 변형해 재설정
   // KHTBook save(String title, String author, String genre, String imagePath);
    KHTBook findById(int id);
}
