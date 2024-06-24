# Declaracion de Variables
Detencion = 1
AlumnosSistemas = 0
AlumnosAdministracion = 0
AlumnosDerecho = 0
AlumnosMedicina = 0
MujeresEnSistemas = 0
Salario_Administracion = 0
Salario_Medicina = 0
EdadMayorSalario_Medicina = 0

# Ciclo
while (Detencion == 1):
    Controlador = 0
    while(Controlador == 0):
        try:
            Cedula = int(input("Ingrese su cedula: "))
            Controlador = 1
        except:
            print("Porfavor, Ingresar una cedula valida.")

    Nombre = input("Ingrese su nombre: ")

    Controlador = 0
    while(Controlador == 0):
        try:
            Salario = int(input("Ingrese su salario: "))
            Controlador = 1
        except:
            print("Porfavor, Ingresar un valor valido.")

    Controlador = 0
    while(Controlador == 0):   
        try:     
            Edad = int(input("Ingrese su Edad: "))
            Controlador = 1
        except:
            print("Porfavor, Ingresar un valor valido.")

    Controlador = 0
    while(Controlador == 0):
        try:
            Sexo = int(input("Ingrese su sexo | 1 Para Femenino | 2 Para Masculino: "))
            Controlador = 1
        except:
            print("Porfavor, Ingresar una opcion valida.")

    Controlador = 0
    while(Controlador == 0):
        try:
            Estado_Civil = int(input("Ingrese su estado civil | 1 Para casado | 2 Para Soltero | 3 Para divorciado: "))
            Controlador = 1
        except:
            print("Porfavor, Ingresar una opcion valida.")

    Carrera = int(input("Ingrese su carrera | 1 Para Administracion | 2 Para Derecho | 3 Para Medicina | 4 Para Sistemas: "))
    Controlador = 0

    while(Controlador == 0 ):
        if(Carrera == 1):
            AlumnosAdministracion = AlumnosAdministracion + 1
            Salario_Administracion = Salario + Salario_Administracion
            Controlador = 1
        elif(Carrera == 2):
            AlumnosDerecho = AlumnosDerecho + 1
            Controlador = 1
        elif(Carrera == 3):
            AlumnosMedicina = AlumnosMedicina + 1
            if(Salario > Salario_Medicina):
                Salario_Medicina = Salario + Salario_Medicina
                EdadMayorSalario_Medicina = Edad
            Controlador = 1
        elif(Carrera == 4):
            AlumnosSistemas = AlumnosSistemas + 1 
            if(Sexo == 1):
                MujeresEnSistemas = MujeresEnSistemas + 1
            Controlador = 1    
        else:
            Carrera = int(input("Porfavor ingresar una carrera valida: "))

    Detencion = int(input("Desea continuar? | 1 Para si | Cualquier otra respuesta se tomara como un no: "))

# Respuestas
if(AlumnosAdministracion > 0):
    print("El total de alumnos en la carrera de Administracion es de: ", AlumnosAdministracion)
else:
    print("No hubieron alumnos en la carrera de Administracion.")

if(AlumnosDerecho > 0):
    print("El total de alumnos en la carrera de Derecho es de: ", AlumnosDerecho)
else:
    print("No hubieron alumnos en la carrera de Derecho.")

if(AlumnosSistemas > 0):
    print("El total de alumnos en la carrera de Sistemas es de: ", AlumnosSistemas)
else:
    print("No hubieron alumnos en la carrera de Sistemas.")

if(AlumnosMedicina > 0):
    print("El total de alumnos en la carrera de Medicina es de: ", AlumnosMedicina)
else:
    print("No hubieron alumnos en la carrera de Medicina.")

if(AlumnosAdministracion > AlumnosDerecho and AlumnosAdministracion > AlumnosSistemas and AlumnosAdministracion > AlumnosMedicina):
    print("La carrera con mas alumnos es la de Administracion, con:", AlumnosAdministracion, "Personas.")
elif(AlumnosDerecho > AlumnosMedicina and AlumnosDerecho > AlumnosSistemas and AlumnosDerecho > AlumnosAdministracion):
    print("La carrera con mas alumnos es la de Derecho, con:", AlumnosDerecho, "Personas.")
elif(AlumnosSistemas > AlumnosMedicina and AlumnosSistemas and AlumnosAdministracion and AlumnosSistemas > AlumnosDerecho):
    print("La carrera con mas alumnos es la de Sistemas, con:", AlumnosSistemas, "Personas.")
elif(AlumnosMedicina > AlumnosDerecho and AlumnosMedicina > AlumnosAdministracion and AlumnosMedicina > AlumnosSistemas):
    print("La carrera con mas alumnos es la de Medicina, con:", AlumnosMedicina, "Personas.")
else:
    print("No hubo una carrera con mayor cantidad de alumnos.")

if(AlumnosAdministracion > 0):
    print("El salario promedio de los alumnos de administracion es de: ", Salario_Administracion/AlumnosAdministracion, "Pesos.")
else:
    print("No hubieron alumnos en administracion, por lo cual no se pudo sacar el promedio del salario.")

if(MujeresEnSistemas > 0):
    print("El porcentaje de mujeres en la carrera de sistemas es de un: ", (MujeresEnSistemas/AlumnosSistemas)*100, "%.")
else:
    print("No hubieron mujeres en la carrera de sistemas.")

if(AlumnosMedicina > 0):
    print("La edad de la persona con mayor salario en medicina es de: ", EdadMayorSalario_Medicina, "Años.")
else:
    print("No hubieron alumnos en medicina, por lo cual no se pudo sacar la edad con mayor salario.")