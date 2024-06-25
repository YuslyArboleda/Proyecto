tablero = [" " for i in range(9)]

def colorTablero():
    for i in range(3):
        fila = f"|{tablero[i*3]}|{tablero[i*3+1]}|{tablero[i*3+2]}|"
        print(fila)

def jugador(turno, nombre):
    print(f"Turno de {nombre}")
    while True:
        try:
            
            eleccion = int(input("Ingresa la posición (1-9)\n").strip())
            if eleccion >= 1 and eleccion <= 9:
                if tablero[eleccion-1] == " ":
                    tablero[eleccion-1] = turno
                    break
                else:
                    print("¡La casilla está ocupada, intenta de nuevo!\n")
            else:
                print("Movimiento inválido, ingresa un número entre 1 y 9\n")
        except ValueError:
            print("Movimiento inválido, ingresa un número\n")

def ganador(icono):
    if ((tablero[0]==icono and tablero[1]==icono and tablero[2]==icono) or
        (tablero[3]==icono and tablero[4]==icono and tablero[5]==icono) or
        (tablero[6]==icono and tablero[7]==icono and tablero[8]==icono) or
        (tablero[0]==icono and tablero[3]==icono and tablero[6]==icono) or
        (tablero[1]==icono and tablero[4]==icono and tablero[7]==icono) or
        (tablero[2]==icono and tablero[5]==icono and tablero[8]==icono) or
        (tablero[0]==icono and tablero[4]==icono and tablero[8]==icono) or
        (tablero[2]==icono and tablero[4]==icono and tablero[6]==icono)):
        colorTablero()
        return True
    else:
        return False

def empate():
    if " " not in tablero:
        colorTablero()
        return True
    else:
        return False


nombre_jugador1 = input("Nombre del jugador 1:\n ")
nombre_jugador2 = input("Nombre del jugador 2: \n")

while True:
    colorTablero()
    jugador("x", nombre_jugador1)
    if ganador("x"):
        print(f"Felicitaciones {nombre_jugador1}, has ganado")
        break
    elif empate():
        print("¡Es un empate!")
        break
    colorTablero()
    jugador("o", nombre_jugador2)
    if ganador("o"):
        print(f"Felicitaciones {nombre_jugador2}, has ganado")
        break
    elif empate():
        print(f"¡Es un empate entre {nombre_jugador1},{nombre_jugador2}!")
        break

