fun main() {
   oddNumbers()
    names(arrayOf("Lisa","Stephanie","Daniella","Ava","Napoleon" ))
    serveDrinks(3)
   serveDrinks(12)
   serveDrinks(17)

   multipleNumbers()

}

//Create a function that prints out
//all the odd numbers between 1 and 100

fun oddNumbers(){
   var num = 1..100
   for(n in num){
      if (n%2!=0){
         println(n)
      }

   }

}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters.

fun names(name:Array<String>): Int {
   var numLength = 0
   for (n in name) {
      if (n.length > 5) {
         numLength++
      }
   }
      return numLength
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun serveDrinks(age:Int){
   when(age){

      in 0..6 -> println("milk")
      in 7..15 -> println("orange")
      else -> println("cocacola")

   }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun multipleNumbers() {
   var number = 1..100
   for (n in number) {
      if (n % 3 == 0 && n%5==0) {
         println("FizzBUzz")
      }
      else if (n%3==0){
         println("Fizz")
      }

      else if (n%5==0){
         println("Buzz")
      }

      else{
         println(n)
      }
   }



}
