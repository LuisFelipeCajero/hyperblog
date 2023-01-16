from Car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car("AZW1812", Account("Andrés Herrera","AZW1812"))

    #car.license = ''
    #car.driver = 'Andrés Garcia'
    print(vars(car))
    print(vars(car.driver))