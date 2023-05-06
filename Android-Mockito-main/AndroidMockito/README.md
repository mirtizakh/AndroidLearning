## Table of contents
* [General info](#General-info)
* [What is Unit Testing](#Unit-Testing)
* [What makes a good Unit Test](#Good-Unit-Test)
* [Test Doubles](#Test-Doubles)
* [Types of Test Doubles](#Test-Doubles-Types)
* [Mocking](#Mocking)
* [Mockito](#Mockito)

### General info
* In this repo you will find Mockito examples.
* I follow this you tube link for creating all the examples .You tube link : https://www.youtube.com/watch?v=53fncREn8k0&list=PL6Zs6LgrJj3vy7yWpH9xb3Y0I_pAPrvCU
* Few links which are helpful to understand the concepts
  1- https://www.codurance.com/publications/2019/04/08/introduction-to-test-doubles
  2- https://dotnetcoretutorials.com/2021/06/19/mocks-vs-stubs-vs-fakes-in-unit-testing

### Unit Testing
* A unit test is a piece of code written by a developer to test certain functionality of code.
* The class which we want to test is called System / Class Under Test.
* The method which we want to test is called as Method Under Test.
* Unit test instantiates class under test, executes method under test and verifies that it worked as expected.

### Good Unit Test
* Easy to write. (Developer should not put a lot of effort to write the unit test)
* Readable. (It should be readable by evey developer)
* Reliable. (It should run on every machine like CI server)
* Fast. (Unit test provide feedback to the developer very quick)
* Isolated. (If you want to test a class and that class depends on other services like database or network calls,so what happens these external factors take time to bring back the results ,they are consuming much time , so the unit tests are no longer fast .So whenever you want to test a class it should be isolated from external factors.

### Test Doubles
* Test double is a generic term for any case when you replace a production object for testing purpose.
* Sometimes it is not possible to unit test a code because of the unavailability of the external dependency.
* If code under test is dependent on database operations, it is not possible to unit test the code unless the database is available.
* Example : Think of a Stunt Double in a movie which replaces actor whenever actor is not available or actor needs to perform dangerous actions etc.

### Test Doubles Types
#### Fake
* Fake objects are usually light weight objects only for testing. They have working implementation, but not as actual production object.
* Fake objects have functional implementation but its in very basic form.
* For example, instead of actual production database we can use an (in-memory database, hashmap or list) in test.
#### Dummy
* When we do the unit testing the class may be depend on external dependencies,it may happen when we are testing one of the methods of class under test, one or two dependencies doesnot play any role ,so those two dependencies doesnot perform any role but still they come into picture . So while unit testing them we create dummies out of it and the dummies does not have any business logic
* It is an object that is used only for code to compile.
* For example, an object passed as a parameter to constructor . It is passed just to make code compile.
#### Stub
* Stub objects provides predefined answers to method execution made during test.
* A stub is an implementation that returns hardcoded responses.
It provides fake data to the SUT (System Under Test).
* For example, instead of calling actual service, stub is called and it returns back an expected response.
#### Spy
* It records information about how the class is being used.
* The spy can tell the test what parameters it was given, how many times it was called, and what, if any, the return value was.
#### Mock
* Mocks are objects that you can say what they are expecting to receive.
  They are used to verify the behaviour between the System Under Test and its collaborators.
* You set your expectations, call the method of the SUT and verify if the method was called at the end.
* Mock are not used for checking function behaviour or return values from the function call.

### Mocking
* Mocking help us in testing the class in isolation.
* So when we introduce mocking what happens that the class tested in isolation and we
  don't go over the external dependencies.

### Mockito
* Mockito is an open source testing framework for java.
* The framework allows the creation of test doubles objects (mock objects) for unit testing.
  It uses Java Reflection in order to create mock objects.
* It saves developers from writing test doubles or mock objects on their own.
* It has support for exception handling.
* It has support for stubbing methods. It help us in returning configured response.
* It can also check order of method calls and number of times meod being called.
* Annotation support.