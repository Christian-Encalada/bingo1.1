package bingo;
import java.util.Scanner;

public class Menu {
    
public void incio() {
    try (Scanner input = new Scanner(System.in)) {
        int elegir;
		System.out.println("--------BIENVENIDOS AL JUEGO DE BINGO SELECIONE LA TABLA, 1: TABLA90   ----------------   2: PARA TABLA 75  ---------");
		
		elegir = input.nextInt();

		switch (elegir) {
            case 1 -> {
                Bingo bingo90 = new Bingo90();
                bingo90.jugar();
            }
            case 2 -> {
                Bingo bingo75 = new Bingo75();
                bingo75.jugar();
            }

    	}
    }
 }
} 