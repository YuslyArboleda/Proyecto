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