# Concurrencia

Implementa un programa que sirva para gestionar una granja de gallinas.

## Main

El programa debe realizar lo siguiente:
- Pide al usuario la cantidad de huevos que se desean recoger.
- Arranca dos hilos (cada uno representa a un granjero) que realicen lo siguiente.
- El hilo principal debe esperar a que los dos hilos anteriores finalicen, en ese momento mostrará el mensaje “Se han recogido todos los huevos” y terminará el programa
- Asegurate de en que el código anterior no existe ninguna race condition. Utiliza bloques sincronizados para conseguirlo.

## FarmerTask

Recibe el contador con la cantidad de huevos que se han recogido.
- Cada hilo recibe:
  - Un contador con la cantidad de huevos que se han recogido.
  - Mientras no se hayan recogido todos los huevos, el hilo extraerá un huevo (aumentando el contador), imprimirá “Quedan x huevos” y esperará 100 milisegundos antes de volver a recoger otro huevo.
  - Cuando se haya recogido el número de huevos deseado, los hilos terminan su ejecución

Run:
  - Mientras no se haya recogido el número deseado de huevos, el hilo recogerá un huevo (aumentando el contador), imprimirá “Quedan x huevos” y esperará 100 milisegundos antes de volver a recoger otro huevo.
  - Cuando se haya recogido el número de huevos deseado, los hilos terminan su ejecución

Asegurate de que el código anterior no existe ninguna race condition. Utiliza **bloques sincronizados** para conseguirlo.

## Calificación (3 puntos)

La puntuación será cero si:
- No compila
- No se crea/inicia ningún hilo

