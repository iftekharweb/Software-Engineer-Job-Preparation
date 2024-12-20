# Class with public access modifier
class Car:
    def __init__(self, car_name):
        self.car_name = car_name
    
    def get_car_name(self):
        print(self.car_name)


# // Class with private access modifier
class Book:
    def __init__(self):
        self.__name = "First_one"
        self.__type = "Unknown"
        self.__price = 0
    
    def change_book_price(self, price):
        self.__price = price
    
    def get_car_info(self):
        print(f"{self.__name} {self.__type} {self.__price}")


objCar = Car("BMW")
objCar.get_car_name()

objBook = Book()
objBook.get_car_info()
objBook.change_book_price(137)
objBook.get_car_info()
