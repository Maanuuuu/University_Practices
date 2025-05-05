import time

seg = 0
minu = 0

x = True
aux = 0
print("Comienza la cuenta!")
while x == True:
    if(minu==10):
        x = False
    else:    
        #print("Seg: ",seg)
        time.sleep(0.1)
        
        if(seg == 10):
            seg = 0
            minu = minu + 1
            #print("Minutos: ",minu)
            print("-----")

        if(minu==5 and seg==0 ):
            print("Ya van 5 min")

        if(minu<10 and seg>=10):
            formato = "0{0}:{1}".format(minu,seg)
            print(formato)
        elif(seg<10 and minu>=10):
            formato = "{0}:0{1}".format(minu,seg)
            print(formato)
        elif(seg<10 and minu<10):
            formato = "0{0}:0{1}".format(minu,seg)
            print(formato)
        

        seg = seg + 1
        aux = aux + 1

        if(minu==10): 
            print("Se ha acabado :c")

 
