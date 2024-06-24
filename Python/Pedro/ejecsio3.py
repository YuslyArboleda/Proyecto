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
