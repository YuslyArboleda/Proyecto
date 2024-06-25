Detencion = 1
Nombre = input("Ingrese su Nombre: ")
Asignatura = input("Ingrese su asignatura: ")

while (Detencion != 2):
    Parcial1 = float(input("Ingrese la primera parcial: "))
    while (Parcial1 > 5.0 or Parcial1 < 0.0):
        print("Porfavor, Ingresar un numero valido.")
        Parcial1 = float(input("Ingrese la primera parcial: "))
    else:
        Parcial2 = float(input("Ingrese la segunda parcial: "))
        while (Parcial2 > 5.0 or Parcial2 < 0.0):
            print("Porfavor, Ingresar un numero valido.")
            Parcial2 = float(input("Ingrese la segunda parcial: "))
        else:
            Parcial3 = float(input("Ingrese la tercera parcial: "))
            while (Parcial3 > 5.0 or Parcial3 < 0.0):
                print("Porfavor, Ingresar un numero valido.")
                Parcial3 = float(input("Ingrese la tercera parcial: "))
            else:
                Nota_Final = (Parcial1 * 0.25) + (Parcial2 * 0.20) + (Parcial3 * 0.55)
                print("Su nombre es: ", Nombre, "\nSu asignatura es: ", Asignatura, "\nY su nota definitiva es: ", Nota_Final)
                Detencion = 2