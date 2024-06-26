contador_admin=0
contador_dere=0
contador_medi=0
contador_sis=0
acu_salario=0
contador_mujeres=0
acumulador_edad=0
acumular_salario_medi=0
salario_medi = 0
i = 0

while i !=2: 
    try: 
        nombre= input("Ingrese su nombre \n")
        cedula = int(input("Ingrese su cédula \n"))
        edad = int(input("Ingrese su edad \n"))
        salario = float(input("Ingrese su salario \n"))
        sexo = int(input("Ingrese su sexo 1:masculino |2:femenino \n"))
        estadocivil = int(input("Ingrese su estado civil 1:casado |2:soltero |3:divorciado\n"))
        carrera = int(input("Ingrese su carrera 1:Administracion |2:Derecho |3:Medicina |4:Sistemas \n"))

        if (carrera == 1):
            contador_admin = contador_admin +1
            acu_salario += salario
        elif (carrera == 2):
            contador_dere +=1
        elif (carrera == 3):
            contador_medi +=1
        if(salario > salario_medi):
            edadmedi = edad
            salario_medi = salario
        elif (carrera == 4):
            contador_sis +=1
        if (sexo ==2):
            contador_mujeres +=1
        else:
            break

    except ValueError:
       print("Movimiento invalido\n") 
            
    i = int (input("Ingrese 1 para continuar y para detenerse 2 \n"))  

if (contador_admin>0):
    print("cantidad de alumnos administracion ", contador_admin)
else:
    print("No hubieron alumnos en la carrera de Administracion.")

if (contador_dere>0):
    print("cantidad de alumnos derecho ", contador_dere)
else:
      print("No hubieron alumnos en la carrera de Derecho.")

if (contador_medi>0):
    print("cantidad de alumnos medicina ", contador_medi)
else:
    print("No hubieron alumnos en la carrera de Medicina.")

if (contador_sis>0):
    print("cantidad de alumnos sistemas ", contador_sis)
else:
      print("No hubieron alumnos en la carrera de Sistemas.")

if (contador_admin>contador_dere) and (contador_admin>contador_medi) and (contador_admin>contador_sis):
    print ("La carrera con mayor cantidad de estudiantes es la de Administracion")

elif (contador_dere>contador_medi) and (contador_dere>contador_sis) and (contador_dere>contador_admin):
    print ("La carrera con mayor cantidad de estudiantes es la de Derecho")

elif (contador_medi>contador_sis) and (contador_medi>contador_dere) and (contador_medi>contador_admin):
        print ("La carrera con mayor cantidad de estudiantes es la de Medicina")

elif (contador_sis>contador_admin) and (contador_sis>contador_dere) and (contador_sis>contador_medi):
        print ("La carrera con mayor cantidad de estudiantes es la de Sistemas")
else:
    print ("No hubo una carrera con mayor cantidad de alumnos.")


if (contador_admin > 0):
	promedio_sala_admin=acu_salario/contador_admin
	print("El promedio de salario de los alumnos de administracion es de ", promedio_sala_admin)
else:
	print("No hay estudiantes de administracion")

if (contador_sis > 0):
	porcentaje=contador_mujeres*100/contador_sis
	print( "El porcentaje de mujeres de sistemas es ", porcentaje, "%")
else:
	print("No hay estudiantes de sistemas")
     
if(contador_medi > 0):
     print ("La edad de la persona con mayor salario en medicina es de ", edadmedi)
else:   
     print("No hay estudiantes de medicinas")

    