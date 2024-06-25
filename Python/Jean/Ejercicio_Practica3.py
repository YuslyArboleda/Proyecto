Dias_Laborados = int(input("Ingrese el numero de dias laborados: "))
Salario = 136000*Dias_Laborados

if(Salario >= 1088000 and Dias_Laborados <= 14):
    Salario = Salario + 60000

if (Dias_Laborados > 15):
    Salario = (Salario * 0.1) + Salario    

if (Dias_Laborados == 30):
    Salario = (Salario * 0.2) + Salario

print("Su salario total es de: ", Salario, "Pesos.")