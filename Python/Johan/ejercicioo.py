def cualcular_nota_defi(p1,p2,p3):

 primer_parcial = 0.25
 segundo_parcial = 0.20
 tercel_parcial = 0.55
 asignatura = ""

 nota_p1 = p1 * primer_parcial
 nota_p2 = p2 * segundo_parcial
 nota_p3 = p3 * tercel_parcial

 nota_definitiva = nota_p1 + nota_p2 + nota_p3
 return nota_definitiva

contador = 0
numero_Estu = int(input("ingrese numeros de estudiantes"))
while(contador < numero_Estu):
    asignatura = (input("Ingrese la asignatura"))
    p1 = float(input("Nota del primer parcial"))
    p2 = float(input("Nota del segundo parcial"))
    p3 = float(input("Nota del tercer parcial"))
    nota_definitiva = cualcular_nota_defi (p1,p2,p3)
    print("la nota definitiva es",(nota_definitiva))
    contador = contador + 1




        
      


