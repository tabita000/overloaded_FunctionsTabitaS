// You are going to accept customer information from a user. You will ask them if they are a residential or business
//customer. If they are a residential customer you will accept their name and phone number. If they are a business
// customer you will accept their business name, contact name, and phone number.

fun businessCustomer(businessName: String, contactName: String, businessPhoneNumber: Int): String {
    return "$businessName, $contactName, $businessPhoneNumber"
}

fun residentialCustomer(name: String, phoneNumber: Int): String {
    return "$name, $phoneNumber"
}


fun main() {
    var looping = true
    while (looping) {
        println("\nPlease enter the number of your choice: ")
        println("1. Business Customer")
        println("2. Residential Customer")
        println("3. Exit")

        var choice = readLine()?.toIntOrNull()

        if (choice == 1) {    //for business customer

            println("Please enter your business name: ")
            var businessName = readLine().toString()

            println("Please enter the contact name: ")
            var contactName = readLine().toString()

            println("Please enter the phone number: ")
            var businessPhoneNumber = readLine()?.toIntOrNull()

            if (businessPhoneNumber != null) {
                var businessInfo = businessCustomer(businessName, contactName, businessPhoneNumber)
                println("\nCustomer Information: ")
                println(businessInfo)
            } else {
                println("Please enter valid information")
            }
        } else if (choice==2) {    // Residential customer
            println("Please enter your name: ")
            var name = readLine().toString()

            println("Please enter your phone number: ")
            var phoneNumber = readLine()?.toIntOrNull()

            if (phoneNumber != null) {
                var residentialInfo = residentialCustomer(name, phoneNumber)
                println("\nCustomer Information: ")
                println(residentialInfo)
            } else {
                println("Please enter valid info")
            }
        } else if (choice==3) {
            println("K bye!")
            looping = false
        } else {
            println("Invalid choice! Please enter 1, 2, OR 3.")
        }
    }

}

//EXAMPLE FROM LECTURE
// fun addSomeNumbers(x: Int, y: Int): Int {
//    var ans = x + y
//     return ans
//}
//
//fun addSomeNumbers(x: Int, y: Int, z: Int): Int {
//    var ans = x + y + z
//    return ans
//}
//
// fun main() {
//     var z = addSomeNumbers(2,3)
//     println(z)
// }