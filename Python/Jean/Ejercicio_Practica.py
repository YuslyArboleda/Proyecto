TotalAPagar = 0

def Calculo (totalapagar): 
    precioproducto = int (input("Ingresar Precio Del Producto: "))
    IVA = 0.21
    totalapagar = precioproducto*IVA+precioproducto

    return totalapagar

print("El Precio total a pagar es de: ", +int(Calculo(TotalAPagar)))