# Lock

## Table of Contents
**[Resource location](#resource-location)** 
**[System requirements](#system-requirements)**
**[Important code blocks](#important-code-blocks)**  

## Resource location
- Source repository - [https://github.com/winterbe/java8-tutorial/tree/master/src/com/winterbe/java8/samples/concurrent](https://github.com/winterbe/java8-tutorial/tree/master/src/com/winterbe/java8/samples/concurrent)

## System requirements

The case study was developed using the following:

- JDK 1.8.0_60

## Important code blocks

	ReadWriteLock lock = new ReentrantReadWriteLock();

	lock.writeLock().lock();

	lock.writeLock().unlock();

	lock.readLock().lock();

	lock.readLock().unlock();