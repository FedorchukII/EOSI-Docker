#!/usr/bin/env python3

def main():
    print("Hello from Python Docker container!")
    print("Python version: 3.9")
    
    # Простые вычисления
    numbers = [1, 2, 3, 4, 5]
    total = sum(numbers)
    print(f"Sum of numbers {numbers} is: {total}")

if __name__ == "__main__":
    main()