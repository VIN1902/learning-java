# Key points
- " " for string, ' ' for char
- file name same as class name

# Data Types
- Integer
    - byte (1 byte)
    - short (2 byte)
    - int (4 byte) (most used)
    - long (8 byte) (have to mention 'l' at the end)
- Float
    - float (4 byte) (have to mention 'f' at the end)
    - double (8 byte) (default so no need for suffix)
- Char
    - unicode (2 byte)
- Boolean
    - true, false

```java
byte num = 127;
short num = 32767;
int num = 2,147,483,647;
long num = 9,223,372,036,854,775,807l;

float num = 69.9f;
double num = 69.9;

char c = 'v';

boolean b = true;
```

# Literals
```java
// the fixed value written directly in code and assigned to a variable
int num = 0b101; // binary
int num = 0101; // octal
int num = 101; // decimal
int num = 0x7E; // Hexadecimal
int num = 10_000; // visual clarity output is 10000
```
# Access Modifiers

|                           	| Public 	| Private 	| Default 	| Protected 	|
|---------------------------	|--------	|---------	|---------	|-----------	|
| same class                	| yes    	| yes     	| yes     	| yes       	|
| same package subclass     	| yes    	| no      	| yes     	| yes       	|
| same package non-subclass 	| yes    	| no      	| yes     	| yes       	|
| diff package subclass     	| yes    	| no      	| no      	| yes       	|
| diff package non-subclass 	| yes    	| no      	| no      	| no        	|

# Polymorphism
- means many behavior (it will change based on situation)
- overloading = compile time polymorphism
- overriding = run time polymorphism