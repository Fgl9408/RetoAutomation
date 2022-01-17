/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.mp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        String datos = "";
        int numeroLineasArchivo = 0;
        try {
            File archivoInsumo = new File("C:/Users/User/Documents/NetBeansProjects/mp1/src/main/java/pc/mp1/insumo.txt");
            Scanner lectorArchivoInsumo = new Scanner(archivoInsumo);

            if (archivoInsumo.exists()) {
                String[] divideFilaArchivo;
                ArrayList<String> lista = new ArrayList<String>();
                while (lectorArchivoInsumo.hasNextLine()) {
                    numeroLineasArchivo++;
                    datos = lectorArchivoInsumo.nextLine();
                    System.out.println(datos);
                    divideFilaArchivo = datos.split("-");;
                    lista.addAll(Arrays.asList(divideFilaArchivo));
                }
                System.out.println("---------------------");
                System.out.println("Numero Filas Archivo: "+ numeroLineasArchivo);
                System.out.println("---------------------");

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            }
            lectorArchivoInsumo.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error leyendo el archivo.");
            e.printStackTrace();
        }
    }

}
