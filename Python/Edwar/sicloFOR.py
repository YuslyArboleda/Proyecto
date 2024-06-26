

tablero=[""for i in range(9)]
def mostrarTablero ():
     for i in range(3):
          fila= f"|  {tablero[i*3]} |  {tablero[i*3+1]} | {tablero[i*3+2]}  |"
          print(fila)

def jugadores(turno):
     if turno =="X":
          num=1
     else:
          num=2
     print(f'\nTu turno jugador # ',num)
     while True:
          try:
               escojer=int(input('ingrese su movimiento del (1-9) \n').strip())
               if escojer >=1 and escojer<=9:
                    if tablero[escojer-1]=="":
                         tablero[escojer-1]=turno+""
                         break
                    else:
                         print('el espacio esta ocupado, intentelo de nuevo')
               else:
                    print('Movimiento invalido, ingrese un numero del (1-9) \n')
          except ValueError:
               print('Movimiento invalido \n')


def ganador(icon):
     if( (tablero[0]==icon and tablero[1]==icon and tablero[2]==icon )
         or (tablero[3]==icon and  tablero[4]==icon and tablero[5]==icon)
         or (tablero[6]==icon and  tablero[7]==icon and tablero[8]==icon) 
         or  (tablero[0]==icon and  tablero[3]==icon and tablero[6]==icon) 
         or  (tablero[1]==icon and  tablero[4]==icon and tablero[7]==icon) 
         or  (tablero[2]==icon and  tablero[5]==icon and tablero[8]==icon) 
         or  (tablero[0]==icon and  tablero[4]==icon and tablero[8]==icon) 
         or  (tablero[2]==icon and  tablero[4]==icon and tablero[6]==icon)):
          return True
     else: 
          False
     
         
def empate():
     if "" not in tablero:
          return True
     else:
         return False
          
while True:
     print("BIENVENIDOS")
     mostrarTablero ()
     jugadores('X')
     if ganador('x'):
          print( print('GANADOR # 1'))
          break
     elif empate():
          print('EMPATE')
          break
     mostrarTablero ()
     jugadores('O')
     if ganador('O'):
          print( print('GANADOR # 1'))
          break
     elif empate():
          print('EMPATE')
          break
