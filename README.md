# Naprapat booking appointments - Usage

### List all customers
**endpoint:**

`GET api/v1/customers`

**Repsonse**
- `200 OK` on success
```json
[
  {
     "personNumber": "19110130-9999",
     "firstName": "Lars",
     "lastName": "Larvig",
     "phoneNumber": "08-10030099"
  }
]
``` 

### Show one customer by pNr
**endpoint:**

`GET api/v1/customers/pNr`

**Response**
- `200 OK` on success 

```json
{
    "personNumber": "19110707-9999",
    "firstName": "OLaus",
    "lastName": "Olidlig",
    "phoneNumber": "08-20030099",
    "email": "lala@mail.nu"
}
```

### Add a new customer
**endpoint:**

`POST api/v1/customers`

**Arguments**

-`"personalNumber": string` date of birth for customer

-`"firstName": string` first name of customer 

-`"lastName": string` last name of customer

-`"phoneNumber": string` phone number of customer

-`"email": string` email address

```json
{
    "personNumber": "192301019999",
    "firstName": "Sören",
    "lastName": "Snål",
    "phoneNumber": "08-21030099",
    "email": "lala@mail.nu"
}
```

**Response**
- `200 OK` on success 

```json
{
    "personNumber": "192301019999",
    "firstName": "Sören",
    "lastName": "Snål",
    "phoneNumber": "08-21030099",
    "email": "lala@mail.nu"
}

 