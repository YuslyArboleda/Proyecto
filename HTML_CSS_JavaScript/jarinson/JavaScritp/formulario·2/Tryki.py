tablero = [" " for i in range(9)]

def imprimir_tablero():
    for i in range(3):
     fila = f'| {tablero[i*3]} | {tablero[i*3+1]} | {tablero[i*3+2]} |'
     print(fila)

def verificar_ganador():
    for i in range(0, 9, 3):
     if tablero[i] == tablero[i+1] == tablero[i+2] != " ":
      return True
    
    for i in range(3):
     if tablero[i] == tablero[i+3] == tablero[i+6] != " ":
      return True
    
    if tablero[0] == tablero[4] == tablero[8] != " " or tablero[2] == tablero[4] == tablero[6] != " ":
     return True
    return False    

def verifiar_empate():
 return " " not in tablero

def jugador(turno, nombre):
  print(f"\nTurno de {nombre}")

  while True:
        try:
            posicion = int(input("Ingresa tu movimiento (1-9):\n "))
            if posicion >= 1 and posicion <= 9:
                if tablero[posicion-1] == " ": 
                    tablero[posicion-1] = turno + ""
                    break
                else:
                    print("Casilla ocupada. Por favor, intenta nuevamente.\n")
            else:
                print("Movimiento inválido. Ingresa un número entre 1 y 9.\n")
        except ValueError:
          print("Movimiento inválido. Ingresa un número entero.\n")

jugador1_nombre = input("Nombre del Jugador 1: ")
jugador2_nombre = input("Nombre del Jugador 2: ")

while True:
    imprimir_tablero()
    jugador('x', jugador1_nombre)
    if verificar_ganador():
        imprimir_tablero()
        print(f"Ganador: {jugador1_nombre}")
        break
    elif verifiar_empate():
        imprimir_tablero()
        print("Empate entre", jugador1_nombre, "y", jugador2_nombre)
        break

    imprimir_tablero()
    jugador('o', jugador2_nombre)
    if verificar_ganador():
        imprimir_tablero()
        print(f"Ganador: {jugador2_nombre}")
        break
  
