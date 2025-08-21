public class Clase {
    public static void main(String[] args) {
        //estudiante 1 3,7 4,2 4,4 5
        // estudiante 2 3,8 3,5 4,9 5
        // estudiante 3 4,0 4,5 4,8 5

        double notas[][] = new double[3][4];
        // Estudiante 1
        notas[0][0] = 3.7;
        notas[0][1] = 4.2;
        notas[0][2] = 4.4;
        notas[0][3] = 5.0;

        // Estudiante 2
        notas[1][0] = 3.8;
        notas[1][1] = 3.5;
        notas[1][2] = 4.9;
        notas[1][3] = 5.0;

        // Estudiante 3
        notas[2][0] = 4.0;
        notas[2][1] = 4.5;
        notas[2][2] = 4.8;
        notas[2][3] = 5.0;

        //imprimir notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j]);
                suma += notas[i][j];
          
        }
            System.out.println("promedio: " + (suma / notas[i].length));
        }
    
    }
}
