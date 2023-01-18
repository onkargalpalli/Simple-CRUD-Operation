#                                           Spring Boot Projects - CRUD Operations
This project has some basic CRUD Operations which adds, updates,deletes some data in database using RestAPI endpoints.
## There are Spring Boot and Realated REST API endpoints implemented, you may check in the source code.

### 1) Get ALL Employees from Database
    Use localhost:8080/all

### 2) Get Employees based on EmpID from Database
    Use localhost:8080/{id} where id may be any integer 
        ex:- localhost:8080/3 will fetch employee with empID 3

### 3) Create/Add new Employee to Database
    Use localhost:8080/add with POST method
    Postman RequestBody:-
        {  
            "id": "3",  
            "firstName": "Ketan",  
            "lastName": "Bahadur",  
            "email": "k.bahadur@infonext.com",
            "age" :"32"  
        }   
### 4) Delete Employee based on EmpID from Database
    Use localhost:8080/{id} with DELETE method
         ex:- localhost:8080/4 will delete employee with empID 4

### 4) Update existing Employee from Database
    Use localhost:8080/update with PUT method
    Postman RequestBody:-
        {  
            "id": "3",  
            "firstName": "KetanUpdated",  
            "lastName": "Bahadur",  
            "email": "k.bahadur@infonext.com",
            "age" :"32"  
        }     

## Database:
##### ->  We have used standalone h2 database which initiates whenever we start our service.
##### ->  To access h2 Database use http://localhost:8080/h2-console after your service is up and running.
