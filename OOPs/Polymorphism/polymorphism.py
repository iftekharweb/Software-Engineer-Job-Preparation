# Base class
class Base:
    # Constructor Overloading (using default arguments)
    def __init__(self, x=None):
        if x is None:
            print("Default constructor of Base class")
        else:
            print(f"Parameterized constructor of Base class: {x}")

    # Method Overloading (using default arguments)
    def display(self, x=None):
        if x is None:
            print("Display with no arguments")
        else:
            print(f"Display with one argument: {x}")

    # Method for overriding
    def info(self):
        print("Info from Base class")

# Derived class
class Derived(Base):
    def __init__(self):
        super().__init__()
        print("Constructor of Derived class")

    # Overriding base class method
    def info(self):
        print("Info from Derived class")

# Operator Overloading
class Complex:
    def __init__(self, real, imag):
        self.real = real
        self.imag = imag

    def __add__(self, other):  # Overloading '+' operator
        return Complex(self.real + other.real, self.imag + other.imag)

    def display(self):
        print(f"{self.real} + {self.imag}i")

# Main code
if __name__ == "__main__":
    # Constructor Overloading
    b1 = Base()
    b2 = Base(42)

    # Method Overloading
    b1.display()
    b1.display(100)

    # Method Overriding
    d = Derived()
    d.info()

    # Operator Overloading
    c1 = Complex(3, 4)
    c2 = Complex(1, 2)
    c3 = c1 + c2  # Using overloaded '+' operator
    print("Result of addition: ", end="")
    c3.display()
