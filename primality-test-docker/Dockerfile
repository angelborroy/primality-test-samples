# syntax=docker/dockerfile:1
FROM openjdk:21-jdk-slim as base

################################################################################
# Create a stage for building/compiling the application.
#
# The following commands will clone a GitHub project and will compile a Java class
# to produce the output binary in /primality-test-samples/primality-test-java/PrimalityTest.class
FROM base as build
RUN apt update && apt -y install git
RUN git clone https://github.com/angelborroy/primality-test-samples.git && \
    cd primality-test-samples/primality-test-java && \
    javac PrimalityTest.java

################################################################################
# Create a final stage for running your application.
#
# The following commands copy the output from the "build" stage above and tell
# the container runtime to execute it when the image is run. Ideally this stage
# contains the minimal runtime dependencies for the application as to produce
# the smallest image possible. This often means using a different and smaller
# image than the one used for building the application, but for illustrative
# purposes the "base" image is used here.
FROM base AS final

# Create a non-privileged user that the app will run under.
# See https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#user
ARG UID=10001
RUN adduser \
    --disabled-password \
    --gecos "" \
    --home "/nonexistent" \
    --shell "/sbin/nologin" \
    --no-create-home \
    --uid "${UID}" \
    appuser
USER appuser

# Copy the executable from the "build" stage.
COPY --from=build /primality-test-samples/primality-test-java/PrimalityTest.class /bin/

# Working path where the container should be located when it is started.
WORKDIR /bin

# What the container should run when it is started.
ENTRYPOINT ["java","PrimalityTest"]
