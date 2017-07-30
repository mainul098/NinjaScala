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

>Scala is an object-oriented language in pure form: every value is an object and every operation is a method call.

For example, when you say `1 + 2` in Scala, you are actually invoking a method named `+` defined in class `Int`. You can define methods with operator-like names that clients of your API can then use in operator notation. 

This is how the designer of Akka's actors API enabled you to use expressions such as requester `!` sum shown in the previous example: `!` is a method of the `Actor` class.

### Scala in functional

>Functions are first-class values in Scala. You can pass a function as arguments to other functiona, return them as results from functions, or store them in variables. You can also define a function inside other functions.

# Basic Syntax

### Define Variables
>Two kinds of variables `val` and `var`. `val` can never be reassigned. A `var` in contrast can be re-assigned throughout its lifetime. 

`val msg:String = "I am a string"`

Scala also support *type inference*, Scala's ability to figire out types you leave off. So, the below variable declation is also valid.

`val msg1 = "I am a string too"`


### Define Functions
```scala
def max(x: Int, y: Int): Int = {
           if (x > y) x
           else y
         }
 ```
 
 
 >For *non-recursive* function, *return* type declation is optional. Also, if a function consists of just one statement, you can optionally leave off the curly braces. Thus, you could alternatively write the `max` function like this:
 ```scala
def max(x: Int, y: Int) = if (x > y) x else y
 ```

>If there is no parameters and no interesting result, the function defination can be written as follow:
```scala
def greet() = println("Hello Mainul!")
```

### Iteration

#### Imperative style Iteration with `WHILE`
```scala
var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
```

#### Functional style Iteration with `FOREACH`
```scala
args.foreach((arg: String) => println(arg))
```

or 
```scala
args.foreach(arg => println(arg))
```

or 
```scala
args.foreach(println)
```

