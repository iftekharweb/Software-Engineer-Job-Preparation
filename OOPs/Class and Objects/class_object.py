
class Book:
    # Attribute
    def __init__(self, name, author):
        self.name = name
        self.author = author

    # Methods
    def book_info(self):
        print(f"Book has the name {self.name} and the author is {self.author}")

# Objects
bangla = Book("Bangla Book", "Sheikh Hasina")
bangla.book_info()