import os
import struct
import sys
import math


def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result))

def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
              result = f.read()
        else:
          raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
     print(e)
    return result

def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
              result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def calculate(x):
    rad = x * math.pi / 180
    y = 0

    try:
        y = math.tan(x) / (math.sin(4 * x) - 2 * math.cos(x))
    except ArithmeticError as e:
        print(e)
    return y


x = int(input("Enter x:"))

result = calculate(x)

try:
    writeResBin("resBin.bin", result)
    writeResTxt("resTxt.txt", result)
    print("result from bin file is {0}".format(readResBin("resBin.bin")))
    print("result from txt file is {0}".format(readResTxt("resTxt.txt")))
except FileNotFoundError as e:
    print("e")
finally:
    sys.exit()