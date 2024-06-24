tablero = [" " for _ in range(9)]

def mostrar_tablero():
    print(" | " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ")
    print(" | " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ")
    print(" | " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ")

def jugadores(turno, nombre):
    print(f"\nIngrese un número por favor {nombre} (jugador {turno})")
    while True:
        try:
            eleccion = int(input("Ingrese su movimiento (1-9):\n").strip())
            if 1 <= eleccion <= 9:
                if tablero[eleccion - 1] == " ":
                    tablero[eleccion - 1] = turno
                    break
                else:
                    print("Movimiento inválido: el espacio ya está ocupado, intente nuevamente:\n")
            else:
                print("Movimiento inválido: ingrese un número entre 1 y 9\n")
        except ValueError:
            print("Movimiento inválido\n")

def ganador(ga):
    if ((tablero[0] == ga and tablero[1] == ga and tablero[2] == ga) or
        (tablero[3] == ga and tablero[4] == ga and tablero[5] == ga) or
        (tablero[6] == ga and tablero[7] == ga and tablero[8] == ga) or
        (tablero[0] == ga and tablero[3] == ga and tablero[6] == ga) or
        (tablero[1] == ga and tablero[4] == ga and tablero[7] == ga) or
        (tablero[2] == ga and tablero[5] == ga and tablero[8] == ga) or
        (tablero[0] == ga and tablero[4] == ga and tablero[8] == ga) or
        (tablero[2] == ga and tablero[4] == ga and tablero[6] == ga)):
        mostrar_tablero()
        return True
    else:
        return False

def empate():
    if " " not in tablero:
        mostrar_tablero()
        return True
    else:
        return False

nombre_jugador1 = input("Nombre del jugador 1:\n")
nombre_jugador2 = input("Nombre del jugador 2:\n")

while True:
    mostrar_tablero()
    jugadores("x", nombre_jugador1)
    if ganador("x"):
        print(f"Felicitaciones {nombre_jugador1}, has sido el feliz ganador!")
        break
    elif empate():
        print(f"El juego entre {nombre_jugador1} y {nombre_jugador2} terminó empatado.")
        break
    mostrar_tablero()
    jugadores("o", nombre_jugador2)
    if ganador("o"):
        print(f"Felicitaciones {nombre_jugador2}, has sido el feliz ganador!")
        break
    elif empate():
        print(f"El juego entre {nombre_jugador1} y {nombre_jugador2} terminó empatado.")
        break
