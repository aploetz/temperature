# temperature
Simple temperature rest API using Spring Boot

## Prerequisites:
Java 11 or higher

## Build instructions:
Clone this repo, and build with Maven:

    mvn clean install
    
Or, you can build and run by invoking Spring Boot with Maven:

    mvn spring-boot:run
    
## Endpoints

There are two GET endpoints.  When running, these endpoints will be served on http://localhost:8080

### GET - /fahrenheit/from/{temp_in_celcius}

Example:

    $ curl -X GET http://localhost:8080/fahrenheit/from/-5
    {"celcius":-5.0,"fahrenheit":23.0}

### GET - /celcius/from/{temp_in_fahrenheit}

Example:

    $ curl -X GET http://localhost:8080/celcius/from/23
    {"celcius":-5.0,"fahrenheit":23.0}
