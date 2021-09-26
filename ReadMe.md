RETO SOFKA - Concurso de preguntas

La aplicación genera un juego de preguntas que son obtenidas aleatoriamente de una
base de datos teniendo en cuenta la dificultad en la que se clasifica cada pregunta.
La aplicación guarda un registro de las partidas jugadas por un jugador y permite
la creación y almacenamiento de nuevas preguntas con sus respectivas opciones posibles
y el nivel de dificultad de la pregunta.

###Funciones de la aplicacion
- Adicionar nuevas preguntas a la base de datos del juego.
- Ejecutar el juego.
-Registrar el jugador al final de la partida.
- Mostrar el registro de las partidas.

###Reglas del juego
El jugador selecciona una respuesta entre 4 posibles, acumulando puntaje a medida que avanza en las rondas del juego (5 rondas en total), si el jugador se equivoca en una respuesta el acumulado se va a 0, si el jugador decide retirarse el puntaje final correspondiente al acumulado alcanzado hasta la ultima pregunta con respuesta buena.

#### Base de datos
La base de datos "mydb" fue creada a partir de un modelo en MySQL Workbench en un servidor local
local host 127.0.0.1  root puerto 3306
versión de MySQL 8.0.26
Se crean las entidades:
"Partida" que almacena el nombre del jugador, el id de la partida, la ronda alcanzada y acumulado (puntaje final del jugador de acuerdo a las reglas del juego).
"Pregunta" que almacena el id de la pregunta, la pregunta misma, las opciones posibles de respuesta de la pregunta, el indicador de la respuesta y la categoría de la pregunta.

### Aplicación
Aplicacion creada en lenguaje Java usando el IDE NetBeans 8.2 con el patron MVC
asegurarse que jdk 1.8
Para la conección a la base de datos:
https://www.youtube.com/watch?v=bYpdf1LvW0g


###Ejecutar la aplicación

####Montar la base de datos
Se debe asegurar que la version de mysql instalada es la MySQL 8.0.26 y que esta se encuentra en las variables de entorno de la maquina. 
Para montar la base de datos se debe ejecutar el siguiente comando:
''mysql -u root  < {project_root}/BD/BD.sql''
{project_root} hace referencia a la ruta de la raiz del proyecto

####Ejecutar la aplicación 
para ejecutar la aplicación es necesario ejecutar el siguiente comando 
'''{JAVA_HOME}/bin/java -jar "{project_root}/dist/RetoSofka.jar" '''

{JAVA_HOME} hace referencia a la ruta donde se encuentra la instalación del jdk en la version jdk 1.8
