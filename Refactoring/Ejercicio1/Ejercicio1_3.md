### 1.3 Cálculos 
Analice el código que se muestra a continuación. Indique qué code smells encuentra y cómo pueden corregirse.						

```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
			
}
```
###Code Smells:
    1. **Metodos con demasiadas responsabilidades**
    2. **Metodo Demasiado Largo**
	
###Solucion: 
    Yo crearia dos metodos independientes **promedioEdades()** y **totalSalario()**, dejando al metodo imprimirValores() 
	la unica funcion de imprimir lo que sea necesario, asi solucionando el problema con las responsabilidades y 
	la longitud del metodo.

```java
public double promedioEdades(){
    return personal.stream()
              .mapToDouble(empleado -> empleado.getEdad())
              .average().getAsDouble();
}

public double totalSalarios(){
    return personal.stream()
              .mapToDouble(empleado -> empleado.getSalario())
              .sum().getAsDouble();
}

public void imprimirValores() {
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades(), totalSalarios());
	System.out.println(message);
			
}
```