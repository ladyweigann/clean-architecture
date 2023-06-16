package com.udemy.cleanarch.dataprovider.repository.mapper;

import com.udemy.cleanarch.core.domain.Customer;
import com.udemy.cleanarch.dataprovider.repository.entities.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
