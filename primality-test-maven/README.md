# Primality Test using Apache Maven

>> Java is required to be available in your computer
>> [Apache Maven](https://maven.apache.org/) is required to be available in your computer

Compiling source code

```
$ cd primality-test-apache
$ mvn clean package
```

Use [Prime Generator](https://bigprimes.org/) to get a prime number as input for the program

```bash
$ mvn exec:java -Dexec.mainClass="es.usj.crypto.PrimalityTest"
Type your number to be analyzed:
673787910737892923862904117949
not prime
```

>> Activity: Why this program is giving a different answer from the Java Raw one?