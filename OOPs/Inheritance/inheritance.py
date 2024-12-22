class Vehicle:
    def __init__(self, brand=None, model=None):
        self.__brand = brand
        self.__model = model
    
    def setValues(self, brand, model):
        self.__brand = brand
        self.__model = model
    
    def getValues(self):
        return self.__brand, self.__model


class Car(Vehicle):
    def __init__(self,fuel_type=None):
        super().__init__()
        self.__fuel_type = fuel_type

    def setValuesCar(self, fuel_type):
        self.__fuel_type = fuel_type
    
    def getValuesCar(self):
        brand, model = self.getValues()
        return self.__fuel_type, brand, model


car = Car()
car.setValues("Toyota", "Corolla")
car.setValuesCar("Petrol")
print(car.getValuesCar())