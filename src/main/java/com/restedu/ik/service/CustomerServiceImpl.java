package com.restedu.ik.service;

import com.restedu.ik.model.Customer;
import com.restedu.ik.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("INFO CustomerServiceImpl getById {} ", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("INFO CustomerServiceImpl save {} ", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("INFO CustomerServiceImpl getAll");
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
