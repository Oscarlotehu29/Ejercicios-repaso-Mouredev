def SumaMultiplos():
    sum = 0
    for i in range(1000):
        if(i % 3 == 0 or i % 5 == 0):
            sum += i
    return sum

print("La suma de los multiplos de 3 y 5 es:", SumaMultiplos())