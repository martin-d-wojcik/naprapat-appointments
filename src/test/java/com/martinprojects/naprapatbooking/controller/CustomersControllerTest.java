package com.martinprojects.naprapatbooking.controller;

import com.martinprojects.naprapatbooking.model.CustomersModel;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import java.util.List;

public class CustomersControllerTest {
    CustomersController customersController;

    @Before
    public void setUp() {
        customersController = new CustomersController();
    }

    @Test
    void testGetAllCustomersShouldReturnListPass() {
        Assertions.assertThat(customersController.getAllCustomers()).isNotNull();
    }
}
