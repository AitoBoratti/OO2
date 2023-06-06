# Criterios y heurísticas de diseño (versión 0.2 - Java)
El objetivo de este documento es ayudarnos a evaluar críticamente y en detalle nuestros diseños y programas orientados a objetos, en términos de los conceptos vistos en Orientación a Objetos 1. Podemos utilizarlo como un checklist cada vez que resolvemos un ejercicio, cuando ayudamos a un compañero a analizar sus programas, o incluso cuando nos preparamos para un exámen. 

**Nota:** Esta lista es una guía pero no es exhaustiva. Posiblemente otras buenas prácticas y conceptos de programación orientada a objetos no están listados aquí.

No todos los ítems nos van a sonar claros al principio. Los iremos encontrando y entendiendo gradualmente. Ante la duda, preguntamos. 

## Malos olores de diseño
Los siguientes son malos olores en el diseño OO que no deberían estar presentes en nuestros programas una vez que completamos Orientación a Objetos 1. Debemos saber reconocerlos y evitarlos:

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Envidia de atributos:** soy un objeto que pide cosas a otros objetos para hacer algo yo mismo (por ejemplo un cálculo)  
Para evitarlo: la tarea la debe hacer el objeto que tiene las cosas que se necesitan; delegárselo a él.

*Técnica adecuada de refactoring:* Aplicar la técnica de mover métodos (Move Method) para trasladar la lógica de cálculo u operación al objeto que posee los datos requeridos, de modo que el objeto envidioso de atributos no tenga que solicitarlos constantemente.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Clase Dios:** Una clase que resuelve todo y las demás están todas anémicas (ver clases anémicas). Una clase así no cumple el principio de "una sola responsabilidad". Seguramente, si me pregunto qué hace, tengo que decir "hace tal cosa y además... ". Probablemente también haya 'envidia de atributos' si es que otros objetos, al menos, tienen información. Para evitarlo: Ver qué otros objetos podría hacer aparecer, que se puedan encargar de alguna de las responsabilidades de éste. Ver cuál de los objetos que este objeto conoce podría ser responsable de algo que ahora hace él.

*Técnica adecuada de refactoring:* Aplicar el principio de responsabilidad única (SRP) y dividir las responsabilidades de la clase en otras clases más pequeñas y cohesivas.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Código duplicado:** Si hago Ctrl+C Ctrl+V (copiar y pegar) estoy metiendo la pata. Para evitarlo: ¿No puedo generalizar ese comportamiento en una clase y heredarlo? ¿No puedo llevarlo a otro objeto y re-utilizarlo por composición? ¿No puedo extraerlo en un método en la misma clase y re-usarlo?

*Técnica adecuada de refactoring:* Aplicar la extracción de método (Extract Method) o la extracción de clase (Extract Class) para eliminar la duplicación y promover la reutilización de código.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Clase larga:** Tengo una clase muy grande en comparación al resto. Para evitarlo: ¿No será que esa clase puede delegar algo en otros objetos a los que conoce? ¿No será que esa clase modela más de una cosa? (Puedo pensarla como una composición de varios objetos).

*Técnica adecuada de refactoring:* Aplicar la extracción de clase (Extract Class) o la extracción de interfaz (Extract Interface) para dividir la clase en componentes más pequeños y cohesivos.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Método largo:** Si un método tiene más de 10 renglones, es mala señal. Si debo incluir comentarios en medio de un método, es mala señal. Para evitarlo: Identificar dentro del método largo, partes que podría considerar comportamientos individuales. Llevar cada parte a un nuevo método (con un buen nombre) y cuando necesite llevar a cabo uno de esos comportamientos, enviar mensajes a this.

*Técnica adecuada de refactoring:* Aplicar la extracción de método (Extract Method) para dividir el método en métodos más pequeños y cohesivos, y utilizar la técnica de envío de mensajes (Message Sending) para delegar tareas a otros objetos.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Objetos que conocen el id de otro:** Nunca relacionar objetos por medio de claves o ids!! Para evitarlo: Cuando un objeto se relaciona con otro, lo hace con una referencia. Nunca conoce su id (incluso aunque los objetos tengan id).

*Técnica adecuada de refactoring:* Utilizar referencias de objetos en lugar de identificadores para establecer relaciones entre objetos.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Eso debería ser un objeto (obsesión por los primitivos):** A veces modelamos como strings o números cosas que deberían ser objetos. Cuando hacemos eso, el comportamiento que debería tener ese objeto termina estando en un lugar que no corresponde.

*Técnica adecuada de refactoring:* Aplicar la técnica de Objeto Valor (Value Object) para modelar adecuadamente conceptos que se representan como primitivos.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Switch statements:** Los switch statements se tornan problemáticos cuando se utilizan para tomar decisiones en diferentes lugares del código. Para evitarlo: Si tengo que tomar decisiones según el tipo de objeto, usar polimorfismo.

*Técnica adecuada de refactoring:* Aplicar el polimorfismo utilizando la técnica de reemplazo de condicional con polimorfismo (Replace Conditional with Polymorphism) para evitar estructuras de control extensas.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Variables de instancia que en realidad deberían ser temporales:** A veces tengo atributos en un objeto que solo son relevantes durante el ciclo de vida de un método. Para evitarlo: Si una variable solo es usada dentro de un método, declararla como variable local dentro del método y eliminarla como variable de instancia.

*Técnica adecuada de refactoring:* Mover las variables a nivel local dentro de los métodos en los que se utilizan y eliminarlas como variables de instancia si ya no tienen sentido en todo el ciclo de vida del objeto.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Romper encapsulamiento:** A veces tenemos clases que exponen sus atributos directamente a otras clases, rompiendo el encapsulamiento. Para evitarlo: Si una clase necesita acceder a los atributos de otra clase, proporcionar métodos de acceso (getters) y métodos de modificación (setters) en lugar de acceder directamente a los atributos.

*Técnica adecuada de refactoring:* Utilizar adecuadamente los principios de encapsulamiento y proporcionar métodos de acceso (getters) y métodos de modificación (setters) solo cuando sea necesario.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Clase de datos o clase anémica:** Una clase que solo tiene atributos y no tiene comportamiento. Para evitarlo: Evaluar si la clase realmente debería tener comportamiento y, si es necesario, transferir ese comportamiento a otros objetos más adecuados.

*Técnica adecuada de refactoring:* Evaluar si la clase realmente debería tener comportamiento y, si es necesario, transferir ese comportamiento a otros objetos más adecuados.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• No es-un:** A veces tenemos una relación de herencia que no cumple el principio "es-un". Para evitarlo: Reevaluar la relación de herencia y asegurarse de que la subclase realmente cumpla el principio "es-un" en relación con la clase base. Considerar otras alternativas, como la composición, si la relación de herencia no es apropiada.

*Técnica adecuada de refactoring:* Reevaluar la jerarquía de clases y la relación de herencia si una clase redefine un método heredado de una manera que contradice el comportamiento esperado. Buscar alternativas para evitar la herencia no deseada.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• No quiero mi herencia:** A veces heredamos métodos que no queremos. Para evitarlo: Reconsiderar la jerarquía de clases y la relación de herencia si una clase redefine un método heredado de una manera que contradice el comportamiento esperado. Buscar alternativas para evitar la herencia no deseada.

*Técnica adecuada de refactoring:* Reconsiderar la jerarquía de clases y la relación de herencia si una clase redefine un método heredado de una manera que contradice el comportamiento esperado. Buscar alternativas para evitar la herencia no deseada.

----------------------------------------------------------------------------------------------------------------------------------------------------

**• Reinventar la rueda:** A veces reescribimos funcionalidad que ya existe en lugar de reutilizarla. Para evitarlo: Investigar si ya existe una implementación o biblioteca que proporcione la funcionalidad requerida y utilizarla en lugar de reinventarla.

*Técnica adecuada de refactoring:* Investigar si ya existe una implementación o biblioteca que proporcione la funcionalidad requerida y utilizarla en lugar de reinventarla.

----------------------------------------------------------------------------------------------------------------------------------------------------

## Estilo de programación 
Los siguientes son patrones de estilo y buenas prácticas de programación que deberían  respetar nuestros programas.

**• Ofrecer constructores:** Simplifica la tarea de quien crea los objetos. Garantizan una buena inicialización.

**• Nombre de mensaje que revela la intención:**  Que el nombre del mensaje comunique lo que se quiere hacer, no cómo.

**• Delegación a this:** Permite descomponer un método en partes que el mismo objeto resuelve. Cada método hace una cosa. Su nombre indica lo que hace. Quedan todos cortos. Permite que la subclase redefina/extienda solo un paso. 

**• Métodos cortos:** Siempre prefiere tener métodos cortos. Para lograrlo utiliza delegación a this. Para que sean más fáciles de leer, utiliza nombres de mensajes que revelen la intención (servirán como documentación de lo que hace el código)

**• Cada cosa se hace una sola vez:** Para ello es importante aprender el protocolo de colecciones y otros objetos frecuentemente utilizados. Es recomendable explorar el protocolo de los objetos que voy a utilizar antes de comenzar a programar.

**• Los nombres de las variables deben indicar su rol:** Elige los nombres de las variables para que quede claro qué rol cumplen en el método / clase. Los nombres de variables siempre comienzan con minúscula. No temas a los nombres de las variables largos, con varias palabras y sintaxis de camello. 

**• Piensa bien los nombres de las clases:** Estos siempre inician con mayúscula y singular. No temas a los nombres de clase largos, con varias palabras y sintaxis de camello. Si se puede, que el nombre de la subclase ayude a reconocer que es un caso particular de la superclase (por ejemplo, agregando alguna palabra al nombre de la superclase para definir un caso especial:  EmpleadoDePlanta subclase de Empleado)
