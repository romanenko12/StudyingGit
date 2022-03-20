fun main() {
    println("Some code...")
    println("More some corrected code...")
    val master: NewFileInMaster = NewFileInMaster()
    master.doSomething()
    val dev: NewFileInDev = NewFileInDev()
    dev.feature()
}