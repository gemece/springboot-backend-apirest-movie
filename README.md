# REST API springboot-backend-apirest-movie

Esta es la documentación de la API de Spring Framework.

Para comprobar el funcionamiento de esta API se recomienda la instalación
y el uso de PostMan.

Primero tendremos que obtener los token autentificación ya que la seguridad
de la aplicación esta basada en OAuth 2.0 con JwT (Json Web Token).

# Campos a rellenar para el rol User

## Request

  `GET localhost:8080/oauth/token`

## Body

    key: username     value: pedro
    key: password     value: 12345
    key: grant_type   value: password

## Auth

    Type: Basic Auth
    Username: movieapp
    Password: 12345

# Campos a rellenar para el rol Admin

## Request

  `GET localhost:8080/oauth/token`

## Body

    key: username     value: admin
    key: password     value: 12345
    key: grant_type   value: password

## Auth

    Type: Basic Auth
    Username: movieapp
    Password: 12345
    
# REST API

Una vez obtenemos el access_token en el campo Auth ponemos en el type Bearer Token y completamos el campo token.

## Get lista de películas mejor valoradas sin ningún rol ni autentificación

### Request

`GET localhost:8080/api`

## Get lista de películas mas populares con el rol User

### Request

`GET localhost:8080/api/popular`

## Get películas con el rol Admin

### Request

`GET localhost:8080/api/search?query="searchText"`

### Request

`GET localhost:8080/api/{id}`


