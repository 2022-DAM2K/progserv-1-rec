# Ejercicio REST (4 puntos)

Consiste en implementar un servicio REST que permita gestionar las agendas de contactos de los usuarios.

## Configuración

Añade todo lo necesario para que cuando arranque el servicio arranquen los controladores ContactController y UserController

## DTO

Implementa los DTO y sus métodos de mapeo

## Endpoints

- Listado de usuarios
  - Incluye parámetro opcional para filtrar los usuarios de un país
- Añadir contacto a usuario
- Eliminar contacto de usuario

Los endpoint deben lanzar los errores que correspondan a cada situación

## Datos precargados

Cada vez que el servicio arranque tendrá los siguientes datos precargados:
- Un usuario cuyo id es 1 y país es Spain
- Un usuario cuyo id es 2 y país es France
- Un contacto del usuario 1 cuyo nif es "00001X"

Estos datos nos sirven para comprobar los endpoints que se piden.

## Calificación del ejercicio

El ejercicio puntuará cero puntos en los siguientes casos:
- Si no compila
- Si no arranca
- Si no funciona ningún endpoint
