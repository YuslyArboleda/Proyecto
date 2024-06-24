Tablero = [" " for ciclo in range(9)]

def MesaDeJuego():
    print("|" + Tablero[0] + "|" + Tablero[1] + "|" + Tablero[2] + "|")
    print("|" + Tablero[3] + "|" + Tablero[4] + "|" + Tablero[5] + "|")
    print("|" + Tablero[6] + "|" + Tablero[7] + "|" + Tablero[8] + "|")

def Jugadores(turno):
    if(turno == "x"):
        num = 1
    else:
        num = 2
    print(f"\nTurno del jugador#{num}")

    while True:
        try:
            eleccion = int(input("Ingrese su movimiento (1-9)\n").strip())
            if(eleccion >= 1 and eleccion <= 9):
                if(Tablero[eleccion-1] == " "):
                    Tablero[eleccion-1] = turno +""
                    break    
                else:
                    print("El espacio esta ocupado, intente de nuevo \n")     
            else:    
                print("Movimiento invalido, ingrese un numero entre 1 y 9 \n")
        except ValueError:
            print("Movimiento Invalido\n")       

def ganador(turnoactual):
    if(Tablero[0]== turnoactual and Tablero[1]== turnoactual and Tablero[2]== turnoactual 
       or Tablero[3]== turnoactual and Tablero[4]== turnoactual and Tablero[5]== turnoactual 
       or Tablero[6]== turnoactual and Tablero[7]== turnoactual and Tablero[8]== turnoactual
       or Tablero[0]== turnoactual and Tablero[3]== turnoactual and Tablero[6]== turnoactual
       or Tablero[1]== turnoactual and Tablero[4]== turnoactual and Tablero[7]== turnoactual
       or Tablero[2]== turnoactual and Tablero[5]== turnoactual and Tablero[8]== turnoactual
       or Tablero[0]== turnoactual and Tablero[4]== turnoactual and Tablero[8]== turnoactual
       or Tablero[2]== turnoactual and Tablero[4]== turnoactual and Tablero[6]== turnoactual): 
        return True
    else:
        return False

def empate():
    if " " not in Tablero:
        return True
    else:
        return False

while True:
    MesaDeJuego()
    Jugadores("x")  
    if(ganador("x")):
        print("Felicidades jugador 1 ganaste")
        break 
    elif empate():
        print("Hubo un empate")
        break
    MesaDeJuego()
    Jugadores("o")
    if(ganador("o")):
        print("Felicidades jugador 2 ganaste")
        break    
    elif empate():
        print("Hubo un empate")
        break  
       