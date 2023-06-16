package com.udemy.cleanarch.dataprovider.repository;

import com.udemy.cleanarch.core.dataprovider.InsertCustomer;
import com.udemy.cleanarch.core.domain.Customer;
import com.udemy.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper mapper;

    @Override
    public void insert(Customer customer) {
        customerRepository.save(mapper.toCustomerEntity(customer));
    }
}
