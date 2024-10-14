import java.io.File
import java.util.PriorityQueue
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Telecoms Application!")
    var running = true

    while (running) {
        println("Enter a command (load <filename>, view, mst, help, exit):")
        val input = scanner.nextLine().trim().split(" ").filter { it.isNotEmpty() }

        when {
            input.isEmpty() -> println("Invalid command. Please try again.")
            input[0] == "load" && input.size == 2 -> {
                println("Load command is not implemented yet.")

            }
            input[0] == "view" -> {
                println("View command is not implemented yet.")
            }
            input[0] == "mst" -> {
                println("MST command is not implemented yet.")
            }
            input[0] == "help" -> {
                println("Available commands:")
                println("  load <filename> - Load a graph from the specified file.")
                println("  view - View the capitals in the graph.")
                println("  mst - Display the minimum spanning tree of the graph.")
                println("  help - Show this help message.")
                println("  exit - Exit the application.")
            }
            input[0] == "exit" -> {
                running = false
                println("Exiting the application. Goodbye!")
            }
            else -> {
                println("Invalid command. Please try again.")
            }
        }
    }}