class Rectangle:
    def __init__(self, length=1, width=1):  # Default parameters to simulate overloading
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

# Usage
rect1 = Rectangle()  # Uses default values (1, 1)
rect2 = Rectangle(5)  # Initializes with length=5, width=1
rect3 = Rectangle(4, 6)  # Initializes with length=4, width=6

print(f"Area of rect1: {rect1.area()}")  # Output: 1
print(f"Area of rect2: {rect2.area()}")  # Output: 5
print(f"Area of rect3: {rect3.area()}")  # Output: 24
