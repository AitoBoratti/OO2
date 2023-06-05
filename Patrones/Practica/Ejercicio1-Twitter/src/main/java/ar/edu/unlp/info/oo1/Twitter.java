package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twitter {

    private List<Usuario> usuarios;

    public Twitter(List<Usuario> usuarios) {
        this.usuarios = new ArrayList<Usuario>();
    }

    public void createUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un nombre de usuario: ");
        String screenName = scanner.nextLine();
        while (!userDontExist(screenName)){
            System.out.println("Nombre de usuario ocupado. Intente nuevamente.");
            screenName = scanner.nextLine();
        }
        this.usuarios.add(new Usuario(screenName));
        scanner.close();
    }

    public void removerUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario a eliminar; ");
        String screenName = scanner.nextLine();
        Usuario user = usuarios.stream().filter(usuario -> usuario.getScreenName().equals(screenName)).findFirst().orElse(null);
        if (user == null){
            System.out.println("El usuario no existe");
        } else {
            user.eliminateAllTweets();
            this.usuarios.remove(user);
        }
    }
    private boolean userDontExist(String screenName){
        return usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(screenName));
    }
}

