Json Values:
[
    {
        "id": "Spring",
        "name": "Spring framework",
        "description": "spring framework description"
    },
    {
        "id": "Java",
        "name": "Java coursework",
        "description": "java course description"
    },
    {
        "id": "Javascript",
        "name": "Javascript coursework",
        "description": "Javascript descritpion"
    },
    {
        "id": "Android",
        "name": "Android course",
        "description": "Android course description"
    }
]

Output with courses:
   {
        "id": "Spring-mvc",
        "name": "Spring mvc framework",
        "description": "spring mvc framework description",
        "topic": {
            "id": "Spring",
            "name": "Spring framework",
            "description": "spring framework description"
        }
    }

RestAPI:

GET  	: http://localhost:8080/topics/
GET  	: http://localhost:8080/topics/spring
PUT  	: http://localhost:8080/topics/spring 
DELETE  : http://localhost:8080/topics/spring 
POST 	: http://localhost:8080/topics/ 

Courses :
http://localhost:8080/topics/Spring/courses/Spring-mvc 
http://localhost:8080/topics/Spring/courses/

