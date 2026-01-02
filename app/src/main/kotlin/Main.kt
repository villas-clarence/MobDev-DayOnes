fun main() {
    println("=== Kotlin Development sa VS Code ===")
    
    // Variables
    val name = "Developer"
    var age = 25
    
    // String templates
    println("Hello $name, ikaw ay $age years old!")
    
    // Functions
    greetUser(name)
    
    // Collections
    val languages = listOf("Kotlin", "Java", "Python", "JavaScript")
    println("\nProgramming Languages:")
    languages.forEach { lang ->
        println("- $lang")
    }
    
    // Conditional
    val favoriteLanguage = "Kotlin"
    when (favoriteLanguage) {
        "Kotlin" -> println("\nExcellent choice! Kotlin is awesome! 🚀")
        "Java" -> println("\nClassic choice!")
        else -> println("\nGreat language!")
    }
}

fun greetUser(userName: String) {
    println("Welcome to Kotlin development, $userName!")
}