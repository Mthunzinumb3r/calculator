def calculator():
    def add(a, b):
        return a + b

    def subtract(a, b):
        return a - b

    def multiply(a, b):
        return a * b

    def divide(a, b):
        if b != 0:
            return a / b
        else:
            return "Error: Division by zero"

    operations = {
        "1": add,
        "2": subtract,
        "3": multiply,
        "4": divide
    }

    print("Select an operation:")
    print("1. Add")
    print("2. Subtract")
    print("3. Multiply")
    print("4. Divide")

    choice = input("Enter your choice (1/2/3/4): ")

    if choice not in operations:
        print("Invalid choice. Please select a valid operation.")
        return

    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
    except ValueError:
        print("Invalid input. Please enter numeric values.")
        return

    result = operations[choice](num1, num2)
    print(f"The result is: {result}")

calculator()
