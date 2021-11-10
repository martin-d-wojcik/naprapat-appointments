package com.martinprojects.naprapatbooking.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="bookings")
public class BookingsModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private String bookingId;

    @NotBlank
    @Column(name = "personNumber")
    private  String personNumber;

    @NotBlank
    @Column(name = "date")
    private Date bookingDate;

    @NotBlank
    @Column(name = "time")
    private Timestamp timeOfAppointment;

    private String information;

    @Column(name = "cancelled")
    private Boolean cancelledAppointment;

    public BookingsModel(String bookingId, String personNumber, Date bookingDate, Timestamp timeOfAppointment,
                         String information, Boolean cancelledAppointment) {
        this.bookingId = bookingId;
        this.personNumber = personNumber;
        this.bookingDate = bookingDate;
        this.timeOfAppointment = timeOfAppointment;
        this.information = information;
        this.cancelledAppointment = cancelledAppointment;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Timestamp getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public String getInformation() {
        return information;
    }

    public Boolean getCancelledAppointment() {
        return cancelledAppointment;
    }
}
