package com.udemy.cleanarch.entrypoint.controller;

import com.udemy.cleanarch.core.usecase.InsertCustomerUseCase;
import com.udemy.cleanarch.entrypoint.controller.mapper.CustomerRequestMapper;
import com.udemy.cleanarch.entrypoint.controller.request.CustomerRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerRequestMapper mapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        insertCustomerUseCase.insert(mapper.toCustomer(customerRequest), customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
