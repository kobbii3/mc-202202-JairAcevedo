import math
from math import factorial
from math import e

ea = 0
xi = 0.55
h = 0.005

iteraciones = 1
potencia = 1
valor = math.e**-xi
signo = -1
print("ORDEN 0:")
print(valor)
print("-------------------")
for iteraciones in range(1,16):
  valor_ant = valor
  op = signo*(valor/factorial(iteraciones))*(pow(h,potencia))
  valor += op
  ea = abs((valor-valor_ant)/valor)*100
  potencia += 1
  signo *= -1
  print("ORDEN", iteraciones , ":")
  print("valor estimado: ", valor)
  print("error aproximado porcentual: ", ea, "%")
  print("-------------------")
