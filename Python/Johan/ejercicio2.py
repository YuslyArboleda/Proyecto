def calcular_salario():
    
    dias_laborados = int(input("ingrese los dias laborados " ))
    bono_mes = 0
    bono_dias = 0
    bono_salario = 0
    
    salario = dias_laborados * 136000

    if salario >= 1088000 and dias_laborados <15:
      bono_salario = 60000
    
    if dias_laborados > 15:
      
      bono_dias = salario * 0.1

    if dias_laborados== 30:
      bono_mes=salario * 0.2

    salario_total = salario + bono_salario + bono_mes + bono_dias

    print("el salario total del empleado es:",{salario_total}) 

      
calcular_salario()