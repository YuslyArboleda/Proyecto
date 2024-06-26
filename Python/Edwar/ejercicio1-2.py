
# 1 ELABORAL UN PROGRMA QUE GERENERE LA NOTA DEFINITIVA QUE SACA UN ESTUDIANTE CADA ESTUDIANTE  
# AL REALIZAR LOS PARCIALES DE UNA ASIGNATURA Y LA NOTA MASIMA ES 5.0


parcial1 = 0
parcial2 = 0
parcial3 = 0
# operacion1 =  (parcial1*0.25)
# operacion2=(parcial2*0.20)
# operacion3= (parcial3*0.55)


promedio=0
dt=0
notaMayor=0
nombreMayor=0
estu=0
i=0
materia = input('ingrese el  nombre de la materia :')
while i !=2 :
     nombre = input('ingrese su nombre : ')
    
     parcial1 = float(input('INGRESE EL PRIMER PARCIAL :'))
     if parcial1 > 5.0 :
       while parcial1> 5.0:
            print('la nota no se puede pasar de 5.0')  
            parcial1 = float(input('INGRESE EL PRIMER PARCIAL :'))

            
     parcial2 = float(input('INGRESE EL SEGUNDO PARCIAL : '))
     if parcial2 > 5.0 :
             while parcial2> 5.0:
                 print('la nota no se puede pasar de 5.0')  
                 parcial2 = float(input('INGRESE EL SEGUNDO PARCIAL :'))
          
     parcial3 = float(input('INGRESE EL TERCER PARCIAL : '))
     if parcial3 > 5.0  :
       while parcial3> 5.0:
            print('la nota no se puede pasar de 5.0')       
            parcial3 = float(input('INGRESE EL TERCER PARCIAL : '))

     dt=int(input('desea continuar | 1:si 2:no :'))
     
         
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

# promedio de todas las difinitivas 
# estudiante con mayor nota 





 
# parcial3 = float(input('INGRESE EL TERCER PARCIAL :'))
# if parcial3 <= 5.0:
#             print( 'la nota ingresada debe  ser  hasta  5.0 por favor ingrese la nota de nuevo')
     
# operacion1 =  (parcial1*0.25)
# operacion2=(parcial2*0.20)
# operacion3= (parcial3*0.55)
  
# if parcial1 <= 5.0 and parcial2 <= 5.0 and parcial3 <= 5.0:
#          suma = operacion1 + operacion2+ operacion3
#          print(nombre,'la nota difinitiva de', materia, 'es', suma)
# else :
#      print( 'la nota ingresada debe  ser  hasta  5.0 por favor ingrese la nota de nuevo')if parcial2 <= 5.0:
#             print( 'la nota ingresada debe  ser  hasta  5.0 por favor ingrese la nota de nuevo')
    
    

