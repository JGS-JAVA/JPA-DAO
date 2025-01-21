package edu.kh.com.jpadao.repository;

import edu.kh.com.jpadao.dao.KHTProduct;
import edu.kh.com.jpadao.dao.KHTUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface KHTProductRepository extends JpaRepository<KHTProduct, Long> {
        KHTProduct findByProductname(String productname);
        KHTProduct findById(int id);
}
