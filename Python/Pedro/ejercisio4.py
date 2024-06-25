# ejercicio numero cuatro

# Crear un programa que lea para una cantidad conocida de datos, cédula, nombre, salario, edad, sexo (1: femenino, 2: masculino), estado civil (1: casado, 2: soltero, 3: divorciado), y carrera (1: administración, 2: derecho, 3: medicina, 4: sistemas).
# Calcular e imprimir:
# •	Total de alumnos por carrera
# •	Carrera con más alumno.
# •	Promedio de salario de los alumnos de administración.
# •	Porcentaje de mujeres de sistemas con respecto al total de alumnos de sistemas.
# •	Edad de la persona con mayor salario en medicina.


def validar_datos_alumnos():
    cantidad_ingresos = int(input("Ingrese la cantidad de alumnos por favor:\n "))
    
    contador_adm = contador_der = contador_med = contador_sis = 0
    total_salario_adm = 0
    contador_salario_adm = 0
    total_sistemas = 0
    mujeres_sistemas = 0
    max_salario_med = 0
    edad_max_salario_med = 0
    

    for i in range(cantidad_ingresos):
        Detencion = 1
        while (Detencion != 2):
            try:
                cedula = int(input("Ingrese la cédula por favor:\n "))
                Detencion = 2
            except:
                print("ingresar una cedula valida por favor:\n")

        Detencion = 1        
        while (Detencion != 2):
            try:
                edad = int(input("Ingrese la edad por favor:\n "))
                Detencion = 2
            except:
                print("ingresar una edad valida por favor:\n")
        
        Detencion = 1
        while (Detencion != 2):
            try:
                salario = int(input("Ingrese el salario por favor:\n "))
                Detencion = 2
            except:
                print("ingresar un salario valido por favor:\n")
        
        input("Ingrese el nombre del alumno por favor:\n ")
        
        Detencion = 1
        while (Detencion != 2):
            try:
                sexo = int(input("Ingrese el sexo (1: femenino, 2: masculino, 3: Otro):\n "))
                Detencion = 2
            except:
                print("ingresar un sexo valido por favor:\n")
            
        Detencion = 1
        while (Detencion != 2):
            try:
                estado_civil = int(input("Ingrese el estado civil por favor (1: casado, 2: soltero, 3: divorciado):\n "))
                Detencion = 2
            except:
                print("ingresar un estado civil valido por favor:\n")

        Detencion = 1
        while (Detencion != 2): 
            try:       
                carrera = int(input("Ingrese la carrera por favor (1: administración, 2: derecho, 3: medicina, 4: sistemas):\n "))
                Detencion = 2
            except:
                print("ingresar una carrera valida por favor:\n")

        if carrera == 1:
            contador_adm += 1
            total_salario_adm += salario
            contador_salario_adm += 1
        elif carrera == 2:
            contador_der += 1
        elif carrera == 3:
            contador_med += 1
            if salario > max_salario_med:
                max_salario_med = salario + max_salario_med
                edad_max_salario_med = edad
        elif carrera == 4:
            contador_sis += 1
            total_sistemas += 1
            if sexo == 1:
                mujeres_sistemas += 1
    print("Total de alumnos por carrera:") # muesta en consola el total de alumnos por cada carrera que se han registrado durante la ejecución del programa.
    print(f"Administración: {contador_adm}")
    print(f"Derecho: {contador_der}")
    print(f"Medicina: {contador_med}")
    print(f"Sistemas: {contador_sis}")
    
    max_alumnos = contador_adm
    carrera_mas_alumnos = 1
    if contador_der > max_alumnos:
        max_alumnos = contador_der
        carrera_mas_alumnos = 2
    if contador_med > max_alumnos:
        max_alumnos = contador_med
        carrera_mas_alumnos = 3
    if contador_sis > max_alumnos:
        max_alumnos = contador_sis
        carrera_mas_alumnos = 4
    
    if(contador_adm > contador_med and contador_adm > contador_der and contador_adm > contador_sis):
        print(f"La carrera con más alumnos es: Administracion")
    elif(contador_der > contador_med and contador_der > contador_adm and contador_der > contador_sis):
        print(f"La carrera con más alumnos es: {carrera_mas_alumnos}")    

    if contador_salario_adm != 0:
        promedio_salario_adm = total_salario_adm / contador_salario_adm
    else:
        promedio_salario_adm = 0
    print(f"Promedio de salario de los alumnos de administración: {promedio_salario_adm}")

    if total_sistemas != 0:
        porcentaje_mujeres_sis = (mujeres_sistemas / total_sistemas) * 100
    else:
        porcentaje_mujeres_sis = 0
    print(f"Porcentaje de mujeres en sistemas: {porcentaje_mujeres_sis}%")
    
    if(contador_med >= 1): 
        print(f"Edad de la persona con mayor salario en medicina: {edad_max_salario_med}")
    else:
        print("No hay alumnos en medicina.")    

validar_datos_alumnos()