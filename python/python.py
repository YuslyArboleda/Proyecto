# 1 ELABORAL UN PROGRMA QUE GERENERE LA NOTA DEFINITIVA QUE SACA UN ESTUDIANTE CADA ESTUDIANTE  
# AL REALIZAR LOS PARCIALES DE UNA ASIGNATURA Y LA NOTA MASIMA ES 5.0


parcial1 = 0
parcial2 = 0
parcial3 = 0



promedio=0
dt=0
notaMayor=0
nombreMayor=0
estu=0
i=0
materia = input('ingrese el  nombre de la materia :\n')
while i !=2 :
     nombre = input('ingrese su nombre :\n ')
    
     parcial1 = float(input('ingrese el primer parcial :\n'))
     if parcial1 > 5.0 :
       while parcial1> 5.0:
            print('la nota no se puede pasar de 5.0')  
            parcial1 = float(input('ingrese el primer parcial :\n'))

            
     parcial2 = float(input('ingrese el segundo parcial:\n '))
     if parcial2 > 5.0 :
             while parcial2> 5.0:
                 print('la nota no se puede pasar de 5.0')  
                 parcial2 = float(input('ingrese el segundo parcial :\n'))
          
     parcial3 = float(input('ingrese el tercer prcial : \n'))
     if parcial3 > 5.0  :
       while parcial3> 5.0:
            print('la nota no se puede pasar de 5.0')       
            parcial3 = float(input('ingrese el tercer parcial :\n '))

     dt=int(input('desea continuar | 1:si 2:no :\n'))
     
         
     suma =((parcial1*0.25) +(parcial2 *0.20 )+(parcial3*0.55))
     if suma > notaMayor:
         notaMayor = suma
         nombreMayor=nombre
     promedio= (suma+promedio)

     estu+=1
 
     if dt ==2:
       break

     
print('el promedio de todas las notas definitiva es : ',promedio/estu)
print('el estudiante  con el mayor promedio es: ',nombreMayor,'con',notaMayor)








