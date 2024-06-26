tablero = [" " for ta in range (9)]

def mostrar_tablero():
    print("|" +tablero[0] + "|" + tablero[1] + "|" + tablero[2]+ "|")
    print("|" +tablero[3] + "|" + tablero[4] + "|" + tablero[5]+ "|")
    print("|" +tablero[6] + "|" + tablero[7] + "|" + tablero[8]+ "|")
# otra forma  de hacer el tablero
    # for ta in range(3):
    #     fila= f"| {tablero[ta*3]}| {tablero[ta*3+1]}| {tablero[ta*3+2]}|"
    #     print(fila)
# while True:
def jugadores(turno):
    if turno == "x":
        num = 1
    else:
        num = 2 
       
    print(f"\n ingrese un número por favor jugador  # {num}")
    while True:
        try:
            eleccion = int(input("ingrese su movimiento del(1-9)\n").strip())
            if (eleccion >=1 and eleccion <=9):
                if (tablero [eleccion-1] ==" "):
                    tablero[eleccion-1] = turno 
                    break
                else:
                    print("Movimiento invalido: el espacio ya esta ocupado intente nuevamente:\n")
            else:
                print("Movimiento invalido: ingrese un numero entre 1 y 9\n")
        except ValueError:
            print("Movimiento invalido\n") 
def ganador(ga):
    if((tablero[0]==ga and tablero[1]==ga and tablero[2]==ga)
    or(tablero[3]==ga and tablero[4]==ga and tablero[5]==ga)
    or(tablero[6]==ga and tablero[7]==ga and tablero[8]==ga)
    or(tablero[0]==ga and tablero[3]==ga and tablero[6]==ga)
    or(tablero[1]==ga and tablero[4]==ga and tablero[7]==ga)
    or(tablero[2]==ga and tablero[5]==ga and tablero[8]==ga)
    or(tablero[0]==ga and tablero[4]==ga and tablero[8]==ga)
    or(tablero[2]==ga and tablero[4]==ga and tablero[6]==ga)
    ):
        return True
    else:
        return False
def empate():
    if " " not in tablero:
        return True
    else:
     return False
while True:
    mostrar_tablero()
    jugadores("x")
    if ganador("x"):
        print("felicitaciones jugador 1, has sido el feliz ganador:")
        break
    elif empate():
        print("El juego entre el jugador 1, y jugador 2, termino empatado")
        break
    mostrar_tablero()
    jugadores("o")
    if ganador("o"):
        print("felicitaciones jugador 2, has sido el feliz ganador:")
        break
    elif empate():
        print("El juego entre el jugador 1, y jugador 2, termino empatado")
        break
# def ganador()
    # mostrar_tablero()
    # jugadores("x")
    # mostrar_tablero()
    # jugadores("o")
    
   