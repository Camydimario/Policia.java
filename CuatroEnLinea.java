package cuatroenlinea;

/**
 * Clase que representa el juego clásico "Cuatro en Línea" (Connect Four).
 *
 * <p>
 * El juego se juega en un tablero de 6 filas por 7 columnas. Dos jugadores
 * (usualmente 'X' y 'O') se alternan turnos para insertar fichas en una de las
 * columnas del tablero. Las fichas caen hasta el fondo disponible en la
 * columna. <br>
 * Gana el primer jugador que logre alinear cuatro fichas consecutivas ya sea de
 * forma horizontal, vertical o diagonal.
 *
 * <p>
 * Reglas del juego:
 * <ul>
 * <li>El tablero comienza vacío.</li>
 * <li>Los jugadores se turnan, comenzando el jugador 'X'.</li>
 * <li>En cada turno, se elige una columna para insertar la ficha.</li>
 * <li>La ficha cae hasta la primera celda vacía en esa columna.</li>
 * <li>Si una columna está llena, no se puede jugar ahí.</li>
 * <li>El juego termina si un jugador logra 4 en línea o si el tablero se llena
 * sin ganador (empate).</li>
 * </ul>
 */
public class CuatroEnLinea {
     private char[][] tablero;
    private boolean hayGanador;
    private char turno;

	/**
	 * Inicializa un nuevo tablero.
	 *
	 * @post crea el tablero vacío de 6 filas por 7 columnas
	 * @post no hay ganador asignado
	 * @post el turno actual pertenece al jugador 'X'.
	 */
	public CuatroEnLinea() {
        this.tablero = new char[6][7];
        this.hayGanador = false;
        this.turno = 'X';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.tablero[i][j] = '-';
            }
        }
    }
	

	/**
	 * Inserta una ficha del jugador actual en la columna especificada.
	 *
	 * @pre 1 ≤ columna ≤ 7
	 * @pre !columnaLlena(columna)
	 * @pre !terminoPartida()
	 * @post la ficha caerá hasta la posición más baja disponible en esa columna
	 * @post se alterna el turno al otro jugador
	 * @post puede cambiar el estado de la partida
	 * @param columna número de columna
	 */
	public void insertarFicha(int columna) {
          if (columna < 1 || columna > 7) {
        System.out.println("Columna inválida");
                return;
    }
    if (columnaLlena(columna)) {
        System.out.println("La columna está llena");
        return;
    }
    if (terminoPartida()) {
        System.out.println("La partida ha terminado");
        return;
    }
    // Inserta la ficha en la columna sin usar break
    int fila = 5;
    while (fila >= 0 && this.tablero[fila][columna - 1] != '-') {
        fila--;
    }
    
    if (fila >= 0) {
        this.tablero[fila][columna - 1] = this.turno;
    }
    // Verifica si hay un ganador
    if (hayGanador()) {
        this.hayGanador = true;
    }
    // Alterna el turno
    this.turno = (this.turno == 'X') ? 'O' : 'X';
}
    
      

	/**
	 * Devuelve el símbolo que ocupa una celda del tablero.
	 *
	 * @pre 1 ≤ fila ≤ 6 ∧ 1 ≤ columna ≤ 7
	 * @param fila    número de fila
	 * @param columna número de columna
	 * @return 'X', 'O' o '-' si la celda está vacía
	 */
	public char obtenerSimboloEn(int fila, int columna) {
     if (fila < 1 || fila > 6 || columna < 1 || columna > 7) {
            return '-';
        }
        return this.tablero[fila - 1][columna - 1];
    }

	/**
	 * Indica el jugador actual ('X' o 'O').
	 *
	 * @return símbolo del jugador que debe jugar a continuación
	 */
	public char turnoActual() {

		return this.turno;
	}

	/**
	 * Verifica si el juego terminó.
	 * 
	 * <p>
	 * El juego termina si hay un ganador o si el tablero está completamente lleno.
	 *
	 * @return {@code true} si la partida terminó, {@code false} si aún se puede
	 *         jugar
	 */
	public boolean terminoPartida() {
         return this.hayGanador || tableroLleno();
		
	}

	/**
	 * Informa si hay un ganador en la partida.
	 *
	 * <p>
	 * Se considera ganador al primer jugador que forme una línea de 4 fichas
	 * consecutivas de su símbolo en horizontal, vertical o diagonal.
	 *
	 * @return {@code true} si hay ganador, {@code false} en caso contrario
	 */
	public boolean hayGanador() {
        // Verifica horizontalmente
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (this.tablero[i][j] != '-' && this.tablero[i][j] == this.tablero[i][j + 1] && this.tablero[i][j] == this.tablero[i][j + 2] && this.tablero[i][j] == this.tablero[i][j + 3]) {
                    return true;
                }
            }
        }
        // Verifica verticalmente
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (this.tablero[i][j] != '-' && this.tablero[i][j] == this.tablero[i + 1][j] && this.tablero[i][j] == this.tablero[i + 2][j] && this.tablero[i][j] == this.tablero[i + 3][j]) {
                    return true;
                }
            }
        }
        // Verifica diagonalmente (de arriba a abajo)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (this.tablero[i][j] != '-' && this.tablero[i][j] == this.tablero[i + 1][j + 1] && this.tablero[i][j] == this.tablero[i + 2][j + 2] && this.tablero[i][j] == this.tablero[i + 3][j + 3]) {
                    return true;
                }
            }
        }
        // Verifica diagonalmente (de abajo a arriba)
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (this.tablero[i][j] != '-' && this.tablero[i][j] == this.tablero[i - 1][j + 1] && this.tablero[i][j] == this.tablero[i - 2][j + 2] && this.tablero[i][j] == this.tablero[i - 3][j + 3]) {
                    return true;
                }
            }
        }
        return false;
    }
        


	/**
	 * Devuelve el símbolo del jugador ganador.
	 *
	 * @pre hayGanador()
	 * @return 'X' o 'O'
	 */
	public char obtenerGanador() {
          if (this.hayGanador) {
            return this.turno == 'X' ? 'O' : 'X';
        }
        return '-';
   
	}

	/**
	 * Informa si una columna está completamente llena.
	 *
	 * @pre 1 ≤ columna ≤ 7
	 * @param columna número de columna
	 * @return {@code true} si no hay espacio en esa columna, {@code false} en caso
	 *         contrario
	 */
	public boolean columnaLlena(int columna) {
           return this.tablero[0][columna - 1] != '-';
    
    }

	/**
	 * Verifica si el tablero está completamente lleno (sin celdas libres).
	 *
	 * @return {@code true} si el tablero está lleno, {@code false} si hay al menos
	 *         una celda vacía
	 */
	public boolean tableroLleno() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (this.tablero[i][j] == '-') {
                    return false;
                }
            }
        }
    
		return false;
	}

	/**
	 * Reinicia el tablero a su estado original vacío.
	 *
	 * <p>
	 * Se borra el contenido actual, se reinicia el turno al jugador 'X' y se
	 * reinicia el estado del juego.
	 */
	public void reiniciarPartida() {
         this.hayGanador = false;
        this.turno = 'X';
        // Inicializa el tablero vacío
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                this.tablero[i][j] = '-';
            }
        }
    }
 

	/**
	 * Devuelve una copia del estado actual del tablero.
	 *
	 * <p>
	 * La matriz devuelta representa el tablero de 6 filas por 7 columnas. Cada
	 * celda puede contener: - 'X' para el jugador X - 'O' para el jugador O - '-'
	 * si la celda está vacía
	 *
	 * <p>
	 * La matriz devuelta es una copia, por lo tanto, modificarla no afecta el
	 * estado interno del juego.
	 *
	 * @return una nueva matriz de 6x7 que representa el estado actual del tablero.
	 */
	public char[][] obtenerTablero() {
            // Creamos una nueva matriz para la copia
    char[][] copia = new char[6][7];
    
    // Copiamos cada elemento del tablero actual
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            copia[i][j] = this.tablero[i][j];
        }
    }
    
    return copia;
}

public static void main(String[] args) {
        CuatroEnLinea juego = new CuatroEnLinea();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("=== CUATRO EN LÍNEA ===");
        System.out.println("Instrucciones:");
        System.out.println("- Ingresa un número del 1 al 7 para colocar tu ficha");
        System.out.println("- Jugador X va primero, seguido por O");
        while (!juego.terminoPartida()) {
           
            System.out.print("Turno del jugador " + juego.turnoActual() + ". Elige columna (1-7): ");
            
            try {
                int columna = scanner.nextInt();
                juego.insertarFicha(columna);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ser un número del 1 al 7.");
                scanner.next(); // Limpiar buffer
            }
        }
        
        if (juego.hayGanador()) {
            System.out.println("\n¡El jugador " + juego.obtenerGanador() + " ha ganado!");
        } else {
            System.out.println("\n¡Empate! El tablero se llenó sin ganador.");
        }
        
        scanner.close();
    }
}




