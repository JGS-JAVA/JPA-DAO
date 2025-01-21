package edu.kh.com.jpadao.repository;

import edu.kh.com.jpadao.entity.KHTBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KHTBookRepository extends JpaRepository<KHTBook, Long> {

    KHTBook findById(int id);
}
