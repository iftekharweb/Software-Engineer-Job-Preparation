class Car:
    def __init__(self, brand):
        self.brand = brand
        print(f"Constructor called for {self.brand}")

    def __del__(self):
        print(f"Destructor called for {self.brand}")


car1 = Car("Toyota")
car2 = Car("Honda")
del car1  # Explicitly deleting the object
# Destructor for car2 will be called when the program ends
