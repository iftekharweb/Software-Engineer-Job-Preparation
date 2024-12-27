class Base:
    def __init__(self):
        self.publicVar = 10
        self._protectedVar = 20
        self.__privateVar = 30  # Name mangled

class Derived(Base):
    def display(self):
        print("Public Var:", self.publicVar)
        print("Protected Var:", self._protectedVar)
        # print("Private Var:", self.__privateVar)  # Error

# Usage
obj = Derived()
obj.display()
print("Public Var (outside):", obj.publicVar)
# print(obj._protectedVar)  # Accessible but not recommended
