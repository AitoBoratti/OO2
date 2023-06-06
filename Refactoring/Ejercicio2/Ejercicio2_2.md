# 2.2 Juego
**Consigna:** Para el siguiente codigo, realice en forma iterativa los siguientes pasos:
1. indique el mal olor,
2. indique el refactoring que lo corrige, 
3. aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda). 

Si vuelve a encontrar un mal olor, retorne al paso 1.


``` java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}
```
---
**Code Smells:** Envidia de atributos

**Refactoring para solucionarlo**: Se puede aplicar la tecnica de **Move Methods**.
   1. Si claramente se debe mover un método a otro lugar, use Move Method.
   2. Si solo una parte de un método accede a los datos de otro objeto, use Extraer método para mover la parte en cuestión.
   3. Si un método usa funciones de varias otras clases, primero determine qué clase contiene la mayoría de los datos usados. Luego coloque el método en esta clase junto con los otros datos. De manera alternativa, use Extraer método para dividir el método en varias partes que se pueden colocar en diferentes lugares en diferentes clases.


```Java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.incrementar();
    }
    public void decrementar(Jugador j) {
        j.decrementar();
    }
}

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;

    public void incrementar() {
        this.puntuacion =+ 100;
    }
    public void decrementar() {
        this.puntuacion =- 50;
    }
}
```
**Code Smells:** Falta o ruptura de encapsulamiento

**Refactoring para solucionarlo**: Se puede aplicar la tecnica de Encapsuling Field, o encapsulamiento de metodo.
   1. Crea un getter y un setter para el campo.
   2. Encuentra todas las invocaciones del campo. Reemplace el recibo del valor del campo con el getter y reemplace la configuración de nuevos valores del campo con el setter.
   3. Después de que se hayan reemplazado todas las invocaciones de campo, haga que el campo sea privado.
```Java
public class Juego {
    // ......
    public void incrementar(Jugador j) {
        j.incrementar();
    }
    public void decrementar(Jugador j) {
        j.decrementar();
    }
}

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;

    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}
    public int getPuntuacion(){ return this.puntuacion;}
    public void setPuntuacion(int puntuacion){ this.puntuacion = puntuacion}

    public void incrementar() {
        this.setPuntuacion(this.getPuntuacion()+100);
    }
    public void decrementar() {
        this.setPuntuacion(this.getPuntuacion()-50);
    }
}
```
**Code Smells:** Nombre poco descriptivo

**Refactoring para solucionarlo**: Utilizaremos la tecnica de Rename methods.
   1. Vea si el método está definido en una superclase o subclase. Si es así, también debe repetir todos los pasos en estas clases.
   2. El siguiente método es importante para mantener la funcionalidad del programa durante el proceso de refactorización. Cree un nuevo método con un nuevo nombre. Copie el código del método anterior. Elimine todo el código del método anterior y, en su lugar, inserte una llamada para el nuevo método.
   3. Encuentre todas las referencias al método anterior y reemplácelas con referencias al nuevo.
   4. Eliminar el método antiguo. Si el método anterior es parte de una interfaz pública, no realice este paso. En su lugar, marque el método antiguo como obsoleto.
```Java
public class Juego {
    // ......
    public void incrementarPuntuacion(Jugador j) {
        j.incrementarPuntuacion();
    }
    public void decrementarPuntuacion(Jugador j) {
        j.decrementarPuntuacion();
    }
}

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;

    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}
    public int getPuntuacion(){ return this.puntuacion;}
    public void setPuntuacion(int puntuacion){ this.puntuacion = puntuacion}

    public void incrementarPuntuacion() {
        this.setPuntuacion(this.getPuntuacion()+100);
    }
    public void decrementarPuntuacion() {
        this.setPuntuacion(this.getPuntuacion()-50);
    }
}
```
---
## Dudas: 
No se si seria correcto la colocacion de un Constructor ya que parece faltar, pero no se que tecnica de refactoring seria esa.

```java
public class Juego {
    // ......
    public void incrementarPuntuacion(Jugador j) {
        j.incrementarPuntuacion();
    }
    public void decrementarPuntuacion(Jugador j) {
        j.decrementarPuntuacion();
    }
}

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion;

    public Jugador(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntuacion = 0;
    }

    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}
    public int getPuntuacion(){ return this.puntuacion;}
    public void setPuntuacion(int puntuacion){ this.puntuacion = puntuacion}

    public void incrementarPuntuacion() {
        this.setPuntuacion(this.getPuntuacion()+100);
    }
    public void decrementarPuntuacion() {
        this.setPuntuacion(this.getPuntuacion()-50);
    }
}
```