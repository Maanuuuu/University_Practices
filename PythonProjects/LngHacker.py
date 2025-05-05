

def leet_translator(texto):

    leet_alphabet = {"A": "4", "B": "I3", "C": "[", "D": ")", 
    "E": "3", "F": "|=", "G": "&", 
    "H": "#", "I": "1",
    "J": ",_|", "K": ">|", 
    "L": "1", "M": "/\/\\", 
    "N": " ^/", "O": "0", 
    "P": " |*", "Q": "(_,)",
    "R": "I2", "S": "5", 
    "T": "7", "U": "(_)", 
    "V": "\/", "W": "\/\/",
    "X": "><", "Y": "j",
    "Z": "2",
    "1": "L", "2": "R", "3": "E",
    "4": "A", "5": "S", "6": "b",
    "7": "T", "8": "B", "9": "g",
    "0": "o"}

    leet_text = ""


    for word in texto:
        if word.upper() in leet_alphabet.keys():
            leet_text += leet_alphabet[word.upper()]
        else:
            leet_text += word

    return leet_text

print(leet_translator("leet"))
print(leet_translator("Texto de prueba"))
print(leet_translator(input("Texto a traducir:")))