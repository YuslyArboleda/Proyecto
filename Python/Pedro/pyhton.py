# ejercicio numero 1:
    
#     alumno = input("Ingresa tu nombre por favor:\n")
#     asignatura = input("Ingresa la asignatura por favor:\n")
#     cedula = input("Ingrese su numero de cedula por favor:\n")

#     # Pedir y validar las notas
#     not1 = float(input("Ingresa la nota del primer parcial por favor:\n"))
#     if not1 > 5.0:
#         print("Calificación incorrecta. La nota debe ser menor o igual a 5.0.")
#         return

#     not2 = float(input("Ingresa la nota del segundo parcial por favor:\n"))
#     if not2 > 5.0:
#         print("Calificación incorrecta. La nota debe ser menor o igual a 5.0.")
#         return

#     not3 = float(input("Ingresa la nota del parcial final por favor:\n"))
#     if not3 > 5.0:
#         print("Calificación incorrecta. La nota debe ser menor o igual a 5.0.")
#         return

#     # Calculo de la nota final
#     nota_final = calculo_nota_final(not1, not2, not3)
    
#     # Imprimir la nota final utilizando el operador %
#     print("La nota final de %s en la asignatura %s es %.2f" % (alumno, asignatura, nota_final))
# # 2f permite que lea la nota del alumno en dos decimales obteniendo una representacion precisa 
# # de la calificacion del alumno:
# validar()


# ejercicio numero 2:
#  calculo de promedio del estudiante con plataforma de notas

# def calcular_nota_final_estudiante():
    
#     calificacion_estudiantes = {}
    
#     numero_estudiantes = int(input("Ingrese el número de estudiantes por favor:\n "))

#     for _ in range(numero_estudiantes):

#         nombre_estudiante = input("Ingrese el nombre del estudiante por favor:\n ")

#         plataforma_calificacion = input("Ingrese la plataforma de notas del estudiante:\n ")

#         asignatura = input("Ingrese el nombre de la asignatura por favor:\n ")

#         nota1 = float(input("Ingrese la nota del primer parcial (de 0 a 5):\n "))

#         nota2 = float(input("Ingrese la nota del segundo parcial (de 0 a 5):\n "))

#         nota_final = float(input("Ingrese la nota del parcial final (de 0 a 5):\n "))

#         while nota1 < 0 or 1 > 5 or nota2 < 0 or nota2 > 5 or nota_final < 0 or nota_final > 5:

#             print("se produjo un error las notas deben estar en el rango de 0 a 5. Por favor, ingrese nuevamente.")

#             nota1 = float(input("Ingrese la nota del primer parcial por favor (de 0 a 5): \n"))

#             nota2 = float(input("Ingrese la nota del segundo parcial por favor (de 0 a 5):\n "))

#             nota_final = float(input("Ingrese la nota del parcial final por favor (de 0 a 5):\n "))

#         nota_final_definitiva = (nota1 * 0.25) + (nota2 * 0.2) + (nota_final * 0.55)

#         calificacion_estudiantes[nombre_estudiante] = {

#             "Plataforma de notas": plataforma_calificacion,

#             "Asignatura": asignatura,

#             "Nota final": nota_final_definitiva
#         }
#     mejor_estudiante = max(calificacion_estudiantes, key=lambda estudiante: calificacion_estudiantes[estudiante]["Nota final"])

#     print("\nEl mejor estudiante es:")

#     print(f"Nombre: {mejor_estudiante}")

#     print(f"Plataforma de notas: {calificacion_estudiantes[mejor_estudiante]['Plataforma de notas']}")

#     print(f"Asignatura: {calificacion_estudiantes[mejor_estudiante]['Asignatura']}")

#     print(f"Nota final: {calificacion_estudiantes[mejor_estudiante]['Nota final']}")

# calcular_nota_final_estudiante()

# jercicio numero 3

# Elabore unprograma que calcule el salario de un empleado con contrato obra labor sabiendo el día laboral tiene un valor de $136.000, 
# tenga en cuenta lo siguiente:

# a.	Si el empleado tiene un salario mayor o igual a $1.088.000 se genera un bono de $60.000.
# b.	Si los días laborados son mayores a 15 se le da un bono del 10% de su salario.
# c.	Si tiene el mes laborado generar un bono de 20% de su salario.


# def calcular_pagolaboral(dias_trabajados):
#     valor_dia_trabajo = 136000
#     pago_empleado = dias_trabajados * valor_dia_trabajo
#     incentivo = 0

#     # Verificar bono por salario mayor o igual a $1.088.000
#     if pago_empleado >= 1088000:
#        incentivo += 60000

#     # Verificar bono por días laborados mayores a 15
#     if dias_trabajados > 15:
#         incentivo += 0.10 * pago_empleado

#     # Verificar bono por mes laborado completo (asumimos que el mes completo es 30 días)
#     if dias_trabajados == 30:
#        incentivo += 0.20 * pago_empleado

#     pago_empleado = pago_empleado + incentivo
#     return pago_empleado, incentivo, pago_empleado

# # Ejemplo de uso:
# dias_trabajados = int(input("Ingrese la cantidad de días laborados:\n "))
# pago_empleado,incentivo, salario_total = calcular_pagolaboral(dias_trabajados)

# print(f"Salario base: ${pago_empleado:,.2f}")
# print(f"incentivo total: ${incentivo:,.2f}")
# print(f"pago_total_empleado: ${pago_empleado:,.2f}")


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

