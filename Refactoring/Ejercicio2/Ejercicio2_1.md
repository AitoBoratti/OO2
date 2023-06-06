# 2.1 Empleados
**Consigna:** Para el siguiente codigo, realice en forma iterativa los siguientes pasos:
1. indique el mal olor,
2. indique el refactoring que lo corrige, 
3. aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda). 

Si vuelve a encontrar un mal olor, retorne al paso 1.

``` Java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico
            (this.horasTrabajadas * 500) 
            (this.cantidadHijos * 1000) 
            (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico 
            + (this.cantidadHijos * 2000)
            - (this.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
```
---
## Primer revision
**Code Smells:** Codigo Duplicado

**Refactoring para solucionarlo**: Se puede aplicar la tecnica de Extract Superclass
   1. Cree una superclase abstracta.
   2. Use Pull Up Field , Pull Up Method y Pull Up Constructor Body para mover la funcionalidad común a una superclase. Comience con los campos, ya que además de los campos comunes necesitará mover los campos que se usan en los métodos comunes.
   3. Busque lugares en el código del cliente donde el uso de subclases se pueda reemplazar con su nueva clase (como en las declaraciones de tipos).
```Java

public abstract class Empleado {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;

    public abstract double sueldo();

}

public class EmpleadoTemporario extends Empleado{
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    @Override
    public double sueldo() {
        return super.sueldoBasico
            (this.horasTrabajadas * 500) 
            (this.cantidadHijos * 1000) 
            (super.sueldoBasico * 0.13);
    }
}

public class EmpleadoPlanta extends Empleado{
    public int cantidadHijos = 0;
    // ......

    @Override
    public double sueldo() {
        return super.sueldoBasico 
            + (this.cantidadHijos * 2000)
            - (super.sueldoBasico * 0.13);
    }
}

public class EmpleadoPasante extends Empleado{
    // ......

    @Override
    public double sueldo() {
        return super.sueldoBasico - (super.sueldoBasico * 0.13);
    }
}

```
## Segunda revision

**Code Smell**: Romper encapsulamiento.

**Refactoring para solucionarlo**: Se puede aplicar la tecnica de Encapsuling Field, o encapsulamiento de metodo.
   1. Crea un getter y un setter para el campo.
   2. Encuentra todas las invocaciones del campo. Reemplace el recibo del valor del campo con el getter y reemplace la configuración de nuevos valores del campo con el setter.
   3. Después de que se hayan reemplazado todas las invocaciones de campo, haga que el campo sea privado.

```Java
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double sueldoBasico = 0;

    public double getSueldoBasico(){ return this.sueldoBasico;}
    public void setSueldoBasico(Double sueldoBasico){this.sueldoBasico = sueldoBasico;}
    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}

    public abstract double sueldo();
}

public class EmpleadoTemporario extends Empleado{
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double getHorasTrabajadas(){ return this.horasTrabajadas;}
    public int getCantidadHijos(){ return this.cantidadHijos;}

    @Override
    public double sueldo() {
        return this.getSueldoBasico()
            (this.getHorasTrabajadas() * 500) 
            (this.getCantidadHijos() * 1000) 
            (this.getSueldoBasico() * 0.13);
    }
}

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    // ......

    public int getCantidadHijos(){ return this.cantidadHijos;}
    
    @Override
    public double sueldo() {
        return this.getSueldoBasico() 
            + (this.getCantidadHijos() * 2000)
            - (this.getSueldoBasico() * 0.13);
    }
}

public class EmpleadoPasante extends Empleado{
    // ......

    @Override
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13);
    }
}
```
---
## Dudas: 
No se si seria correcto la colocacion de un Constructor ya que parece faltar, pero no se que tecnica de refactoring seria esa.

```java
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double sueldoBasico = 0;
    
    public Empleado(String nombre, String apellido, Double sueldoBasico){
            this.nombre = nombre;
            this.apellido = apellido;
            this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico(){ return this.sueldoBasico;}
    public void setSueldoBasico(Double sueldoBasico){this.sueldoBasico = sueldoBasico;}
    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}

    public abstract double sueldo();
}

public class EmpleadoTemporario extends Empleado{
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    public EmpleadoTemporario(String nombre, String apellido, Double sueldoBasico, Double horasTrabajadas, int cantidadHijos){
            Super(nombre,apellido,sueldoBasico);
            this.horasTrabajadas = horasTrabajadas;
            this.cantidadHijos = cantidadHijos;
    }

    public double getHorasTrabajadas(){ return this.horasTrabajadas;}
    public int getCantidadHijos(){ return this.cantidadHijos;}

    @Override
    public double sueldo() {
        return this.getSueldoBasico()
            (this.getHorasTrabajadas() * 500) 
            (this.getCantidadHijos() * 1000) 
            (this.getSueldoBasico() * 0.13);
    }
}

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    // ......
    public EmpleadoPlanta(String nombre, String apellido, Double sueldoBasico, Double cantidadHijos){
            Super(nombre,apellido,sueldoBasico);
            this.cantidadHijos = cantidadHijos;
    }

    public int getCantidadHijos(){ return this.cantidadHijos;}
    
    @Override
    public double sueldo() {
        return this.getSueldoBasico() 
            + (this.getCantidadHijos() * 2000)
            - (this.getSueldoBasico() * 0.13);
    }
}

public class EmpleadoPasante extends Empleado{
    // ......
    public EmpleadoPasante(String nombre, String apellido, Double sueldoBasico){
            Super(nombre,apellido,sueldoBasico);
    }
    @Override
    public double sueldo() {
        return this.getSueldoBasico() - (this.getSueldoBasico() * 0.13);
    }
}
```