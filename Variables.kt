class Variables {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            var age : Int = 21
            var name : String = "Debjit"

            //2 types of formating
            println("My name is $name and i am $age years old")
            println("My name is "+name+" and i am "+age+" years old")

            //val and var
            var a = 10
            // if we use val its like the final key word like in java
            a = 11
            val aa =10
            //aa=10 error in this line
        }
    }
}
