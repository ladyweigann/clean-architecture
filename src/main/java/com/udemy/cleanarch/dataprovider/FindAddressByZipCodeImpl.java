package com.udemy.cleanarch.dataprovider;

import com.udemy.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.udemy.cleanarch.core.domain.Address;
import com.udemy.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.udemy.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.udemy.cleanarch.dataprovider.client.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper mapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return mapper.toAddress(addressResponse);
    }
}
