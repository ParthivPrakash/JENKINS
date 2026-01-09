a=int(input("Enter a number: "))
if a<=1:
    print("Not a prime number")
else:
    is_prime=True
    for i in range(2,a):
        if a%i==0:
            is_prime = False
            break
    if is_prime:
        print("Number is prime")
    else:
        print("Number is not a prime")
if a%2==0:
    print("The number is even")
else:
    print("The number is odd")

    