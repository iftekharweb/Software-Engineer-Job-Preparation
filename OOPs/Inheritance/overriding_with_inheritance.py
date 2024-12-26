class Parent:
    def __init__(self):
        self.x = 10
    
    def show(self):
        print("Parent's show()", self.x)

class Child(Parent):
    def show(self, x):
        print("Child's show()", self.x+x)

obj = Child()
obj.show(5)