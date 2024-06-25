precio_producto= 0

def calcular_precio_total(precio_producto):
    precio_producto =  int(input("Ingrese el precio del producto deseado"))
    IVA= 0.21
    print ("el precio del producto que escogio es")
    precio_total = precio_producto * IVA + precio_producto
    return precio_total

print(calcular_precio_total(precio_producto))
