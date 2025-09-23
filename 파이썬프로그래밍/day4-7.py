animals = ['dog', 'cat', 'tiger', 'lion']
print(f"animals = {animals}")

first = animals.pop(0)
animals.append(first)
print(f"animals = {animals}")

for i in range(0,len(animals)) :
    print(f"I love {animals[i]}.")