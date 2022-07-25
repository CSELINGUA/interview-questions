

file = open("C:\Detector.java, "r")
data = file.read()
number_of_characters = len(data)
print('Number of characters in text file:', number_of_characters)

to exclude spaces
data = file.read().replace(" ","")
