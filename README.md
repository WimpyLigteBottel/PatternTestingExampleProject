### PatternTestingExampleProject
The goal of the project is use as many patterns as possible and define reason on why One would use them



### **Singleton pattern**
````
For the singleton pattern you only want one instance of a variable because, it might be
very expensive to construct it. 


If you have a look at my PrimeCalculator it construct an model with primenumbers up to the amount specified and you can then
quickly retrieve the primenumber you are looking for (ignore spot zero in list)
````
### **Factory pattern**

```
For the factory pattern you are trying to hide business logic and how the object gets constructed.
Generally you would build complex object and try to hide the logic away within factory.


So when you look ath the ImportantPersonFactory i am building up list of directors there and gets returned
as List<String> which i can then included in my business logic layer and use it as needed.

I could always replace the names with Person object which could contain their details like email and contanct number
and i would not need to change other spots in my code too.

```

### **Builder pattern**

```
For the builder pattern you would use this to construct very complex object or jusst a way to easily contruct object
than doing it the trandition way see below.

Note: When using builder patterns it does introduce some complexity but i wont say too much.
Just don't go introduce it for everything if it is not needed

Traditional:

    Person person = new Person();
    person.setAge("10");
    person.setName("Marco");
    person.setNickname("polo");

Builder pattern:
    
    Person person = Person.Builder
            .getInstance() << returns instantce of Person.builder()
            .setAge("10") << returns builder and set age
            .setName("marco") << returns builder and set name
            .setNickname("Marco polo") << returns builder and set nickname
            .build(); <<<< Creates the person object
```
