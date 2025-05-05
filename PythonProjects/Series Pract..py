b=a=0
s=x=epsilon=0.0
epsilon=0.0
term=1
deno=num=resta=1
sum=0
signo=False

x=float(input("De el valor de X: "))
a=int(input("De el valor de A: "))
b=int(input("De el valor de B: "))
epsilon=float(input("De el valor de Epsilon: "))
while term>epsilon:
    if signo:
        term=num*x**(a-resta)/deno
        s+=term
        resta+=1
        signo=False
    else:
        term=num*x**(b-resta)/deno
        s-=term
        signo=True
    
    print("Término {0:3d}   {1:12.5f}".format(num, term))
    num+=1
    deno=0
    

    for i in range(1,num+1):
        if (num%i==0):
            deno+=i

print("Suma: {0:12.5f}".format(s))
    
        
        
