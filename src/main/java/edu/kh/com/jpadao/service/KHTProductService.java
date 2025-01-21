package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.dao.KHTProduct;
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

    public KHTProduct save(KHTProduct khtProductid) {
        return khtProductRepository.save(khtProductid);
    }

}
