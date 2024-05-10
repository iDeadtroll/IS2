# Tema 6: Introducción a la Arquitectura Software
## ¿Que es el Diseño Arquitectónico?
 Los grandes sistemas se descomponen en subsistemas que proporcionan algún conjunto de servicios relacionados. El proceso de diseño inicial que identifica estos subsistemas y establece un marco para el control y comunicacion de los subsistemas se llama diseño arquitectonico.

## La arquitectura depende de requisitos no funcionales

| Requisitos no funcionales | Descripción |
| :-----------------------: | :---------: |
| Rendimiento | Operaciones críticas en un pequeño número de subsistemas, con tan poca comunicación como sea posible entre estos subsistemas. |
| Protección | Arquitectura estructurada en capas, con los recursos más críticos protegidos en las capas más internas, aplicando una validación de seguridad de alto nivel en esas capas. |
| Seguridad | Operaciones relacionadas con la seguridad en un único subsistema. |
| Disponibilidad | Incluir componentes redundantes para que sea posible reemplazar y actualizar componentes sin detener el sistema. |

## Modelos arquitectónicos posibles a desarrollar

| Tipo de Modelo | Descripción |
| :------------: | :---------: |
| Estructural Estático | Muestra los subsistemas o componentes que han sido desarrollados como unidades separadas. |
| Proceso Dinámico | Muestra cómo se organiza el sistema en procesos en tiempo de ejecucion |
| Interfaz | Define los servicio ofrecidos por cada subsitema a través de si interfaz pública |
| Relaciones | Muestra las relaciones entre los subsistemas |
| Distribución | Cómo se distribuyen los subsitemas entre los computadores |


## Organización del sistema
### ¿Qué es la organización del sistema?
La organización de un sistema refleja las estrategias básica usada para estructurar dicho sistema
### Modelos
- Modelo Repositorio ( monolítico )
    - Los subsistemas deben intercambiar información para que puedan trabajar conjuntamente de forma efectiva
        - Todos los datos compartidos se almacenan en una base de datos central a la que pueden acceder por por todos los subsistemas.
        - Cada subsistema mantiene su propia base de datos. Los datos se intercambian con otros subsistemas mediante el paso de mensajes entre ellos.

      
| Ventajas | Deventajas |
| :-------: | :----: |
|  Forma eficiente de compartir grandes cantidades de datos  | Los subsistemas deben estar acordes con el modelo de datos del repositorio ( rendimiento y problemas incorporar nuevos subsistemas)|
| Los subsistemas que producen datos no necesitan conocer cómo se utilizan sus datos por otros subsistemas  | La evolucion es dificil a medida que se genera un gran volumen de informacion (traduccion a un nuevo modelo)|

![Descripción de la imagen](https://github.com/iDeadtroll/IS2/blob/main/EBs/Tema6/clipboard-image-1715055847.png?raw=true
)


- Modelo Cliente-Servidor
    - El sistema se organiza como un conjunto de servicios y servidores asociados, más unos clientes que acceden y usan los servicios.
    - Componentes:
        - Un conjunto de servidores que ofrecen servicios a otros subsistemas ( servidores de impresion, servidores de compilacion )
        - Un conjuntoi de clientes que llaman a los servicios ofrecidos por los servidores.
        - Una red que permite a los clientes acceder a estos servicios.

<image src="https://github.com/iDeadtroll/IS2/blob/main/EBs/Tema6/clipboard-image-1715055997.png?raw=true" alt="Descripción de la imagen">

- Modelo de Capas (3 capas)
    - El sistema se organiza en capas, cada una de las cuales proporciona un conjunto de servicios.
        | Capa | Descripcion |
        | :--: | :---------: |
        | Presentacion | Presentar informacion e interactuar con las capas inferiores externas |
        | Lógica de la Aplicación | Implementa la lógica de negocio solicitada por los clientes |
        | Acceso a Datos | Gestiona todos los elementos de informacion |

<image src="https://github.com/iDeadtroll/IS2/blob/main/EBs/Tema6/clipboard-image-1715056079.png?raw=true" alt="Descripción de la imagen">


- Modelo de Capas (Capa de Persistencia)
    - Implementar las operaciones CRUD:
        - En las propias clases persistentes
            - Las son dependientes de la BD. (Oracle, MySql)
        - Clases asociadas que sólo se encargan de la persistencia.
            - La clase dominio/negocio se olvida de la resposabilidad de la persistencia
            - Las clases en las que se ha incorporado la responsabilidad de gestionar la persistencia se dedica sólo a aeso. Un cambio en el gestor de BD afectaría únicamente a un conjunto reducido de clases.

    - Acceso a la base de datos:
        - Contrucción completa de sentencias SQL.
        - Utilizar sentencias preparadas y pasar los valores por parámetros.
        - Llamar a procedimientos almacenados, que residen en el gestor de base de datos.

## Estilos de descomposición Modular
### Subsistema vs Módulo
| Subsistema | Módulo |
| :-------- | :-----|
| Un subsistema es un sistema en si mismos, cuyo funcionamiento no depende de los servicios proporcionador por otros subsistemas. Los subsistemas se decomponen en módulos | Un módulo es normalmente un componente de un subsistema que proporciona uno o más servicios a otros módulos. A su vez éste usa servicios proporcionados por otros módulos |

### Estrategias principales
- Descomposición orientada a objetos:
    - Se descomponen en un conjunto de objetos que se comunican.
    - Diagramas de Clases UML.

- Descomposición orientada a flujos de funciones:
    - Se descompone en módulos funcionales que aceptan datos y los transforma en datos de salida.