package com.martinprojects.naprapatbooking.repository;

import com.martinprojects.naprapatbooking.model.CustomersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomersRepository extends JpaRepository<CustomersModel, String> {
}
