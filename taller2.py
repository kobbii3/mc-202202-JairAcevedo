print("--------------------------")
print(".:Bienvenido al taller 2:.")
A = {6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
B = {2,4,6,8,10,12,14,16,18,20,22,24}
C = {1,4,8,10,12,15,18,20}
D = {2,3,5,7,11,13,17,19,23,29,31,37,41,43}

def union(x,y):
  resultado = x | y
  return resultado

def interseccion(x,y):
  resultado = x & y
  return resultado

def diferencia(x,y):
  resultado = x - y
  return resultado

def diferenciasim(x,y):
  resultado = x ^ y
  return resultado

x = 1
while x == 1:
  print("Por favor el numero del ejercicio que desea ver:")
  op = int(input("1. B∩(CΔD), 2. (A∩C)∪B, 3. (B∪D)-C, 4. (A-B)Δ(A∩D) : "))
  if op == 1:
    CD = diferenciasim(C,D)
    BCD = interseccion(B,CD)
    print("Conjunto resultante: ", BCD)
  elif op == 2:
    AC = interseccion(A,C)
    ACB = union(AC,B)
    print("Conjunto resultante: ", ACB)
  elif op == 3:
    BD = union(B,D)
    BDA = diferencia(BD,C)
    print("Conjunto resultante: ", BDA)
  elif op == 4:
    AB = diferencia(A,B)
    AD = interseccion(A,D)
    ABAD = diferenciasim(AB,AD)
    print("Conjunto resultante: ", ABAD)
  x = int(input("Presione 1 para ver otro ejercicio, o 2 para salir."))
else:
    print("Gracias por usarnos.")
    False
