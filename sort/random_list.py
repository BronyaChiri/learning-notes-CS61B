from random import randint
listr = []
length = randint(10,25)
for i in range(length):
    listr.append(randint(1,99))

listr.sort()
print(listr)