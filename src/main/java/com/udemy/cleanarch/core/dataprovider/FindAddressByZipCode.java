package com.udemy.cleanarch.core.dataprovider;

import com.udemy.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(String zipCode);
}
