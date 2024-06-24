NumeroDeEstudiantes = 0
Detener_Ciclo = 0
NombreMayorDefinitiva = "";
Nota_Final_Mayor = 0
Promedio_De_Definitivas = 0
NumeroDePersonasConNotaMaxima = 0

Asignatura = input("Ingresar la asignatura: ")

while (Detener_Ciclo != 2):
    Nombre = input("\nIngrese su Nombre: ")
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
                print("Su nombre es: ", Nombre, "\nY su nota definitiva es: ", Nota_Final)

                if(Nota_Final > Nota_Final_Mayor):
                    Nota_Final_Mayor = Nota_Final
                    NombreMayorDefinitiva = Nombre
                    
                if(float(Nota_Final == 5.0)):
                    NumeroDePersonasConNotaMaxima = NumeroDePersonasConNotaMaxima + 1

                NumeroDeEstudiantes = NumeroDeEstudiantes + 1
                Promedio_De_Definitivas = (Nota_Final + Promedio_De_Definitivas)

                Detener_Ciclo = int(input("Desea Continuar? | Cualquier Numero Para si | 2 Para no \n"))

if(NumeroDePersonasConNotaMaxima > 1):
    print("\nHay mas de una persona con la definitiva maxima.")
else:
    print("\nEl estudiante con mayor definitiva es: ", NombreMayorDefinitiva, "\nSu nota definitiva es: ", Nota_Final_Mayor)

print("El promedio de las definitivas es de: ", Promedio_De_Definitivas/NumeroDeEstudiantes)