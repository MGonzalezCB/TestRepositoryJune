def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is: ${config.dayOfWeek}."
    sh "echo version 16"
}
