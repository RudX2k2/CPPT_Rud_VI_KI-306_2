from ScannerDevice import ScannerDevice

code = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 0]
print("code to scan: ", end="")
for i in range(12):
    print(code[i], end=" ")
print()
someScanner = ScannerDevice()
someScanner.setBarCode(code)
if not someScanner.setBarCode(code):
    print("Failure:", "".join(map(str, someScanner.getBarCode())))
code = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
print("code to scan: ", end="")
for i in range(12):
    print(code[i], end=" ")
print()
if someScanner.setBarCode(code):
    print("Success:", "".join(map(str, someScanner.getBarCode())))
