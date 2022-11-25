package app

import modal.Product
import service.ProductService
import java.util.*

fun main() {
    var productService = ProductService()
    var sc = Scanner(System.`in`)
    println("---------------------CRUD MENU----------------------")
    println("1)Create\n2)Read/Display All\n3)Update\n4)Delete\n5)Exit")
    println("Enter choice")
    var choice = sc.nextInt()
    while (choice < 6) {
        when (choice) {
            1 -> {
                println("enter id")
                var productId: Int = sc.nextInt()
                println("enter product name")
                var productName: String = sc.next()
                println("enter product price")
                var productPrice: Int = sc.nextInt()


                //object creation
                var product = Product(productId, productName, productPrice)
                //function call to ProductService
                productService.insertUserProduct(product)

            }

            2 -> {
                //display all rows
                productService.displayAllProducts()
            }

            3 -> {
                //update product name
                println("Enter product Id to update product name ")
                var productIdToUpdate: Int = sc.nextInt()

                println("enter updated product name")
                var productNameUpdated = sc.next()

                productService.updateProduct(productIdToUpdate, productNameUpdated)
            }

            4 -> {
                //delete row
                println("enter product id to delete")
                var productIdToDelete = sc.nextInt()
                productService.deleteProduct(productIdToDelete)

            }

            5 -> {
                println("Program End")
                System.exit(0)
            }
        }

        println("process completed enter choice to continue")
        println("1)Create\n2)Read/Display All\n3)Update\n4)Delete\n5)Exit")

        var ch = sc.nextInt()
        choice = ch
    }
}