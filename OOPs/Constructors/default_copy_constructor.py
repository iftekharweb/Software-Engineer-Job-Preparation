# Example (Using the copy Module):
import copy

class Car:
    def __init__(self, brand, year):
        self.brand = brand
        self.year = year

    def display_info(self):
        print(f"Car: {self.brand}, Year: {self.year}")

car1 = Car("Toyota", 2020)
car2 = copy.copy(car1)  # Shallow copy
car2.display_info()



# Example (Manual Copy Constructor):
class CarManualCopy:
    def __init__(self, brand, year):
        self.brand = brand
        self.year = year

    def display_info(self):
        print(f"Car: {self.brand}, Year: {self.year}")

    def copy(self):
        return Car(self.brand, self.year)

car1 = CarManualCopy("Toyota", 2020)
car2 = car1.copy()
car2.display_info()