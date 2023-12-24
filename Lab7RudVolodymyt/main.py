import sys

rows_num = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

if len(filler) == 0:
    print("Не введено символ-заповнювач")
    sys.exit(1)
elif len(filler) == 1:
    for i in range(rows_num):
        if i == 0 or i == rows_num - 1:
            lst.append([ord(filler)] * rows_num)
        elif i == 1 or i == rows_num - 2:
            lst.append([ord(filler)] * 2)
        else:
            lst.append([ord(filler)] + [ord(filler)] * (rows_num - 4) + [ord(filler)])


jOfArr = 0
for i in range(rows_num):
    for j in range(rows_num):
        if (i == 1 or i == rows_num - 2) and (0 < j < rows_num - 1):
            #row 1 and second last row
            print(end="  ")
        elif (0 < i < rows_num - 1) and (j == 1 or j == rows_num-2):
            #column 1 and second last column
            print(end="  ")
        else:
            print(chr(lst[i][jOfArr]), end=" ")
            jOfArr += 1
    print()
    jOfArr = 0
