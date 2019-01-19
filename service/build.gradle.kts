plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "MainKt"
}

dependencies {
    compile(project(":api"))
    compile(kotlin("stdlib"))
}