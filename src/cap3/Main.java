package cap3;
class Main {
    String name;

    public static void main(String[] args){
        Main dog1 = new Main();
        dog1.bark();
        dog1.name = "Mike";

        Main[] myDogs = new Main[3];
        myDogs[0] = new Main();
        myDogs[1] = new Main();
        myDogs[2] = new Main();

        myDogs[0].name ="Gamora";
        myDogs[1]= dog1;
        myDogs[2].name = "Margot";

        System.out.println("The name of the middle dog is " + myDogs[1].name);

        byte x = 0;
        while(x<myDogs.length){
            myDogs[x].bark();
            x++;
        }
    }

    public void bark(){
        if(name == null){
            name = "nameless";
        }
        System.out.println(name + " says woof woof");
    }}

/*

            Sharpen your pencil Page 52

        1. int x = 34.5; this is not possible to use this becouse it contains a decimal value(0.5).
        2. boolean boo = x; this is not possible to use this becouse x is a integer.
        3. int g = 17; this is possible, becouse 17 is a integer.
        4. int y = g; this is possible, becouse variable 'g' is another integer.
        5. y = y + 10; this is possible.both is integer.
        6. short s; this is possible, only variable declaration.
        7. s = y; this not possible, s is a short and y is a integer.
        8. byte b = 3; this is possible.
        9. byte v = b; this is possible, variable association.
        10. short n = 12; this is possible.
        11. v = n; this is not possible, v is a byte and n is a short.
        12. byte k = 128; this is not possible 128 it is beyond the capacity of byte (-128 ; 127).


         */