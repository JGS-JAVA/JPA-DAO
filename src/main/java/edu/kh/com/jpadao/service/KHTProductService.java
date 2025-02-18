package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.model.entity.KHTProduct;
import edu.kh.com.jpadao.repository.KHTProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTProductService {
    @Autowired
    private KHTProductRepository khtProductRepository;

    public List<KHTProduct> findAll() {

        return khtProductRepository.findAll();
    }

    public KHTProduct save(KHTProduct khtProduct) {

        return khtProductRepository.save(khtProduct);
    }

    public KHTProduct findById(int id) {

        return khtProductRepository.findById(id);
    }

}
