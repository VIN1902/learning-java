# Control Flow
- ## Conditionals
```java
if (true) {
    System.out.print("Hello");
} else if (name) {
    System.out.print(name);
} else {
    System.out.print("Bye");
}

int result = true ? 10 : 5;

switch(x){
    case 1:
        //do
        break;
    case 2:
        //do
        break;
    default:
        //do
}
```
- ## Loops
```java
int i;
while(i < 4){
    System.out.print("Hello" + i);
    i++;
}

do{
    System.out.print("Hello" + i);
    i++;
} while(i < 4);

for(int i = 0; i < 4; i++){
    System.out.print("Hello" + i);
}
```