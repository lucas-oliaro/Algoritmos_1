### Comparación de Estudiantes
En tu sistema de gestión universitaria tenés estudiantes de grado y posgrado. Necesitamos crear clases EstudianteGrado y EstudiantePosgrado que hereden de una clase base llamada Estudiante para manejar tanto a los estudiantes de grado como a los de posgrado.

a) Crear una clase base llamada Estudiante con los siguientes atributos y métodos:

* String nombre
* int edad
* int matrícula
* Constructor para inicializar nombre y edad.

b) Crear una clase EstudianteGrado que herede de Estudiante y agregue los siguientes atributos:

* String carreraGrado
* Constructor que inicialice nombre, edad, matrícula, y carrera de grado.

c) Crear una clase EstudiantePosgrado que herede de Estudiante y agregue los siguientes atributos:

* String carreraPosgrado
* Constructor que inicialice nombre, edad, matrícula, y carrera de posgrado.

d) Sobrescribir el método equals en las clases Estudiante, EstudianteGrado y EstudiantePosgrado para comparar dos estudiantes en función de su matrícula y su carrera (ya sea grado o posgrado).

e) Crear un programa de prueba (Main) que:

* Cree al menos dos objetos EstudianteGrado y dos objetos EstudiantePosgrado.
* Compruebe si dos estudiantes son iguales utilizando el método equals y muestre un mensaje que indique si son iguales o diferentes.
* Cree dos objetos de Estudiante con misma matrícula y verifique si son iguales.
* También, realizar una comparación de identidad (usando ==) de al menos dos de los objetos y mostrar un mensaje que indique si son iguales o diferentes.