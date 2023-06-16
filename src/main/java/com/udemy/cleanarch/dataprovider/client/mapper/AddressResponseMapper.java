package com.udemy.cleanarch.dataprovider.client.mapper;

import com.udemy.cleanarch.core.domain.Address;
import com.udemy.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
