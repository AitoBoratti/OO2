# 2.3 Publicacion
**Consigna:** Para el siguiente codigo, realice en forma iterativa los siguientes pasos:
1. indique el mal olor,
2. indique el refactoring que lo corrige, 
3. aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda). 

Si vuelve a encontrar un mal olor, retorne al paso 1.

**UML Proporcionado**

<img src="img/UML_2.3.png" width="70%">

**Codigo Proporcionado**
```Java 
/**
* Retorna los últimos N posts que no pertenecen al usuario user
*/
public List<Post> ultimosPosts(Usuario user, int cantidad) {
        
    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
    for (Post post : this.posts) {
        if (!post.getUsuario().equals(user)) {
            postsOtrosUsuarios.add(post);
        }
    }
        
   // ordena los posts por fecha
   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
       int masNuevo = i;
       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
     postsOtrosUsuarios.get(masNuevo).getFecha())) {
              masNuevo = j;
           }    
       }
      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
      postsOtrosUsuarios.set(masNuevo, unPost);    
   }
        
    List<Post> ultimosPosts = new ArrayList<Post>();
    int index = 0;
    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
    while (postIterator.hasNext() &&  index < cantidad) {
        ultimosPosts.add(postIterator.next());
    }
    return ultimosPosts;
}
```
---
## Solucion:
<br>

**Code Smell:** Metodo demasiado largo

**Refactoring:** Se deberia emplear la tecnica de **Extract Method**. 

1. Cree un nuevo método y asígnele un nombre que haga evidente su propósito.
2. Copie el fragmento de código relevante en su nuevo método. Elimine el fragmento de su ubicación anterior y haga una llamada para el nuevo método allí.
3. Encuentre todas las variables utilizadas en este fragmento de código. Si se declaran dentro del fragmento y no se usan fuera de él, simplemente déjelas sin cambios: se convertirán en variables locales para el nuevo método.
4. Si las variables se declaran antes del código que está extrayendo, deberá pasar estas variables a los parámetros de su nuevo método para usar los valores contenidos anteriormente en ellos. A veces es más fácil deshacerse de estas variables recurriendo a Replace Temp with Query .
5. Si ve que una variable local cambia en su código extraído de alguna manera, esto puede significar que este valor modificado será necesario más adelante en su método principal. ¡Doble verificación! Y si este es el caso, devuelva el valor de esta variable al método principal para que todo siga funcionando.
```Java 
public class PostApp {
	private List<Post> posts;
    
    private List<Post> getPostsDeOtrosUsuarios(){
        List<Post> postsOtrosUsuarios = new ArrayList<Post>();
        for (Post post : this.posts) {
            if (!post.getUsuario().equals(user)) {
                postsOtrosUsuarios.add(post);
            }
        }
        return postsOtrosUsuarios;
    }

    private List<Post> ordenarPostPorFecha(List<Post> postsOtrosUsuarios){
        for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
        int masNuevo = i;
        for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
            if (postsOtrosUsuarios.get(j).getFecha().isAfter(postsOtrosUsuarios
                .get(masNuevo).getFecha())) {
                masNuevo = j;
            }    
        }
        Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
        postsOtrosUsuarios.set(masNuevo, unPost);    
    }
    }

        /**
        * Retorna los últimos N posts que no pertenecen al usuario user
        */
    public List<Post> ultimosPosts(Usuario user, int cantidad) {

        List<Post> postsOtrosUsuarios = getPostsDeOtrosUsuarios();
    // ordena los posts por fecha
        postsOtrosUsuarios = ordenarPostPorFecha(porOtrosUsuarios);

        List<Post> ultimosPosts = new ArrayList<Post>();
        int index = 0;
        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
        while (postIterator.hasNext() &&  index < cantidad) {
            ultimosPosts.add(postIterator.next());
        }
        return ultimosPosts;
    }
}
```
**Code Smell:** Nombre poco descriptivo

**Refactoring:** Utilizaremos la tecnica de Rename methods.
   1. Vea si el método está definido en una superclase o subclase. Si es así, también debe repetir todos los pasos en estas clases.
   2. El siguiente método es importante para mantener la funcionalidad del programa durante el proceso de refactorización. Cree un nuevo método con un nuevo nombre. Copie el código del método anterior. Elimine todo el código del método anterior y, en su lugar, inserte una llamada para el nuevo método.
   3. Encuentre todas las referencias al método anterior y reemplácelas con referencias al nuevo.
   4. Eliminar el método antiguo. Si el método anterior es parte de una interfaz pública, no realice este paso. En su lugar, marque el método antiguo como obsoleto.

```Java 
public class PostApp {
	private List<Post> posts;
        
    private List<Post> getPostsDeOtrosUsuarios(Usuario user){
        List<Post> postsOtrosUsuarios = new ArrayList<Post>();
        for (Post post : this.posts) {
            if (!post.getUsuario().equals(user)) {
                postsOtrosUsuarios.add(post);
            }
        }
        return postsOtrosUsuarios;
    }

    private List<Post> ordenarPostPorFecha(List<Post> postsOtrosUsuarios){
        for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
        int masNuevo = i;
        for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
            if (postsOtrosUsuarios.get(j).getFecha().isAfter(postsOtrosUsuarios.get(masNuevo).getFecha())) {
                masNuevo = j;
            }    
        }
        Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
        postsOtrosUsuarios.set(masNuevo, unPost);    
    }
    }

        /**
        * Retorna los últimos N posts que no pertenecen al usuario user
        */
    public List<Post> ultimosPostsDeOtrosUsuarios(Usuario user, int cantidad) {
        List<Post> postsOtrosUsuarios = getPostsDeOtrosUsuarios();
    // ordena los posts por fecha
        postsOtrosUsuarios = ordenarPostPorFecha(porOtrosUsuarios);

        List<Post> ultimosPosts = new ArrayList<Post>();
        int index = 0;
        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
        while (postIterator.hasNext() &&  index < cantidad) {
            ultimosPosts.add(postIterator.next());
        }
        return ultimosPosts;
    }
}
```
**Code Smell:** Reinventar la rueda.

**Refactoring:** Replace Loop with Pipeline
1. Identificar el bucle existente: Localiza el bucle en tu código que realiza la iteración sobre una colección de elementos.
2. Crear un Stream: Crea un Stream a partir de la colección de elementos utilizando el método stream() o parallelStream().
3. Encadenar operaciones: Encadena las operaciones funcionales (filter, map, reduce, etc.) en el Stream. Estas operaciones representarán las transformaciones y filtrados que se aplicarán a los elementos del Stream.
4. Reemplazar las operaciones del bucle: Examina el cuerpo del bucle y reemplaza las operaciones que se realizan en cada iteración con las correspondientes operaciones funcionales en el Stream.
5. Ejecutar la tubería (pipeline): Utiliza un método terminal, como forEach, collect, reduce u otros, para ejecutar la tubería (pipeline) y obtener el resultado deseado.
6. Validar y probar: Asegúrate de que el resultado de la tubería de operaciones sea equivalente al resultado original del bucle. Realiza pruebas exhaustivas para confirmar que el comportamiento sea el esperado.

```Java 
public class PostApp {
	private List<Post> posts;
    
    private List<Post> getPostsDeOtrosUsuarios(Usuario user){
        return this.posts.stream().filter(usuario -> !usuario.getUsuario().equals(user)).collect(collectors.toList()).orElse(null);
    }

    private List<Post> ordenarPostPorFecha(List<Post> postsOtrosUsuarios){
        return postsOtrosUsuarios.stream().sorted((post1, post2) -> post2.getFecha().compareTo(post1.getFecha())).collect(Collectors.toList());
    }

    public List<Post> ultimosPostsDeOtrosUsuarios(Usuario user, int cantidad) {
        List<Post> postsOtrosUsuarios = getPostsDeOtrosUsuarios(user);
        postsOtrosUsuarios = ordenarPostPorFecha(porOtrosUsuarios);
        return postsOtrosUsuarios.stream().limit(cantidad).collect(Collectors.toList());
    }
}
```

