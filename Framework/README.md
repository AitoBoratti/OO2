# Preguntas de Autoevaluacion

## 1. Cuando hablamos de reuso en el marco del desarrollo de software, ¿a qué nos referimos?
**Respuesta:** Cuando hablamos de reuso en el marco del desarrollo de software, nos referimos a la práctica de utilizar componentes, código, o estructuras existentes en el desarrollo de nuevos sistemas o aplicaciones. El objetivo es aprovechar el trabajo previo realizado y evitar tener que desarrollar todo desde cero.

<br>

## 2. ¿Cuáles son las dificultades que encontramos cuando intentamos reusar código?
**Respuesta:** Al intentar reusar código, pueden surgir algunas dificultades, como:

   **• Diseño inadecuado para el reuso:** El código original puede no haber sido diseñado pensando en su reutilización, lo que dificulta su adaptación a diferentes contextos.

   **• Acoplamiento y dependencias:** Si el código a reusar tiene muchas dependencias o está fuertemente acoplado a otras partes del sistema, puede ser difícil extraerlo y utilizarlo de manera aislada.

   **• Incompatibilidad de versiones:** El código a reusar puede depender de versiones específicas de bibliotecas o componentes, lo que puede causar conflictos con las versiones utilizadas en el nuevo proyecto.

   **• Documentación insuficiente:** La falta de documentación clara y completa sobre el código existente puede dificultar su comprensión y uso correcto.

## 3. Cuando aplicamos patrones de diseño, ¿qué estamos reusando? ¿De qué manera los patrones de diseño atacan las dificultades del reúso?
**Respuesta:** Al aplicar patrones de diseño, estamos reusando soluciones probadas y estandarizadas para problemas comunes en el desarrollo de software. Los patrones de diseño proporcionan soluciones generales y flexibles que se pueden adaptar a diferentes contextos. Al utilizar estos patrones, se abordan las dificultades del reúso al proporcionar abstracciones y estructuras bien definidas que facilitan la integración y la adaptación del código reutilizado.

## 4. Cuando utilizamos librerías de clases, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan las librerías de clases las dificultades de reúso? 
**Respuesta**: Cuando utilizamos librerías de clases, estamos reusando conjuntos de clases y funcionalidades predefinidas que se pueden utilizar en nuestras aplicaciones. Las librerías de clases suelen apuntar a casos específicos, como el manejo de bases de datos, la generación de informes o la interacción con interfaces de usuario. Estas librerías facilitan el reúso al proporcionar componentes y funcionalidades probadas que podemos utilizar en nuestras aplicaciones, evitando tener que desarrollar todo desde cero.

## 5. Cuando utilizamos frameworks orientados a objetos, ¿qué estamos reusando? ¿a qué casos apuntan? ¿De qué manera atacan los frameworks las dificultades de reúso? 
**Respuesta:** Los frameworks orientados a objetos nos permiten reusar una estructura de software completa, que incluye clases, interfaces y patrones de interacción entre los componentes. Al utilizar un framework, reusamos la arquitectura y el diseño subyacente, así como las funcionalidades y abstracciones definidas por el framework. Los frameworks están orientados a casos de uso específicos y nos proporcionan una estructura base sobre la cual podemos construir nuestra aplicación. Ayudan a abordar las dificultades del reúso al proporcionar una base estructural coherente y predefinida, que se puede extender y personalizar según nuestras necesidades.

## 6. Por lo general, ¿es posible y lógico reusar, de forma aislada, solo algunas clases de un framework? ¿es posible y lógico utilizar solo algunas clases de una librería de clases? Justifique. 
**Respuesta:** Es posible y lógico reusar solo algunas clases de un framework o de una librería de clases, siempre y cuando las clases seleccionadas sean independientes y no dependan fuertemente del contexto y las interacciones del framework en su totalidad. Sin embargo, es importante tener en cuenta que el reúso selectivo de clases puede limitar el beneficio general que se obtiene al utilizar un framework o una librería, ya que estas herramientas suelen estar diseñadas para funcionar de manera conjunta y aprovechar todas sus funcionalidades. **Dudoso**

## 7. De acuerdo a el tipo de problema que atacan, ¿como se clasifican los frameworks? 
**Respuesta:** Los frameworks se pueden clasificar en diferentes categorías según el tipo de problema que abordan. Algunas clasificaciones comunes incluyen: 

   **• Frameworks de aplicaciones:** Estos frameworks están diseñados para facilitar el desarrollo de aplicaciones completas, proporcionando una estructura y un conjunto de funcionalidades comunes para construir diferentes tipos de aplicaciones (por ejemplo, web, escritorio, móvil).

   **• Frameworks de persistencia:** Estos frameworks se enfocan en abstraer y facilitar la interacción con bases de datos y sistemas de almacenamiento, proporcionando una capa de abstracción y herramientas para el manejo de la persistencia de datos.

   **• Frameworks de pruebas:** Estos frameworks están diseñados para facilitar la escritura y ejecución de pruebas automatizadas, proporcionando estructuras y utilidades para la creación de casos de prueba y la verificación de resultados.

   **• Frameworks web:** Estos frameworks se centran en el desarrollo de aplicaciones web, proporcionando una estructura y herramientas para manejar la comunicación entre el servidor y el cliente, la gestión de rutas, la generación de vistas, entre otros aspectos relacionados con el desarrollo web.

## 8. ¿A que nos referimos con los términos hot spot y frozen spot?
**Respuesta:** El término "hot spot" se refiere a partes del código de un framework que se espera que sean modificadas o adaptadas por los usuarios para satisfacer requisitos específicos de su aplicación. Estos puntos de variabilidad pueden incluir métodos, clases o configuraciones que el usuario debe personalizar para que el framework se ajuste a sus necesidades. Por otro lado, el término "frozen spot" se refiere a partes del código de un framework que se espera que no sean modificadas por los usuarios y que representan la base y la estructura inmutable del framework.

## 9. ¿A qué nos referimos con "instanciar un framework"? ¿Qué sería "instanciar un hostpot"?
**Resouesta:** "Instanciar un framework" significa crear una instancia concreta del framework en una aplicación específica. Esto implica utilizar el framework como base para construir y desarrollar la aplicación, utilizando sus estructuras, abstracciones y funcionalidades proporcionadas. "Instanciar un hotspot" se refiere a adaptar o personalizar un punto de variabilidad específico dentro del framework para que se ajuste a los requisitos particulares de la aplicación.

## 10.¿En qué se diferencia la visión que tienen de un framework: a) los desarrolladores del framework, b) quienes usan/instancian el framework? 
**Resouesta:** La visión de los desarrolladores del framework se centra en diseñar y construir una base flexible y reutilizable que pueda adaptarse a diferentes contextos. Su objetivo principal es proporcionar una estructura general y herramientas útiles para el desarrollo de aplicaciones. Por otro lado, quienes usan o instancian el framework están más enfocados en aprovechar la estructura y las funcionalidades existentes para construir una aplicación específica. Se centran en personalizar y adaptar el framework según sus necesidades y requisitos particulares.

Un framework "blackbox" es aquel en el que los usuarios solo interactúan con las interfaces y los puntos de extensión definidos por el framework, sin tener conocimiento directo de su implementación interna. Por otro lado, un framework "whitebox" permite un mayor nivel de acceso y modificación a la implementación interna del framework. Un framework puede caer en una u otra categoría, o en algún punto intermedio, dependiendo de su diseño y las restricciones impuestas por sus desarrolladores.

Optar por un enfoque whitebox implica brindar a los usuarios una mayor flexibilidad y control para personalizar y adaptar el framework a sus necesidades específicas. Sin embargo, esto también puede aumentar la complejidad y la curva de aprendizaje para los usuarios. Por otro lado, optar por un enfoque blackbox puede ofrecer una mayor simplicidad y abstracción, lo que facilita el uso del framework, pero puede limitar la capacidad de personalización y adaptación a requisitos particulares.

Desde la perspectiva de quienes usan el framework, un framework whitebox brinda facilidades para adaptarlo y personalizarlo según las necesidades específicas de la aplicación. Sin embargo, esto también implica una mayor responsabilidad y esfuerzo por parte del usuario para comprender y modificar el código interno del framework. Por otro lado, un framework blackbox proporciona una interfaz más simple y abstraída, lo que facilita su uso, pero puede limitar la capacidad de adaptación a requisitos no previstos.

La cantidad de "puntos de variabilidad" o hotspots de un framework puede depender de la complejidad del dominio que el framework aborda y de cuántas cosas podrían cambiar de una aplicación a otra. En general, un framework tiende a tener más hotspots de los que el usuario promedio requiere, ya que los desarrolladores del framework intentan anticipar diferentes necesidades y requisitos. Sin embargo, no siempre es necesario instanciar o configurar todos los hotspots. El diseñador del framework puede proporcionar valores predeterminados o implementaciones genéricas para los hotspots más comunes, reduciendo así el trabajo de instanciación en los casos más simples.

Algunos patrones de diseño que son comunes en los hotspots de un framework incluyen el patrón Template Method, que permite personalizar ciertos pasos o comportamientos en un algoritmo, y el patrón Strategy, que permite seleccionar y cambiar entre diferentes algoritmos o estrategias. Estos patrones brindan flexibilidad y permiten que los usuarios adapten el comportamiento del framework según sus necesidades específicas.

El uso de conceptos como templates y hooks (plantillas y ganchos) puede afectar el comportamiento en tiempo de ejecución de las aplicaciones que instancian el framework o el hotspot. Al proporcionar plantillas o métodos de extensión, el framework permite a los usuarios personalizar partes específicas del comportamiento sin modificar la estructura principal. Esto puede influir en cómo se ejecuta el código dentro del framework o cómo interactúan los componentes personalizados con el resto del sistema.

Es importante tener en cuenta que un hotspot es un concepto abstracto que puede manifestarse en diferentes formas en el código. Puede ser desde un método individual hasta un conjunto de clases a subclasificar o configurar/componer. La granularidad de los hotspots puede variar según las necesidades del framework y los requisitos del usuario.

Cuando se enfrenta a un dominio nuevo y se busca reusar en el futuro, puede tener sentido enfocarse en construir un framework como primer paso. Sin embargo, es importante tener en cuenta el equilibrio entre la inversión inicial en el desarrollo del framework y los beneficios esperados a largo plazo. Antes de construir un framework completo, puede ser beneficioso realizar un análisis del dominio y comenzar por identificar patrones comunes, principios de diseño y componentes reutilizables. Luego, se puede comenzar con la construcción gradual del framework, priorizando los aspectos más críticos y que brinden el mayor valor en términos de reúso futuro.

En cuanto a los pasos para eventualmente poder reusar, algunos puntos clave incluyen:

Identificar patrones y componentes reutilizables en el dominio: Realizar un análisis del dominio y buscar patrones comunes, funcionalidades que se repiten o abstracciones que pueden ser útiles en futuros desarrollos.

Aplicar principios de diseño sólidos: Utilizar principios de diseño como la modularidad, la cohesión y el bajo acoplamiento para crear componentes y estructuras que sean independientes y reutilizables.

Documentar y organizar el código: Mantener una buena documentación del código y organizarlo de manera estructurada facilitará el reúso en el futuro. Esto incluye proporcionar comentarios claros, utilizar convenciones de nomenclatura consistentes y estructurar el código en módulos y paquetes lógicos.

Crear librerías y componentes modulares: Identificar y separar funcionalidades específicas en librerías y componentes modulares que se puedan reutilizar en diferentes proyectos.

Establecer prácticas de control de versiones: Utilizar sistemas de control de versiones como Git para gestionar y organizar el código fuente, permitiendo rastrear cambios y facilitar la colaboración en el desarrollo de software.

Validar y probar los componentes reutilizables: Asegurarse de que los componentes reutilizables funcionen correctamente y estén probados adecuadamente antes de utilizarlos en diferentes proyectos.

Mantener y evolucionar las librerías y componentes: Realizar mejoras continuas en las librerías y componentes reutilizables, asegurándose de que estén actualizados y adaptados a las necesidades cambiantes.

Al seguir estos pasos, se puede sentar una base sólida para el reúso de código en el desarrollo de software y facilitar la creación de frameworks y librerías reutilizables.