def Union(a,b):
    x=set(a)
    y=set(b)
    return (x.union(y))

def complemento(a,b):
    u=set(b)
    x=set(a)
    return(u.difference(x))

def interseccion(a,b):
    x=set(a)
    y=set(b)
    return(x.intersection(y))

def operaciones(a,b,u,hoja):
    if "(" and ")" in hoja:
        operaciones(a,b,u,hoja)
    if "u" in hoja:
        lol=Union(a,b)
        print(lol)
    elif "'" in hoja:
        comp=complemento(a,u)
        print(comp)    
    elif "∩"in hoja:
        interseccion(a,b)
