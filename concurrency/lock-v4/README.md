# Lock

## Table of Contents
**[Resource location](#resource-location)** 
**[System requirements](#system-requirements)**
**[Important code blocks](#important-code-blocks)**  

## Resource location
- Article - [http://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/](http://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/)
- Source repository - [https://github.com/winterbe/java8-tutorial/tree/master/src/com/winterbe/java8/samples/concurrent](https://github.com/winterbe/java8-tutorial/tree/master/src/com/winterbe/java8/samples/concurrent)

## System requirements

The case study was developed using the following:

- JDK 1.8.0_60

## Important code blocks

`StampedLock` also support read and write locks. In contrast to `ReadWriteLock` the locking methods of a `StampedLock` return a stamp represented by a `long` value. You can use these stamps to either release a lock or to check if the lock is still valid.

	StampedLock lock = new StampedLock();
	
Each call to lock returns a new stamp.

	long stamp = lock.writeLock();

	lock.unlockWrite(stamp);

Multiple reads doesn't block each other as long as no write-lock is held.

	long stamp = lock.readLock();

	lock.unlockRead(stamp);