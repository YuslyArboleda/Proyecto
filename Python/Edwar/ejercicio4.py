i=1
mujeres=0
cont=0
salA=0
carrA=0
carrD=0
carrM=0
carrS=0
edadMayor=0
while i !=2:
      cedula= input('ingrese su cedula : ')
      nombre= input('ingrese su nombre : ')
      edad= input('ingrese su edad : ')
      salario = float(input('ingrese su salario : '))
      estadoCivil= int(input('2:SOLTERO 3:DIVORCIADO '))
      sexo= int(input('ingrese su sexo : 1:FEMENINO 2:MASCULINO :') )
      carrera= int(input('ingrese su cedula : 1:ADMINISTRACION, 2:DERECHO 3:MEDICINA 4: SIATEMA :'))

      cont+=1
      if carrera==1:
            carrA+=1
            salA+=salario
      elif carrera==2:
            carrD+=1
      elif carrera==3:
            carrM+=1
      elif carrera==4:
            mujeres+=1
            carrS+=1    
      elif edad > edadMayor:
         edadMayor = edad
      elif sexo==1:
       mujeres+=1
       carrS+=1
      else :
           break
      i= int(input('desea continuar?  1:continuar | 2:cerrar :'))


print('administracion:',carrA,'derecho :',carrD,'medicina:',carrM,'sistema :',carrS)
 
print('la edad del alumo mayor salrio e medicina es :', edad)


if carrA>carrD and carrA>carrM and carrA>carrS:
     print('la carrera con mayor alumno es : ADMINISTRACION')
elif carrD>carrA and carrD>carrM and carrD>carrS:
     print('la carrera con mayor alumno es : DERECHO')
elif carrM>carrD and carrM>carrA and carrM>carrS:
     print('la carrera con mayor alumno es: MEDICINA')
elif carrS>carrD and carrS>carrA and carrS>carrM:
      print('la carrera con mayor alumno es: SISTEMA')
else:
     print('las carreras tienen la misma cantidad de alumnos: ')

if (carrA>0):
     print('el promedio del salrio de administracion es : ',salA+(salA*carrA))  
else : 
     print('no hay estudiantes en administracion')
if mujeres>0:
     print('el porcentaje de mujeres de sistema es  :', (mujeres*100)/carrS)
else:
     print('no hay estudiantes en sistemas ')
         

 #CREA UN PROGRAMA QUE LEA PARA UNA CANTIDAD CONOCIDA DE DATOS,CEDULA,NOMBRE,SALARIO,EDAD,
 #SEXO(1:FEMENINO 2:SOLTERO 3:DIVORCIADO) Y 
#CARRERA(1:ADMINISTRACION, 2:DERECHO 3:MEDICINA 4: SIATEMA)  
# IMPRIMIR 
# TOTAL DE ALUMNOS POR CARRERA
# CARRERA CON MAS ALUMNOS
# PROMEDIO  DE SALARIO DE LOS ALUMNOS DE ADMINISTRACION
# PORCENTAJE DE MUJERES DE SISTEMA CON RESPETCTO AL TOTAL DE ALUMNO DE SISTEMA 
# EDAD DE LA PERSONA CON MAYOR SALARIO DE MEDICINA 