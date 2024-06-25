total_alumnos_admin = 0
total_alumnos_dere =0
total_alumnos_medi = 0
total_alumnos_sis = 0
total_salario_admin = 0
total_muj_sis = 0
mayor_salario_medi = 0
carrera_mas_alumnos = 0
edad_per_mayor_salario = 0

max_alumnos = 0
max_sala_admin = 0

cantidad_de_alumnos = int(input("ingrese la cantidad de estudiantes"))

contador= 0

while contador < cantidad_de_alumnos:
    nombre = input("Ingrese su nombre")

    Controlador = 1
    while(Controlador != 0): 
        try:
            cedula = int( input("Ingrese su cedula"))
            Controlador= 0
        except:
             print("Invalid")

    Controlador = 1
    while(Controlador != 0): 
        try: 
            salario = float(input("ingrese su salario"))
            Controlador = 0
        except:
            print("Invalid")
    Controlador = 1
    while(Controlador != 0): 
        try:
            edad = int(input("Ingrese su edad"))
            Controlador= 0
        except:
             print("Invalid")
    Controlador = 1
    while(Controlador != 0): 
        try:
            sexo = int (input("ingrese su sexo |1 masculino |2 femenino"))
            Controlador= 0
        except:
             print("Invalid")         
    Controlador = 1
    while(Controlador != 0): 
        try:
            estado_civil = int (input("ingrese su estado civil |1 casado |2 soltero |3 divorciado"))
            Controlador= 0
        except:
             print("Invalid")     
    Controlador = 1
    while(Controlador != 0): 
        try:
            carrera = int (input("ingrese su carrera |1 administracion |2 derecho |3 medicina |4 sistemas"))
            Controlador= 0
        except:
             print("Invalid")

    if carrera == 1:
        total_alumnos_admin += 1
        total_salario_admin += salario
        if salario > max_sala_admin:
            max_sala_admin = salario    
    elif carrera == 2:
        total_alumnos_dere += 1
    elif carrera == 3:
        total_alumnos_medi += 1
        if salario > mayor_salario_medi:
            mayor_salario_medi = salario
            edad_per_mayor_salario = edad   
    elif carrera == 4:
        total_alumnos_sis += 1
        if sexo == 2:
            total_muj_sis += 1

    contador += 1

    promedio_sala_admin = total_salario_admin / total_alumnos_admin if total_alumnos_admin > 0 else 0

    porcen_muj_sis = (total_muj_sis / total_alumnos_sis)* 100 if total_alumnos_sis > 0 else 0



print("el promedio de salario de administracion es", promedio_sala_admin)
if(total_alumnos_admin > total_alumnos_dere and total_alumnos_admin > total_alumnos_sis and total_alumnos_admin > total_alumnos_medi):
    print("la carrera con mas alumnos es administracion")
elif(total_alumnos_dere > total_alumnos_sis and total_alumnos_dere > total_alumnos_medi and total_alumnos_dere > total_alumnos_admin):     
    print("la carrera con mas alumnos es derecho")
elif(total_alumnos_medi > total_alumnos_sis and total_alumnos_medi > total_alumnos_dere and total_alumnos_medi > total_alumnos_admin):
    print("la carrera con mas alumnos es medicina")
elif (total_alumnos_sis > total_alumnos_dere and total_alumnos_sis > total_alumnos_medi and total_alumnos_sis > total_alumnos_admin):
    print("la carrera con mas alumnos es sistemas")  

else: 
    print("no hay carrera con mas alumnos")  

print("la edad del alumno con mayor salario de medicina es", edad_per_mayor_salario)
print("la cantidad de mujeres que cursan sistemas es", total_muj_sis)
print("la cantidad de alumnos que cursan administracion es", total_alumnos_admin)
print("la cantidad de alumnos que cursan derecho es", total_alumnos_dere)
print("la cantidad de alumnos que cursan medicina es", total_alumnos_medi)
print("la cantidad de alumnos que cursan sistemas es", total_alumnos_sis)
print("el salario total de administracion es", total_salario_admin)

