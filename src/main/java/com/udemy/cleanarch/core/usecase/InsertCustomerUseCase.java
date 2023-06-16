package com.udemy.cleanarch.core.usecase;

import com.udemy.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}