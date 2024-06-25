triqui = ["  " for x in range (9)]
    
def tablerito ():
    print ("|" + triqui[0] + "|" + triqui[1] + "|" + triqui[2]+"|")
    print ("|" + triqui[3] + "|" + triqui[4] + "|" + triqui[5]+"|")
    print ("|" + triqui[6] + "|" + triqui[7] + "|" + triqui[8] +"|")

def jugadores(turno):
   
    if turno == 'x':
        num= 1
    else:
        num= 2
    print (f"\nTurno del jugador #{num}")	
    while True:
        try:
            posicion = int(input("Ingrese la posicion del tablero (1-9):\n ").strip())
            if posicion >= 1 and posicion <= 9:
                if triqui[posicion-1] == "  ":
                    triqui[posicion-1] = turno+ " "
                    break
                else:
                    print ("Posicion ocupada, ingrese otra posicion")
            else:
                print("Movimiento invalido: ingrese otra posicion del 1 al 9")
        except ValueError:
            print("Movimiento invalido")       
def ganador(icono):
    icono =icono +" "
    if ( 
        (triqui[0] == icono and triqui[1] == icono and triqui[2] == icono)
        or (triqui[3] == icono and triqui[4] == icono and triqui[5] == icono)
        
         or (triqui[6] == icono and triqui[7] == icono and triqui[8] == icono)
        
         or (triqui[0] == icono and triqui[3] == icono and triqui[6] == icono)
        
         or (triqui[1] == icono and triqui[4] == icono and triqui[7] == icono)
        
         or (triqui[2] == icono and triqui[5] == icono and triqui[8] == icono)

         or (triqui[0] == icono and triqui[4] == icono and triqui[8] == icono)

         or (triqui[2] == icono and triqui[4] == icono and triqui[6] == icono)

    ):
        return True
    else:
        return False
    
def empate():
    if "  " not in  triqui:
        return True
    else:
        return False
    
while True: 
        tablerito()
        jugadores("x")
        if (ganador("x")):
            print("Gano el jugador X")
            break
        elif empate():
            print("Empate")
            break
        tablerito()
        jugadores("o")
        if (ganador("o")):
            print("Gano el jugador O")
            break
        elif empate():
            print("Empate")
            break
       
    




