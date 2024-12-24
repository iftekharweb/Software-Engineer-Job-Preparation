class Car:
    def __init__(self):
        self.brand = None
        self.color = None

    def set_brand(self, brand):
        self.brand = brand
        return self  # Return the current object

    def set_color(self, color):
        self.color = color
        return self  # Return the current object

    def display(self):
        print(f"Car: {self.brand}, Color: {self.color}")
        return self  # Optional to chain further if needed

car = Car()
car.set_brand("Toyota").set_color("Red").display()
