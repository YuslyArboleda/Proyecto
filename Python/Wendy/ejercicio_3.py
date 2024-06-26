dias = int (input("Ingrese dás laborados:\n"))
bono = 136000
salario = bono * dias

if (salario >= 1088000 and dias <15):
    salario = salario + 60000
    print ("Su salario es de:", salario, " mas un bono de 60.000")
elif (dias >= 15):
    salario = salario+(salario * 0.10)
    print ("Por sus 15 dás laborales tiene derecho a un bono del 10%  mas su salario:", salario)
elif (dias >= 30):
    salario = salario+(salario * 0.20)
    print ("Por cumplir con los 30 días laborales tiene derecho a un bono del 20% mas su salario:", salario)
else:
    print ("Su salario es de: ", salario)