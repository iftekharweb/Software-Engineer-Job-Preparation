class Book:
    def __init__(self):
        print("Constructor will be called first and memory will be allocated")
        self.x = 0

    def setX(self, x):
        self.x = x

    def getX(self):
        return self.x


if __name__ == "__main__":
    book = Book()
    book.setX(1234)
    print(book.getX())
