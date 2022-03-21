# musicosDeBremen
### ⚠️ Objetivos

> El objetivo de esta kata también es practicar los principios básicos de la OOP como: Abstración, Encapsulación, Herencia, Polimorfismo e Interfases usando TDD.

### ⚙️ Requisitos

Hay que usar TDD. 

### ⚙️ Requisitos Funcionales

Sprint 01

- Los gatos y gatas (Cat) se deben iniciar con un nombre y un sonido con el que suelen cantar.
- Al inicio los gatos no cantan.
- Podemos indicarle a cualquier Cat que empiece a cantar y también que deje de cantar.
- Cat nos indicará cuando canta con una función devolviendo “El gato {nombre} esta cantando {sonido} ” y cuando no canta nos indicará “el gato {nombre} no quiere cantar”.

Sprint 02

- El asno y todos los animales pueden hacer lo mismo que el gato pero sus mensajes son “El asno {nombre} esta cantando {sonido} ” y cuando no canta nos indicará: “el asno {nombre} no quiere cantar”.

Sprint 03

- Para dirigir el coro tenemos una directora (Director) que tiene la capacidad de hacer cantar varios animales a la vez. A esta directora la instanciaremos con una lista de animales y debe tener la capacidad de: (startSing() y stopSing()) funciones en las que deberán empezar y parar de cantar los animales sin importar de qué tipo sean ni el numero de participantes en el coro.


### 🗝 UML y relaciones entre clases

- El siguiente diagrama UML muestra las relaciones entre las clases `Human`, `Dog` y `Cat`.
    
    ![UML: Diagrama de Clases](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/03a043be-fcaf-498f-96a2-bed60cfe4c84/Untitled.png)
    
    UML: Diagrama de Clases
