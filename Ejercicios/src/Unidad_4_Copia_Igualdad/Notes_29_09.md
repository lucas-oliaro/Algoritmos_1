## Clase

Integer i = 10;

Number x = i; //operacion de declaracion
Inicializacion e instaciazion: _Investigar_

Es segura la asignacion porque Number es padre de Integer, hay una relacion de herencia.
JAva define number como clase abstracta por lo que no se puede instanciar. 

upcasting: porque es ir de abajo arriba


###
List<Integer> xs = new ArrayList<>();
List<Number> ys  =xs;

Son dos interfaces (list<number > != list<integer>) disitintas.

Si hago un 
ys.add(Float.ValueOf(6));


Integer[]
List<Integer> xs = new ArrayList<>(_Integer_);
Number[]
List<Number> ys = xs;

No podemos usar primitivos en el tp. No podemos usarlos porque vamos a guardar disintos tipos de datos.

Notas del TP:
tenemos algo tabular con colummnas l aidea es acceder a la informacion de las columnas por headers o etiquetas.
Por lo que es una fila de headers que tiene 1 para contener los nombres.
Debemos tener estructuras de seleccion. Hay colecciones en java que se pueden utilizar para eso uno de esos es los _Map_ que es como los _diccionarios_. Es una implemtancion o una interfaz y la podemosar. Restriccion la * _key_ * debe ser unica.

Se puede agregar una columna de propiedad de orden del dataset actual. PAra mostar algo listado. Todo depende de la proyeccion que usemos.
Complejidad ¿qué estructura uso?
Puede ser un arraylist de _keys_ . Same para columnas no se hace conversion entre columnas. Pero para una selccion de columnas A D E
df.selectcColumns(["A","D","E"])
//A,D,E tiene que ser de tipo de dato las key de las columnas o un arreglo de cadenas y luego las convierto o las Keys siempre son siempre cadenas. 

df.selectcFila(["A","D","E"])

