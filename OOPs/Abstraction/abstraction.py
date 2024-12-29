from abc import abstractmethod

# Abstract class
class Shape():
    @abstractmethod
    def draw(self):
        pass

class Circle(Shape):
    def draw(self):
        print("Drawing a Circle")

class Rectangle(Shape):
    def draw(self):
        print("Drawing a Rectangle")

# Example usage
shape1 = Circle()
shape2 = Rectangle()

shape1.draw()  # Output: Drawing a Circle
shape2.draw()  # Output: Drawing a Rectangle
