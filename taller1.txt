print("--------------------------")
print(".:Bienvenido al operador de conjuntos:.")
A=set()
cardinal=int(input("Por favor ingrese la cantidad de elementos que tendrá el conjunto A: "))
for i in range(1,cardinal+1):
  num = float(input(f"Ingrese el elemento numero {i}: "))
  A.add(num)
print("su conjunto A es: ", A)

B=set()
cardinal=int(input("Por favor ingrese la cantidad de elementos que tendrá el conjunto B: "))
for i in range(1,cardinal+1):
  num = float(input(f"Ingrese el elemento numero {i}: "))
  B.add(num)
print("su conjunto B es: ", B)
x = 1
while x == 1:
    print("Por favor, indique la operacion que va a realizar:")
    op = int(input("1. Union, 2. Interseccion, 3. Diferencia, 4. Diferencia simetrica :"))
    U = set()
    I = set()
    D = set()
    Dsim = set()
    if op == 1:
      for i in A:
        U.add(i)
      for i in B:
        U.add(i)
      print(U)
    elif op == 2:
      for i in A:
        if i in B:
          I.add(i)
      print(I)
    elif op == 3:
      for i in A:
        if i in B:
          pass
        else:
          D.add(i)
    elif op == 4:
      for i in A:
        if i in B:
          pass
        else:
          Dsim.add(i)
      for i in B:
        if i in A:
          pass
        else:
          Dsim.add(i)
      print(Dsim)
    x = int(input("Presione 1 para hacer otra operación de conjuntos, o 2 para salir."))
else:
    print("Gracias por usarnos.")
    False
