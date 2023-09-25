# a = 10, a adalah variabel dan 10 adalah nilai dari variabel "a"

# py tidak ada deklarasi, langsung ketik variabelnya

a = 10 
print(a)

print("=====================")
# tipe data 

## integer (int) --> tipe data untuk angka tanpa koma
tipeInt = 99

print("nilai = ", tipeInt) 
print("* dengan tipe data = ", type(tipeInt))

## float --> tipe data untuk angka dengan koma
tipeFloat = 2.25

print("nilai = ", tipeFloat) 
print("* dengan tipe data = ", type(tipeFloat))

## string --> tipe data untuk semua character
tipeString = "ini adalah tipe data string berangka 100"

print("nilai = ", tipeString) 
print("* dengan tipe data = ", type(tipeString))

## kompleks -->

tipeComplex = complex(7,10)

print("nilai = ", tipeComplex) 
print("* dengan tipe data = ", type(tipeComplex))

## tipe data dari bahasa C --> harus di import terlebih dahulu

from ctypes import c_char, c_double, c_long

tipeC = c_long(18997)

print("nilai = ", tipeC) 
print("* dengan tipe data = ", type(tipeC))

## Casting tipe data 

# langsung diberi nama tipe data yang ingin diubah 

print("====CASTING TIPE DATA====")

dataInt = 10

dataFloat = float(dataInt)

print(dataInt, "diubah menjadi float = ", dataFloat)

# Begitu juga dengan semua tipe data





