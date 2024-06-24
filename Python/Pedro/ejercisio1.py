#ejercicio numero 1:
    
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