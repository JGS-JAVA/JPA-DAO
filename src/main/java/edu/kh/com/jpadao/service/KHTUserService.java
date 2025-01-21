package edu.kh.com.jpadao.service;

import edu.kh.com.jpadao.dao.KHTUser;
import edu.kh.com.jpadao.repository.KHTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTUserService {
    @Autowired
    private KHTUserRepository khtUserRepository;

    public List<KHTUser> findAll() {
        return khtUserRepository.findAll();
    }

    public KHTUser save(KHTUser khtUserid) {
        return khtUserRepository.save(khtUserid);
    }
}
