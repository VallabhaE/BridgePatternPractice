
# Java Developer Interview Preparation

**Interview Date:** Friday, October 30, 2026

## 1. Core Java — Must Know

- [ ] JDK vs JRE vs JVM
- [ ] Primitive and reference data types
- [ ] OOP concepts:
  - [ ] Encapsulation
  - [ ] Inheritance
  - [ ] Polymorphism
  - [ ] Abstraction
- [ ] Classes, objects, and constructors
- [ ] `this` vs `super`
- [ ] Method overloading vs overriding
- [ ] Abstract class vs interface
- [ ] Access modifiers
- [ ] `static` vs `final`
- [ ] `==` vs `equals()`
- [ ] String vs StringBuilder vs StringBuffer
- [ ] String immutability
- [ ] Creating immutable classes
- [ ] Checked vs unchecked exceptions
- [ ] try-catch-finally
- [ ] `throw` vs `throws`
- [ ] Custom exceptions
- [ ] Garbage collection basics
- [ ] Stack vs heap memory

## 2. Collections Framework — Must Know

- [ ] List vs Set vs Map vs Queue
- [ ] ArrayList vs LinkedList
- [ ] HashSet vs TreeSet
- [ ] HashMap vs Hashtable
- [ ] HashMap vs ConcurrentHashMap
- [ ] How HashMap works internally
- [ ] `equals()` and `hashCode()` contract
- [ ] Hash collisions
- [ ] Comparable vs Comparator
- [ ] Iterator vs ListIterator
- [ ] Fail-fast iterators
- [ ] ConcurrentModificationException
- [ ] Time complexity of collections

## 3. Java 8+ Features — High Priority

- [ ] Lambda expressions
- [ ] Functional interfaces
- [ ] Predicate, Function, Consumer, Supplier
- [ ] Stream API
- [ ] `filter()` vs `map()` vs `flatMap()`
- [ ] `sorted()`, `reduce()`, `collect()`
- [ ] `Collectors.groupingBy()`
- [ ] `Collectors.toMap()`
- [ ] `forEach()`
- [ ] Optional and null handling
- [ ] Method references
- [ ] Default and static interface methods
- [ ] Records basics

## 4. Multithreading and Concurrency

- [ ] Process vs thread
- [ ] Thread vs Runnable vs Callable
- [ ] Thread lifecycle
- [ ] `start()` vs `run()`
- [ ] `synchronized` keyword
- [ ] `volatile` keyword
- [ ] Race conditions
- [ ] Deadlocks and prevention
- [ ] `wait()` vs `notify()` vs `notifyAll()`
- [ ] ExecutorService
- [ ] Thread pools
- [ ] Future vs CompletableFuture
- [ ] AtomicInteger and atomic classes
- [ ] ConcurrentHashMap
- [ ] Thread safety
- [ ] Java virtual threads basics

## 5. Spring Framework and Spring Boot

- [ ] What is Spring Framework?
- [ ] What is Spring Boot?
- [ ] Spring vs Spring Boot
- [ ] Inversion of Control (IoC)
- [ ] Dependency Injection (DI)
- [ ] Constructor injection vs field injection
- [ ] `@Component`
- [ ] `@Service`
- [ ] `@Repository`
- [ ] `@Controller` vs `@RestController`
- [ ] `@Autowired`
- [ ] `@SpringBootApplication`
- [ ] `@Configuration` and `@Bean`
- [ ] `@GetMapping`
- [ ] `@PostMapping`
- [ ] `@PutMapping`
- [ ] `@PatchMapping`
- [ ] `@DeleteMapping`
- [ ] `@PathVariable`
- [ ] `@RequestParam`
- [ ] `@RequestBody`
- [ ] DTO vs Entity
- [ ] Controller-Service-Repository architecture
- [ ] Global exception handling
- [ ] `@ControllerAdvice`
- [ ] `@ExceptionHandler`
- [ ] `@Valid` and validation annotations
- [ ] `application.properties` / `application.yml`
- [ ] Spring profiles
- [ ] Spring Boot Actuator basics

## 6. SQL, JDBC, JPA and Hibernate

- [ ] SELECT, INSERT, UPDATE, DELETE
- [ ] WHERE, GROUP BY, HAVING, ORDER BY
- [ ] INNER JOIN vs LEFT JOIN
- [ ] Subqueries
- [ ] Aggregate functions
- [ ] Primary key vs foreign key
- [ ] Indexes and their trade-offs
- [ ] Database normalization
- [ ] Transactions and ACID properties
- [ ] Isolation levels
- [ ] Dirty reads and deadlocks
- [ ] JDBC basics
- [ ] Connection pooling
- [ ] JPA vs Hibernate
- [ ] `@Entity` and `@Id`
- [ ] `@GeneratedValue`
- [ ] `@OneToOne`
- [ ] `@OneToMany`
- [ ] `@ManyToOne`
- [ ] Lazy vs eager loading
- [ ] N+1 query problem
- [ ] `@Transactional`
- [ ] Optimistic vs pessimistic locking

## 7. REST APIs and Backend Development

- [ ] REST architecture
- [ ] GET vs POST vs PUT vs PATCH vs DELETE
- [ ] HTTP status codes:
  - [ ] 200, 201, 204
  - [ ] 400, 401, 403, 404, 409
  - [ ] 429, 500, 502, 503, 504
- [ ] Authentication vs authorization
- [ ] JWT basics
- [ ] Spring Security basics
- [ ] Pagination and sorting
- [ ] API validation
- [ ] API versioning
- [ ] Idempotency
- [ ] Retries and timeouts
- [ ] Rate limiting
- [ ] Caching
- [ ] Redis basics
- [ ] Microservices architecture
- [ ] Synchronous vs asynchronous communication
- [ ] Logging and monitoring

## 8. Coding Questions — Practice in Java

- [ ] Reverse a string
- [ ] Check palindrome
- [ ] Check anagram
- [ ] Find duplicate elements in an array
- [ ] Find second-largest number
- [ ] Find largest and smallest elements
- [ ] Count character frequency using HashMap
- [ ] Find first non-repeating character
- [ ] Two Sum problem
- [ ] Remove duplicates from a list
- [ ] Sort objects using Comparator
- [ ] Find even numbers using Streams
- [ ] Find maximum using Streams
- [ ] Group objects using `Collectors.groupingBy()`
- [ ] Count word frequency
- [ ] Check prime number
- [ ] Generate Fibonacci series
- [ ] Factorial using iteration and recursion
- [ ] Binary search
- [ ] Reverse a linked list
- [ ] Find missing number in an array
- [ ] Merge two sorted arrays

### For Every Coding Problem

- [ ] Explain the approach
- [ ] Write working Java code
- [ ] Explain time complexity
- [ ] Explain space complexity
- [ ] Test edge cases

## 9. Testing and Build Tools

- [ ] JUnit 5 basics
- [ ] Unit testing vs integration testing
- [ ] Mockito basics
- [ ] Mock vs Spy
- [ ] Maven basics
- [ ] `pom.xml` and dependencies
- [ ] Maven build lifecycle
- [ ] Git basics
- [ ] Docker fundamentals
- [ ] CI/CD basics

## 10. Production and System Design

- [ ] Handling 1,000 concurrent API requests
- [ ] Thread pool sizing and queue limits
- [ ] Connection pool exhaustion
- [ ] Debugging slow APIs
- [ ] High CPU and memory troubleshooting
- [ ] Database query optimization
- [ ] Preventing duplicate request processing
- [ ] Transactions across multiple operations
- [ ] Microservice failures and retries
- [ ] Message queues and asynchronous processing
- [ ] Caching strategies
- [ ] Logging and monitoring
- [ ] API authentication and authorization
- [ ] Load balancing basics
- [ ] Rate limiting and backpressure

## 11. Go vs Java — Map Existing Knowledge

- [ ] Goroutines vs Java threads/executors
- [ ] Go channels vs Java concurrency primitives
- [ ] Go sync.Mutex vs Java synchronized/Lock
- [ ] Go interfaces vs Java interfaces
- [ ] Go structs vs Java classes
- [ ] Go error returns vs Java exceptions
- [ ] Go net/http or Gin vs Spring Boot
- [ ] Go database/sql vs JDBC
- [ ] Go modules vs Maven/Gradle
- [ ] Go defer vs Java resource cleanup
- [ ] Explain how existing Go backend experience
      applies to Java backend development

## 12. Project and HR Preparation

- [ ] Prepare a 60-second self-introduction
- [ ] Explain current backend role
- [ ] Explain one project end-to-end
- [ ] Explain API design and database schema
- [ ] Explain one production issue solved
- [ ] Explain a performance optimization
- [ ] Explain a difficult debugging experience
- [ ] Explain handling concurrent requests
- [ ] Why do I want to move to Java development?
- [ ] Why should we hire you?
- [ ] Explain strengths and weaknesses
- [ ] Prepare salary expectations
- [ ] Prepare notice period and joining-date answers

---

# 3-Day Study Plan

## Day 1 — Core Java

- [ ] OOP, Strings and Exceptions
- [ ] Collections and HashMap internals
- [ ] Java 8 Streams and Lambdas
- [ ] Solve 5–8 coding problems

## Day 2 — Spring Boot and Databases

- [ ] Spring Boot fundamentals
- [ ] Build or understand a CRUD REST API
- [ ] JPA and Hibernate
- [ ] SQL joins, indexes and transactions
- [ ] HTTP methods and status codes

## Day 3 — Interview Revision

- [ ] Multithreading and concurrency
- [ ] Spring Security and JWT basics
- [ ] Production debugging and system design
- [ ] Review project explanations
- [ ] Practice a mock interview
- [ ] Revise coding problems

## Friday — Interview Day

- [ ] Revise important definitions
- [ ] Review Java coding patterns
- [ ] Review project experience
- [ ] Practice self-introduction
- [ ] Avoid starting major new topics
- [ ] Get adequate sleep

---

# Priority Order

1. Core Java and OOP
2. Collections and HashMap
3. Java 8 Streams and Lambdas
4. Spring Boot and REST APIs
5. SQL and JPA/Hibernate
6. Coding problems
7. Multithreading and concurrency
8. Testing, security and microservices
9. Production debugging and system design
10. Advanced Java topics

**Goal:** Understand the fundamentals, write Java code independently, explain backend concepts clearly, and connect existing Go experience to Java development.
