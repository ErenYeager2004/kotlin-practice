class Methods {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            println("the sum is ${add(4,10)}")
        }

         fun add(a:Int,b:Int):Any{
            return a+b
        }
        //method overloading

        fun add(a:Int,b:Int,c:Int):Int{
            return a+b+c
        }
    }
}
