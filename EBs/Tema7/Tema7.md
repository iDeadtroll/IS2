# Tema 7: Diseño de Arquitectura Logica con Patrones

## Arquitectura del Software
Grandes ideas en las influencias, organización, estilos,
patrones, responsabilidades, colaboraciones, conexiones y
motivaciones de un sistema (o un sistema de sistemas), y los
subsistemas importantes
### Análisis arquitectural
- Investigación Arquitectural:
    - Identificacion de aquellos requisitos funcionales y no funcionales que influyen de manera significativa en el diseño del sistema, como tendencias del mercado, rendimiento, coste, mantenimiento, y puntos de evolucion.
- Diseño Arquitectural:
    - Resolucion de las influencias de los requisitos en el diseño mas relevante del sistema. Diseño del software, el hardware y las redes, operaciones, políticas, etc.

### Dimensiones y Vistas de la Arquitectura
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

### Clasificación de Patrones

| Tipos | Descripción |
| :---------- | :---------- |
| Patrones de Arquitectura (Ej.Patrón Capa) | Relacionados con el diseño a gran escala y de grano grueso, y que se aplican típicamente durante las primeras iteraciones cuando se establecen las estructuras y conexiones más importantes. |
| Patrones de Diseño o "micro-arquitectura" (EJ.Fachada, Estrategy) |  |
| Estilos (Ej.Singleton) |  |

## Patrón de arquitectura: Capas

## Principios de separacion Modelo-Vista