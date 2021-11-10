package com.martinprojects.naprapatbooking.repository;

import com.martinprojects.naprapatbooking.model.BookingsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookingsRepository extends JpaRepository<BookingsModel, String> {
}
