class Car:
    def __init__(self):
        self.__speed = 0

    def set_speed(self, speed):
        if speed < 0:
            self.__speed = 0
        elif speed > 150:
            self.__speed = 150
        else:
            self.__speed = speed
    
    def get_speed(self):
        return self.__speed
    
car = Car()
car.set_speed(100)
print(car.get_speed())