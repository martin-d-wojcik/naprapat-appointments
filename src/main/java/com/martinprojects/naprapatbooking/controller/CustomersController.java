package com.martinprojects.naprapatbooking.controller;

import com.martinprojects.naprapatbooking.exception.ResourceNotFoundException;
import com.martinprojects.naprapatbooking.model.CustomersModel;
import com.martinprojects.naprapatbooking.repository.ICustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomersController {
    @Autowired
    private ICustomersRepository customersRepository;

    @GetMapping("/customers")
    public List<CustomersModel> getAllCustomers() {
        return customersRepository.findAll();
    }

    @GetMapping("/customers/{pNr}")
    public CustomersModel getCustomerByPersonNumber(@PathVariable(value = "pNr") String personNumber) {
        return customersRepository.findById(personNumber)
                .orElseThrow(() -> new ResourceNotFoundException("customers", "pNr", personNumber));
    }

    @PostMapping("/customers")
    public CustomersModel addCustomer(@Valid @RequestBody CustomersModel customersModel) {
        return customersRepository.save(customersModel);
    }
}
