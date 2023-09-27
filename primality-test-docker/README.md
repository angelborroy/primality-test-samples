# Primality Test using Docker

>> Docker is required to be available in your computer

Building Docker Image

```
$ cd primality-test-docker
$ docker build -t test-java
```

Use [Prime Generator](https://bigprimes.org/) to get a prime number as input for the program

```bash
$ docker run -it test-java
673787910737892923862904117949
prime
```