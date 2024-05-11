# **Tema 7: Diseño de Arquitectura Logica con Patrones**

## <u>**Arquitectura del Software**</u>
Grandes ideas en las influencias, organización, estilos,
patrones, responsabilidades, colaboraciones, conexiones y
motivaciones de un sistema (o un sistema de sistemas), y los
subsistemas importantes

### *Análisis arquitectural*
| Para | Descripción |
| --- | --- |
| Investigación Arquitectural | Identificacion de aquellos requisitos funcionales y no funcionales que influyen de manera significativa en el diseño del sistema, como tendencias del mercado, rendimiento, coste, mantenimiento, y puntos de evolucion.</ |
| Diseño Arquitectural | Resolucion de las influencias de los requisitos en el diseño mas relevante del sistema. Diseño del software, el hardware y las redes, operaciones, políticas, etc. |


### *Dimensiones y Vistas de la Arquitectura*
| Dimensiones | Descripción |
| :---------- | :---------- |
| Lógica | Organización conceptual del software en función de las capas, subsistemas, paquetes, frameworks, clases e interfaces más importantes. También resume la funcionalidad de los elementos del sotfware importantes, como cada subsistema.|
| Procesos | Procesos e hilos de ejecucion. Sus responsabilidades, colaboraciones y la asignacion a ellos de los elemetos lógicos |
| Despliegue | Despliegue físico de los componentes sobre los nodos de proceso, y la configuración de la red física entre los nodos |
| Casos de Uso | Resumen de los CUs más significativos para la Arquitectura y sus requisitos no funcionales |

| Vistas | Descripción |
| :---------- | :---------- |
| Datos | Vista global del esquema de los datos persistentes, la correspondencia del esquema de los objetos a datos persistentes, el mecanismo de correspondencia de objetos a una base de datos, procedimientos almacenadoes en la base de datos y disparadores. |
| Implementacion | A diferencia del resto (texto y diagramas), este modelo es el código fuente real, ejecutables, etc. Esta vista es una descripción resumida de la organización relevante de los entregables y de las cosas que crean los entregables (como código fuente o gráficos) |

### *Clasificación de Patrones*

| Tipos | Descripción |
| :---------- | :---------- |
| Patrones de Arquitectura (Ej.Patrón Capa) | Relacionados con el diseño a gran escala y de grano grueso, y que se aplican típicamente durante las primeras iteraciones cuando se establecen las estructuras y conexiones más importantes. |
| Patrones de Diseño o "micro-arquitectura" (EJ.Fachada, Estrategy) | <ul><li>Relacionados con el diseño de objetos y frameworks de pequeña y mediana escala..</li></ul> <ul><li>Aplicables al diseño de una solución para conectar los elementos de gran escala que se definen mediante patrones arquitecturales</li></ul> |
| Estilos (Ej.Singleton) | Soluciones de diseño a bajo nivel orientadas a la implementacion o al lenguaje |

## <u>Patrón de arquitectura: Capas</u>

### *Patrón de Arquitectura: Capas*
Este patrón se utiliza para estructurar programas que pueden descomponerse en grupos de tareas a nivel subfunción. Cada una de estas tareas se encuentra en una “capa”. Las capas son jerárquicas y cada una sirve a la capa superior y es servida por la capa inferior.

### *Ejemplo de capas en una aplicación web:*
- **Capa de presentación**: Es la interfaz de usuario de la aplicación.
- **Capa de negocio**: Aquí se procesan las reglas de negocio, validaciones, cálculos, etc.
- **Capa de acceso a datos**: En esta capa se maneja la comunicación con la base de datos.


## <u>Principios de separacion Modelo-Vista</u>

- Este principio se refiere a la separación de responsabilidades en la arquitectura de una aplicación. 
    - El *“Modelo”* se refiere a la lógica de negocio y los datos. 
    - La *“Vista”* es la interfaz de usuario y la presentación de los datos.

- La separación del Modelo y la Vista permite que los desarrolladores trabajen en diferentes partes de una aplicación sin afectar o causar problemas en la otra. También mejora la escalabilidad y la mantenibilidad del código.

- Ejemplo de este principio es el patrón de diseño MVC (Modelo-Vista-Controlador) que se utiliza en muchas aplicaciones web.