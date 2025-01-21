package edu.kh.com.jpadao.repository;

import edu.kh.com.jpadao.entity.KHTProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface KHTProductRepository extends JpaRepository<KHTProduct, Long> {

        KHTProduct findById(int id);
}
