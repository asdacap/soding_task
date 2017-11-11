Soding Test
===========

So, apparently as a part of soding.com.my recruitment process you are given a test. And surprisingly this time,
its a competitive programming-like test. Last time, which was one or two years ago, I have to make a full
web-app. I did not. Because I forgot about it at that time. But here I am. Doing it again....

The Question
------------

Generate a fibanocci sequence, and sum up all the even valued terms whose value do not exceed four million.
Originally, I thought up to the four million'th term. That would be interesting, and typical of competitive
programming. But then again, the value itself would be astronomical. And they did not mention anything
about mod a prime number or something.

Sadly it asked me to use the language that I specified in the Google Form, which is Ruby, PHP, Javascript,
Kotlin and Java. It said "using programming language that you APPLIED IN THE GOOGLE FORM". But the Google
Form asked for five. So... I guess I'll just use all of them? And I can't use C++, because I did not specify
it. I was asking for a Full Stack position. I never know anyone who use C++ in a Full stack position. So
here you have, how to solve this task in 5 programming language.

The Solution
------------

As you may or may not know, typical competitive programming challenge that involve generating fibanocci
sequence usually requires the use of Dynamic Programming. But this time, as the maximum value is four million,
that is not required as fibanocci value increase very exponetially. Something around log_2 4000000 (which is about 22) iteration,
 is enough. But because I want to see what Soding's AI engine can do, I'm going
to do a Dynamic Programming solution... with dimentional reduction. Let see if the AI engine gets confused.

Running
-------

- Java: `javac Main.java && java Main`
- PHP: `php Php.php`
- Javascript: `node JS.js`
- Ruby: `ruby Ruby.rb`
- Kotlin: `kotlinc Kotlin.kt -include-runtime -d fib.jar && java -jar fib.jar`
