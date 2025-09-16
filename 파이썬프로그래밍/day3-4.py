def inch2cm(inch) :
    return inch * 2.54

for i in range(1,6) :
    print(f"{i} 인치 = {inch2cm(i):.2f} 센티미터")