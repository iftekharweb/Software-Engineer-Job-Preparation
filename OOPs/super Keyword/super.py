class Parent:
    def __init__(self, value):
        self.parent_value = value
        print(f"Parent constructor called with value: {self.parent_value}")
    
    def display(self):
        print(f"Parent value: {self.parent_value}")

class Child(Parent):
    def __init__(self, value, child_value):
        super().__init__(value)  # Call Parent constructor
        self.child_value = child_value
        print(f"Child constructor called with value: {self.child_value}")
    
    def display(self):
        super().display()  # Call Parent display method


obj = Child(100, 200)
obj.display()
