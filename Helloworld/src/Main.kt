fun main(args : Array<String>){
    println("hello world")

    var number: Int = 4
    val a = 4
    var number1  = 10

    println(number+number1)

    var tittu = Alien(); // create a object

    tittu.name="Debjit";

    println("Alien name is :"+tittu.name);

    println("Alien name is : ${tittu.name}");

    //creating java class object insidde kotlin

    var obj = Alien1();

    obj.set("Debjit");
    println(obj.get());
}
