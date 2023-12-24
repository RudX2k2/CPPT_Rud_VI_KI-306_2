class ScannerDevice:
    def __init__(self):
        self.barCode = [0] * 12

    def getBarCode(self):
        return self.barCode

    def setBarCode(self, code):
        sumOdd = 0
        sumEven = 0
        for i in range(12):
            digit = code[i]
            if (i + 1) % 2 == 0:
                sumEven += digit
            else:
                sumOdd += digit
        # ... (previous code)

        totalSum = sumOdd + (sumEven * 3)
        calcResult = (10 - (totalSum % 10)) % 10
        checkDigit = code[11]


        if calcResult == checkDigit:
            self.barCode = code.copy()
            return True
        else:
            return False

