import random
def main():
    lista=[]
    for indice in range(1,21):
        lista.append(random.randint(1,10))

        #lista desordenada
        print(lista)

        #ordenar lista

        lista.sort(reverse= True)

        #recorrer lista ordenada
        print(lista)
