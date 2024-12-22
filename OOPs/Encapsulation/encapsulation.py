class BankAccount:
    def __init__(self, balance):
        self.__balance = balance

    def setAmount(self, amount):
        if amount < 0:
            print("Amount can't be negative")
        else:
            self.__balance += amount
    
    def getAmount(self):
        return self.__balance
    
bank = BankAccount(0)
bank.setAmount(100)
print(bank.getAmount())
