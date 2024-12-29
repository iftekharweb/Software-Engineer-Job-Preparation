from abc import abstractmethod

class Shape:
    # Abstract Method
    @abstractmethod
    def draw(self):
        pass
    
    # Concrete Method
    def paint(self):
        print('Painting the shape')

class Circle(Shape):
    def draw(self):
        print('Drawing a circle')

if __name__ == '__main__':
    c = Circle()
    c.draw()        # Abstract method implementation
    c.paint()       # Concrete method