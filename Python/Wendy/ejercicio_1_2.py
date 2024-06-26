
parcial1= 0.25
parcial2 = 0.20
parcial3 = 0.55
nota1= 0
nota2= 0
nota3= 0
dete = 0
promedio = 0
estu = 0
notamayo = 0

asignatura = input("Ingrese la asignatura \n")

i = 0
while i != 2:
    estudiante= input("Ingrese su nombre \n")
    nota1 = float(input("Ingrese la nota del primer parcial \n")) 
    if(nota1>5.0):
      while nota1>5.0:
       print("La nota debe ser menor o igual a 5.0")
       nota1 = float(input("Ingrese la nota del primer parcial \n"))  
      

    nota2 = float(input("Ingrese la nota del segundo parcial \n"))
    if (nota2>5.0):
        while nota2>5.0:
         print("La nota debe ser menor o igual a 5.0")
         nota2 = float(input("Ingrese la nota del segundo parcial \n"))
        

    nota3 = float(input("Ingrese la nota del tercer parcial \n"))
    if (nota3>5.0):
        while nota3>5.0:
         print("La nota debe ser menor o igual a 5.0") 
         nota3 = float(input("Ingrese la nota del tercer parcial \n"))
  
    dete = int (input("Ingrese 1 para continuar y para detenerse 2 \n"))  
   
    notafinal = (nota1*parcial1) + (nota2*parcial2) + (nota3*parcial3)

    if (notafinal > notamayo):
      notamayo = notafinal
      nombremayor = estudiante
    estu +=1
    promedio = (notafinal + promedio)/estu

    if dete ==2:
        break

    
print(nombremayor, "Usted obtuvo la nota maxima que es de:",notamayo)
print("El promedio de las definitivas es de:", promedio)


# nota1 = float(input("Ingrese la nota del primer parcial \n"))
# nota2 = float(input("Ingrese la nota del segundo parcial \n"))
# nota3 = float(input("Ingrese la nota del tercer parcial \n"))

# if(nota1<=5.0 and nota2<=5.0 and nota3<=5.0):
#     notafinal = (nota1*parcial1) + (nota2*parcial2) + (nota3*parcial3)

#     print(estudiante, 'en', asignatura, 'usted obtuvo la nota final de:' , notafinal)
# else:
#     print("Todas las notas deben ser menor o igual a 5.0")

