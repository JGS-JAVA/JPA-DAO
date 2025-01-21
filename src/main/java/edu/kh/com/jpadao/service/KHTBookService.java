package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.entity.KHTBook;
import edu.kh.com.jpadao.repository.KHTBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTBookService {
    @Autowired
    private KHTBookRepository khtBookRepository;

    public List<KHTBook> findAll() {
        return khtBookRepository.findAll();
    }

    public KHTBook save(KHTBook khtBook) {
        return khtBookRepository.save(khtBook);
    }

    public KHTBook findById(int id) {
        return khtBookRepository.findById(id);
    }

}
