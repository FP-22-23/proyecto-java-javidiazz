# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso 2021/22)
Autor/a: Javier García Díaz  uvus:YCS7109

Este proyecto es una adaptación del proyecto presentado por el estudiante Pablo Diego Acosta, en el curso 2021/22.

## Estructura de las carpetas del proyecto

* **/src**: Directorio con el código fuente.
  * **fp.MarvelDC**: Paquete que contiene los tipos del proyecto.
  * **fp.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset del proyecto
    
## Estructura del *dataset*

* **titulo**: de tipo String,  indica el título de la película.
* **id**: de tipo Integer, indica la posición de la película en el csv estudiado.
* **puntuacionImdb**: de tipo Integer, indica la puntuación de la película en Imdb.
* **puntuacionMetacritic**: de tipo Integer, indica la puntuación de la película en Metacritic.
* **duracion**: de tipo Integer, nos indica la duración de la película en minutos.
* **anyoestreno**: de tipo Integer, nos indica el año de estreno de la película.
* **presupuesto**: de tipo Integer, nos indica el presupuesto de la película en dolares.
* **recaudacionPrimeraSemana**: de tipo Integer, nos indica la recaudación de la primera semana en dolares 
* **empresa**: de tipo String, indica de que empresa es la película.

## Tipos implementados

Los tipos que se han implementado en el proyecto son los siguientes:

### Tipo Base - MarvelDC
**Propiedades**:

* **titulo**: de tipo String,  indica el título de la película.
* **id**: de tipo Integer, indica la posición de la película en el csv estudiado.
* **puntuacionImdb**: de tipo Integer, indica la puntuación de la película en Imdb.
* **puntuacionMetacritic**: de tipo Integer, indica la puntuación de la película en Metacritic.
* **duracion**: de tipo Integer, nos indica la duración de la película en minutos.
* **anyoestreno**: de tipo Integer, nos indica el año de estreno de la película.
* **presupuesto**: de tipo Integer, nos indica el presupuesto de la película en dolares.
* **recaudacionPrimeraSemana**: de tipo Integer, nos indica la recaudación de la primera semana en dolares 
* **empresa**: de tipo Empresa, indica de que empresa es la película.


**Constructores**: 

- C1: Tiene un parámetro por cada propiedad básica del tipo.
- C2: Crea un objeto de tipo MarvelDC a partir de los siguientes parámetros: String titulo, Double puntuacionImdb, Integer puntuacionMetacritic, Integer duracion, Integer anyoestreno, Integer presupuesto

**Restricciones**:
 
- R1: Ningún valor puede ser nulo
- R2: La puntuación de Metacritic no puede ser mayor que 100

***Criterio de igualdad**: Comprueba si dos películas tienen el mismo año de estreno



#### Tipos auxiliares

- Empresa, enumerado. Puede tomar los valores MARVEL, DC
