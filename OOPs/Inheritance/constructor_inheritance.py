class Parent:
    def __init__(self, name):
        self.name = name
        print("Parent __init__", name)

class Child(Parent):
    def __init__(self, name, age):
        super().__init__(name)
        self.age = age
        print("Child __init__", name, age)

c = Child("Iftekhar", 5)
