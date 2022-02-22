# Spring-Boot-Basic-REST-API

## API

#### all user details

```http
  get http://localhost:8080/api/details

  Returns array of all user details
```

#### user details by id

```http
  get http://localhost:8080/api/details/{userid}

  Return array of user found with id, or error message on failure
```
