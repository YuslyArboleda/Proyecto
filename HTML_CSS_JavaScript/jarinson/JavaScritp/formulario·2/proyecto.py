# num = int(input("ingrese un numero del 1 al 10 \n"))
# if num < 5 and num >0:
#     print("el numero ingresado es menor a 5")
# elif num == 5:
#     print("el numero ingresado es igual a 5")
# elif num > 10 or num <= 0:
#     print("el numero no aplica")
# else:
#     print("el numero ingresado es mayor a 5")

def calcular_nota_definitiva(nota1, nota2, nota3):

    parcial1 = 0.20
    parcial2 = 0.25
    parcial3 = 0.55
    Nota_definitiva = (nota1 * parcial1) + (nota2 * parcial2) + (nota3 * parcial3)

    return Nota_definitiva

 

nombre_estudiante = input("Ingrese el nombre del estudiante: ")
asignatura = input("Ingrese el nombre de la asignatura: ")

nota1 = float(input("Ingrese la nota del primer parcial : "))

nota2 = float(input("Ingrese la nota del segundo parcial : "))

nota3 = float(input("Ingrese la nota del tercer parcial : "))



print(f"Estudiante: {nombre_estudiante}")

print(f"Asignatura: {asignatura}")

print(f"Notas: 1er Parcial  {nota1}, 2do Parcial = {nota2}, 3er Parcial  {nota3}")

nota_definitiva = calcular_nota_definitiva(nota1, nota2, nota3)
print(f"Nota Definitiva: {nota_definitiva}")

while True:
    try:
        nota = float(input("por favor ingrese nuevamente su nota"))
        if 0<=nota <=5.0:
            print(f"Nota Definitiva: {nota_definit}")
        else:
            print("La nota debe estar entre 0 y 5.0")
    except ValueError:
        print("La nota debe estar entre 0 y 5.0")

def calcular_nota_final():
    
    notas_estudiantes = {}
    
    num_estudiantes = int(input("Ingrese el número de estudiantes:\n "))

    for _ in range(num_estudiantes):

        nombre_estudiante = input("Ingrese el nombre del estudiante:\n ")

        plataforma_notas = input("Ingrese la plataforma de notas del estudiante:\n ")

        asignatura = input("Ingrese el nombre de la asignatura:\n ")

        nota1 = float(input("Ingrese la nota del primer parcial (de 0 a 5):\n "))

        nota2 = float(input("Ingrese la nota del segundo parcial (de 0 a 5):\n "))

        nota_final = float(input("Ingrese la nota del parcial final (de 0 a 5):\n "))

        while nota1 < 0 or nota1 > 5 or nota2 < 0 or nota2 > 5 or nota_final < 0 or nota_final > 5:

            print("Las notas deben estar en el rango de 0 a 5. Por favor, ingrese nuevamente.")

            nota1 = float(input("Ingrese la nota del primer parcial (de 0 a 5): \n"))

            nota2 = float(input("Ingrese la nota del segundo parcial (de 0 a 5):\n "))

            nota_final = float(input("Ingrese la nota del parcial final (de 0 a 5):\n "))

        nota_final_definitiva = (estudiante1 * 0.25) + (estudiante2 * 0.2) + (estidiante_nota_final * 0.55)

        notas_estudiantes[nombre_estudiante] = {

            "Plataforma de notas": plataforma_notas,

            "Asignatura": asignatura,

            "estudiante nota final": nota_final_definitiva
        }
    mejor_estudiante = max(notas_estudiantes, key=lambda estudiante: notas_estudiantes[estudiante]["estdiante nota final"])

    print("\nEl mejor estudiante es:")

    print(f"Nombre: {mejor_estudiante}")

    print(f"Plataforma de notas: {notas_estudiantes[mejor_estudiante]['Plataforma de notas']}")

    print(f"Asignatura: {notas_estudiantes[mejor_estudiante]['Asignatura']}")

    print(f"Nota final: {notas_estudiantes[mejor_estudiante]['estudiante nota final']}")

calcular_nota_final()





def calcular_pagolaboral(dias_trabajados):
    valor_dia_trabajo = 136000
    pago_empleado = dias_trabajados * valor_dia_trabajo
    bono = 0


    if pago_empleado >= 1088000:
       bono += 60000

  
    if dias_trabajados > 15:
        bono += 0.10 * pago_empleado

   
    if dias_trabajados == 30:
       bono += 0.20 * pago_empleado

    pago_empleado = pago_empleado + incentivo
    return pago_empleado, bono, pago_empleado


dias_trabajados = int(input("Ingrese la cantidad de días laborados:\n "))
pago_empleado,incentivo, salario_total = calcular_pagolaboral(dias_trabajados)

print(f"Salario base: ${pago_empleado:f}")
print(f"incentivo total: ${bono:f}")
print(f"pago_total_empleado: ${pago_empleado:f}")






def validar_datos_alumnos():
    cantidad_ingresos = int(input("Ingrese la cantidad de alumnos:\n "))
    
    contador_adm = contador_der = contador_med = contador_sis = 0
    total_salario_adm = 0
    contador_salario_adm = 0
    total_sistemas = 0
    mujeres_sistemas = 0
    max_salario_med = 0
    edad_max_salario_med = 0

    for i in range(cantidad_ingresos):
        input("Ingrese la cédula:\n ")
        input("Ingrese el nombre del alumno:\n ")
        salario = int(input("Ingrese el salario:\n "))
        edad = int(input("Ingrese la edad por favor:\n "))
        sexo = int(input("Ingrese su sexo (1: femenino, 2: masculino, 3: Otro):\n "))
        input("Ingrese el estado civil (1: casado, 2: soltero, 3: divorciado):\n ")
        carrera = int(input("Ingrese la carrera (1: administración, 2: derecho, 3: medicina, 4: sistemas):\n "))

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
    print("Total de alumnos por carrera:")
    print(f"Administración: {contador_adm}")
    print(f"Derecho: {contador_der}")
    print(f"Medicina: {contador_med}")
    print(f"Sistemas: {contador_sis}")
    
    max_alumnos = contador_adm
    carrera_mas_alumnos = "administracion"
    if contador_der > max_alumnos:
        max_alumnos = contador_der
        carrera_mas_alumnos = "derecho"
    if contador_med > max_alumnos:
        max_alumnos = contador_med
        carrera_mas_alumnos = "medicina"
    if contador_sis > max_alumnos:
        max_alumnos = contador_sis
        carrera_mas_alumnos = "sistema"
    
    if(contador_adm > contador_med and contador_adm > contador_der and contador_adm > contador_sis):
        print(f"La carrera con más alumnos es: Administracion")
    else:
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
        print("No hay alumnos en medicina")    

validar_datos_alumnos()




