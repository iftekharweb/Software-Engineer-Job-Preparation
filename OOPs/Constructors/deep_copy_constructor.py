import copy

class Car:
    def __init__(self, brand, features):
        self.brand = brand
        self.features = features

    def display_info(self):
        print(f"Car: {self.brand}, Features: {self.features}")

# Original object
car1 = Car("Toyota", ["Airbags", "ABS"])

# Deep copy using the `copy` module
car2 = copy.deepcopy(car1)

# Modifying the original object's features
car1.features.append("Sunroof")

# Display both objects
car1.display_info()  # Output: Car: Toyota, Features: ['Airbags', 'ABS', 'Sunroof']
car2.display_info()  # Output: Car: Toyota, Features: ['Airbags', 'ABS']
