package com.example.rickandmortyquiz

class Question(question: Int, answer: Boolean) {
    val question = question;
    val answer = answer;
    var attemptedQuestion = false;
    var correctAnswer = false;
}