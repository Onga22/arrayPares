package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayPares {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num = 0;
        int cont = 0;
        List<Integer> pares = new ArrayList();

        while (cont < 5) {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
              if (num % 2 == 0) {
                cont++;
                pares.add(num);

            
            
    
}
          
            }
    JOptionPane.showMessageDialog(null, "Los numeros pares ingresados son : " + pares);
        }

       

    }

