package Clase2;

public class Biblioteca {
    public static void main(String[] args) {
        String libros[] =new String[10];
        libros[0] = "El principito";
        libros[1] = "el señor de los anillos";
        libros[2] = " La biblia";
        libros[3] = "El quijote";
        libros[4] = "La divina comedia";
        libros[5] = "El principito";
        libros[6] = "El señor de los anillos";
        libros[7] ="La biblia";
        libros[8] = "El quijote";
        libros[9] = " El alquimista";

        for (int i =0; i < libros.length; i++){
            System.out.println(libros[i]);
        }

        System.out.println(libros[0]);
        System.out.println(libros[1]);
        System.out.println(libros.length+"");
    }
}
