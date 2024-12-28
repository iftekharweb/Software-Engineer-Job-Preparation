class Engine:
    def start(self):
        print("Engine starting...")

class Car:
    def __init__(self):
        self.engine = Engine()  # Composition: Car "has-a" Engine

    def start(self):
        self.engine.start()  # Delegating functionality to Engine
        print("Car is ready to drive!")

car = Car()
car.start()
