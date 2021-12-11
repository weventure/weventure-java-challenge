# WEVENTURE Java Coding Challenge

## General 

Thank you for applying for a position as a backend developer.

To get a better feeling of your current skillset, we prepared a little coding challenge for you. Please download/clone this repository and create your own afterwards (please do not fork the repository to keep your results secret and the challenge fair to everyone).

Please commit each task seperatly and use the challenge part as description e.g. `B`.

### Application Stack

* Java 8
* Quarkus
* Maven
* Hibernate with H2 embedded database

## Challenge

We want to create an application that provides the functionality to create, delete and update foods.

### A - Entities

Create a `Food` entity with following attributes:
* Name
* Nutritions (fat, carbohydrates, protein, salt, sugar)
* Diet (eg vegan, vegetarian)
* Food Criteria (e.g. fruit, meat, vegetable, dairy)

## B - REST API

Create following endpoinds to a client (e.g. mobile app)

* GET /foods/{id}
* POST /foods
* DELETE /foods/{id}

## C - Improvments

Is there anything that you consider that can be improved in your solution? Please explain (without code)

## D - What is next? 

Please suggest some next helpful features.

## E - Questions

Please note, it is totally fine if you cannot answer a question. Just leave it out. 

1. Please explain to a non-technical what an REST API is.
2. Have you heard before of the Quarkus framework? What is your impression?
3. What test techniques have you already tried? e.g. unit testing
4. Please give a brief summary about what TDD means to you. 

# FAQ

* What about clean code and other oding standards? Should I apply them? 
  * Yes, please. They are very welcome! 
* Should I add tests? 
  * Tests are considered important. For this challenge however you can skip them. If you want to add them anyway, feel free!
