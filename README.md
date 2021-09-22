#  Line Library

## Problem Statement
A library to calculate length of a line in a cartesian system

## Pre-Requisite
1. [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11)
2. [Gradle 6.9.1](https://gradle.org/releases/)

## Running Test
```bash
./gradlew test
```

## Building the Library
```bash
./gradlew build
````

## How to Use
To calculate length of a line, define two point objects and call distanceTo(Point other) method. For example:
```java
Point point1 = new Point(0, 0);
Point point2 = new Point(3, 4);

double length = point1.distanceTo(point2);
```
