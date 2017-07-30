# ScalaNinja

## Roadmap

* Basic Lambda Calculus
* Functional Programming
* Language Syntax

## Resources

### Books
* [Programming in Scala: 3rd Edition by Martin Odersky, Lex Spoon, Bill Venners](https://www.amazon.com/Programming-Scala-Updated-2-12/dp/0981531687/ref=sr_1_1?s=books&ie=UTF8&qid=1486985609&sr=1-1&keywords=Programming+in+Scala)

### Video Tutorial
* [Functional Programming Principles in Scala (Coursera)] (https://www.coursera.org/learn/progfun1/home/welcome)

### Learning Videos

* [Scala Tutorial (YouTube)](https://www.youtube.com/watch?v=DzFt0YkZo8M)
* [Essential Scala: Six Core Principles for Learning Scala (YouTube)](https://www.youtube.com/watch?v=J8wUy1XxL5o)
* [SF Scala: Martin Odersky, Scala -- the Simple Parts (YouTube)](https://www.youtube.com/watch?v=ecekSCX3B4Q&t=2288s)

## Prepare The Worksation:

Follow the below link to prepare the workstation.
- [Install prerequisite Softwares](https://www.coursera.org/learn/progfun1/supplement/BNOBK/tools-setup-please-read)

### Configure Terminal to Git bash
Open the Terminal page of the **Settings/Preferences** dialog, and configure the Shell path field as follows:

`"[path to the git installation]\bin\sh.exe" -login -i`

>Do not forget the quotes around the command!

Now, when the terminal in IntelliJ IDEA will recognize git commands.

## Start Up
Scala stands for 'Scalable Language'. It runs on Java platform and interoperates seamlessly with all Java libraries.
### Scala is object-oriented
Scala is an object-oriented language in pure form: every value is an object and every operation is a method call. 
For example, when you say `1 + 2` in Scala, you are actually invoking a method named `+` defined in class `Int`. You can define methods with operator-like names that clients of your API can then use in operator notation. This is how the designer of Akka's actors API enabled you to use expressions such as requester `!` sum shown in the previous example: `!` is a method of the `Actor` class.

