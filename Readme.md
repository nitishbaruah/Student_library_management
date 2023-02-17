> # Student library management
Student Library management system is a backend application built using Java, Spring Boot and MySQL

> ## APIs <br>
## ADD student to database <br>
Address: http://localhost:9998/student/add <br>
JSON: { <br>
"name": "Nitish", <br>
"age" : 23, <br>
"email": "Email@gmail.com", <br>
"mobNo": "9999999999", <br>
"country":"India" <br>
} <br>

## Find the student using Email Address <br>
Address: http://localhost:9998/student/findStudentByEmail?Email={EnterYourEmailAddress} <br>

## ADD Author to database <br>
Address: http://localhost:9998/Author/add <br>
JSON: { <br>
"name":"Chetan Bhagat", <br>
"age" : 38, <br>
"country": "India", <br>
"authorRating":8.9 <br>
} <br>

## ADD Book to database <br>
Address: http://localhost:9998/book/add <br>
JSON: { <br>
"name": "Two States", <br>
"pages": 192, <br>
"genre":"Romance", <br>
"authorId":1 <br>
}