package org.lc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Interview Question
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//Input: nums = [1, 2, 3, 3] -> Output: true
// Input: nums = [1, 2, 3, 4] -> Output: false
public class ContainsDuplicate {
    public boolean solution(List<Integer> nums) {
        Set<Integer> dups = new HashSet<>();
        for (Integer num : nums) {
            if (dups.contains(num)) {
                return true;
            }
            dups.add(num);
        }
        return false;
    }
}
// Java Questions
//        Q1: What’s the difference between == and .equals() in Java?
//        A:
//        == compares references (memory addresses).
//        .equals() compares object content (logic defined in the class).
//        For example, two String objects with the same content may return true with .equals() but false with == unless interned.
//        Q2: What’s the access level of default (package-private) members in Java?
//        A:
//        Accessible only within the same package — no modifier means package-private.
//        Q3: What’s the difference between break, continue, and return?
//        A:
//        break: Exits a loop or switch entirely.
//        continue: Skips the rest of the current loop iteration.
//        return: Exits the method, optionally returning a value.
//🔸 Kotlin Questions
//        Q3: How does Kotlin handle null safety differently than Java?
//        A:
//        Kotlin enforces null safety at the type level with ?.
//        For example: var name: String? allows null, while var name: String does not.
//        It includes operators like !!, ?., and ?: to explicitly handle or avoid nulls.
//        Q4: What are the differences between val, var, and lateinit in Kotlin?
//        A:
//        val: immutable reference (like final in Java).
//        var: mutable reference.
//        lateinit: used to defer initialization of a non-null var (cannot be used with primitive types or val).
// Spring Boot Questions
//        Q5: What is the role of @RestController in Spring Boot?
//        A:
//        Combines @Controller and @ResponseBody.
//        Indicates that the class handles RESTful web requests and returns data (usually JSON) directly instead of rendering views.
//        Q6: What’s the difference between @Component, @Service, and @Repository?
//        A:
//        All are Spring stereotypes and are scanned during component scanning.
//        @Component: Generic stereotype.
//        @Service: Marks a service layer class — used for semantic clarity.
//        @Repository: Marks a persistence layer class — provides additional exception translation for database errors.
//        Q7: How do you manage application configuration in Spring Boot?
//        A:
//        Use application.properties or application.yml.
//        Can use @Value or @ConfigurationProperties to inject values.
//        Profiles (spring.profiles.active) let you define environment-specific settings.
// Relational Databases & Oracle
//        Q8: What is normalization? Can you explain 1NF to 3NF?
//        A:
//        1NF: Eliminate repeating groups — ensure atomicity.
//        2NF: Remove partial dependencies — non-key attributes depend on the full primary key.
//        3NF: Remove transitive dependencies — non-key attributes should depend only on the primary key.
//        Q9: What is a foreign key? Why is it important?
//        A:
//        A foreign key is a field (or combination) that links to the primary key of another table.
//        Ensures referential integrity between related tables.
//        Q10: How do transactions work in Oracle DB?
//        A:
//        A transaction begins with the first DML operation.
//        It ends with a COMMIT or ROLLBACK.
//        Oracle uses undo logs to roll back transactions and redo logs to recover after crashes.
//        Isolation levels (like READ COMMITTED, SERIALIZABLE) control concurrency behavior.
//        Q11: What tools or techniques would you use to optimize a slow query in Oracle?
//        A:
//        Check execution plans using EXPLAIN PLAN.
//        Use indexes, avoid full table scans where unnecessary.
//        Use bind variables to improve plan reuse.
//        Profile query execution with SQL_TRACE or AWR reports.
//        🔸 Spring Data / JPA
//        Q12: What is the difference between @OneToMany and @ManyToOne in JPA?
//        A:
//        @ManyToOne: Child holds the reference to the parent.
//        @OneToMany: Parent references a collection of children — usually needs mappedBy.
//        Bidirectional relationships are common; owning side should define the @JoinColumn.
//        Q13: How do you avoid the N+1 select problem in JPA?
//        A:
//        Use @EntityGraph or JOIN FETCH in JPQL.
//        Fetch all necessary associations in one query to avoid loading related entities one by one.
//        Q14: How do lazy and eager fetching differ in JPA?
//        A:
//        Lazy: Data is loaded only when accessed (default for collections).
//        Eager: Data is loaded immediately with the entity (default for single-valued associations).
//        Lazy loading can cause performance problems or LazyInitializationException if used outside a transaction/session.