list1 = [1,2,3,4,5,6]
list2 = [6,7,8,9,10]

print(f"list1 = {list1}")
print(f"list2 = {list2}")

for i in range(0,len(list1)):
    for n in range(0,len(list2)):
        if list1[i] != list2[n]:
            all = 0
        else:
            all = 1
            break
            
if all == 1:
    print("True")
else:
    print("False")
        