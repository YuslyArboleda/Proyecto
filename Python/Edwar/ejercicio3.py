# elabore un programa que calcule el salario de un empleado con contrato obra labor sabiendo el dia laboral tiene un valor 
# de $136.000, tenga en cuenta lo siguiente:

# a. si el empleado tiene un salario mayor o igual a 1.088.000 se genera un bono de 60.000
# b. si los dias laborados son mayores a 15 se le da un bono del 10% de su salario
# c. si tiene el mes laborado generar un bono de 20% de su salario

SALARIO= 136000
dias=int(input('ingrese los dias : '))
suma= SALARIO*dias


if dias >=30:
    print('por cumplir los 30 dias de trabajo se le agrega un bonosde  20% al salario',suma+(suma*0.20))

elif dias >= 15 :
    print('por cumplir los 15 dias de trabajo se le agrega un 10% al salario',suma+(suma*0.10))
elif suma>= 1088000 and dias<15:
    print('su pago es',suma,'mas un bono del 60.000 :',suma+60000)
else:
    print('su salario es de :',suma)

