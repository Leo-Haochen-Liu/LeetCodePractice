# COMP1110 Week 3 Lab

Each lab you will have some Tasks and Exercises. *Tasks* must be completed whilst *Additional Exercises* are extra practice related to this lab and/or the lecture content. Even if you don’t finish the lab, it is recommended that you make use of the additional exercises. All the tasks/exercises are done with your labs repo, and the Java tasks/exercises are done in IntelliJ.

This lab contains material from modules
[**J5**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J5),
[**C1**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#C1),
[**J6**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J6) and
[**J3**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J3).

Remember to **pull upstream commits** from the master labs repo before
starting work on each lab! The process is explained in
[lab 2](../mid/README.md#1-gitlab-pull-upstream-commits) and on
[the course web site](https://comp.anu.edu.au/courses/comp1110/help/upstream-pull/).

**Tasks:**

1. [Basic iteration](#1-basic-iteration)
2. [Counting combinations](#2-counting-combinations)
3. [Counting peaks](#3-counting-peaks)

**Additional Exercises:**

4. [Debugging programs with loops](#4-debugging-programs-with-loops)
5. [More array problems](#5-more-array-problems)
6. [Extension Exercises](#6-extension-exercises)

## Before the Lab

* Complete your [personal journal](../../../journal.md) for Week 2, commit
  it and push **before** the start of your lab.

## Purpose

In this lab you will write, test, and debug some slightly more complex
Java functions, using loops and/or recursion, and working on arrays.

You may use either a lab computer, or your own computer running
natively-installed IntelliJ and Java, or a virtual machine.

**Your tutor will mark your engagement during the lab.**

## Part I: Check-In

Check in with **your tutor**. Briefly outline any issues you're having, that you'd particularly like help with during the lab (make sure you have your journal open and refer to it when you meet with your tutor).
When you're not checking in with your tutor, start on Part II below.

## Part II: Your Lab Tasks

You are encouraged to discuss these tasks with other people in your lab as well as your tutor.

### 1. Basic iteration

In [lab2](../mid/), you implemented a function to calculate the _n_:th
triangular number.

**A.**

As a warm-up exercise, add a main method to your `TriangularNumbers`
class (if you didn't already). In this method, write a loop (`while`
or `for`) to print the first 5 triangular numbers, one per line.
Run the program and check that the output is what you expect. Modify
it to print the first 10 and run again.

**B.**

In the `comp1110.lab3` package, create a new class, called
`MaxTriangularNumber`.

Within this class, define a method with the signature

`static int maxTriangularNumber(int limit)`

which returns the maximum value of _n_ such that the _n_:th
triangular number (that is, the sum _0 + 1 + ... + n_) is less
than or equal to the given value of the `limit` parameter.

**C. Test & debug your program**

Test your program using the `L3 MaxTriangularNumber` test.
If it fails	any of the tests, look carefully at the output from
the failed test: what are the argument values, the expected return
value, and the value that your function returned? If your function
is returning the wrong value, follow the debugging steps that you
practiced in the previous lab.
	
**D. (optional)**

The `maxTriangularNumber` can be implemented in several different
ways. Compare your solution with another students: did you both
implement it the same way? If so, work together to come up with
a different method.

### 2. Counting combinations

Another well known number series is the
[binomial numbers](https://en.wikipedia.org/wiki/Binomial_coefficient),
also known as "_n_ choose _k_", because it is the number of ways to
choose _k_ elements out of set of _n_, without repetition.

The most commonly known formula for calculating them is

    (n choose k) = n!/(k! (n-k)!),

where _n_! is the factorial function, defined as

    n! = n * (n - 1) * (n - 2) * ... * 1.

**A.**

Create a new class `Combinations`, and in it write a function

`static int choose(int n, int k)`

that returns the value of _n_ choose _k_. To apply the formula above,
you will also need to compute the factorial. Examples of how to do this
(using either recursion or iteration) were given in the lecture notes
([**C1**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#C1) and
[**J6**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J6)).

**B.**

Add a main method, with a simple loop that prints out the value of
_n_ choose _k_ for _k_ = 0, 1, ..., _n_. Run it with some smallish
values of _n_ (for example, up to 7). You should find the output
matching the corresponding row in
[Pascal's triangle](https://en.wikipedia.org/wiki/Pascal%27s_triangle).

You should also test your implementation using the
`L3 Combinations (small)` test. (You can try the
`L3 Combinations (medium)` and `L3 Combinations (large)` tests too,
but it's possible these may fail even if your implementation is
correct, for reasons discussed below.)

**C.**

Try a slightly larger value of _n_, such as _n_ = 15. Does the output
look right? The largest value, (15 choose 7) = 6435.

If you are seeing something else (or any negative outputs), the likely
reason is integer overflow. If you have implemented the formula above,
chances are the size of integers that result from intermediate expressions
(such as _n_!) are much larger than the final result, and large enough
to cause an overflow. Can you modify your implementation to avoid this?

**D.**

There is a simple recursive definition of the binomial numbers:

    (n choose k) = (n - 1 choose k) + (n - 1 choose k - 1)

Implement this calculation as a recursive function. Your function should
now be able to pass all the `L3 Combinations` tests (small, medium and
large).

### 3. Counting peaks

In an sequence of numbers, we say that there is a _peak_ at index _i_ if
the number at index _i_ is greater than both its neighbours, i.e., than
both the number at index _i-1_ and _i+1_.

For example, in the sequence

    213, 217, 274, 194, 219, 240, 207

there is a peak at index 2 (because 274 is greater than both 217 and 194)
and at index 5 (because 240 is greater than both 219 and 207). There are
no other peaks in this sequence.

**A.**

Create a new class `Peaks`, and in it write a function

`static int countPeaks(int[] numbers)`

that returns the number of peaks in the sequence of integers represented
by the array `numbers`. Note that, as we have defined peaks, there can
never be a peak at the two indices at either end of the array (`0` and
`length - 1`).

**B. Test & debug your program**

Test your program using the `L3 CountPeaks` test.


## Part III: Additional Exercises

These are additional exercises related to the lab and lecture content so far. They are not compulsory, but are great practice, and your tutor will be able to provide assistance and feedback during the lab. You are also welcome to discuss these (and any of the lab tasks) on the course forum.

### 4. Debugging programs with loops

Debugging programs with loops can sometimes be difficult. A loop can be
"stuck", with variables not changing, or changing in a repeating pattern,
so that the loop condition never becomes false, and the loop runs forever.
Or the the loop may exit too early, or never begin at all.

Classes `DigitSum1` and `DigitSum2` both implement a function
`static int sumOddDigits(int number)`, which is intended to return
the sum of the odd digits in the number.
For example, `sumOddDigits(6710)` should return 8 (7 + 1, since 6 and 0
are even digts), `sumOddDigits(2100)` should return 1 (the only odd digit),
and `sumOddDigits(6442)` should return 0 (since all digits are even).
(Implementing digit-summing function is also one of the
[homework](https://gitlab.cecs.anu.edu.au/comp1110/comp1110-homework/-/tree/main/src/comp1110/homework/J06) exercises.)

Both implementations use a loop to iterate over the digits in the number,
and both of them are incorrect. For each of the two, use the debugging
techniques discussed in [lab 2](../mid/) to find the errors. (There may
be more than one error!) Some test cases are written in the main method
of each of the two classes; if these tests are not enough to reveal the
error, you need to add further test cases.

### 5. More array problems

Create a new class `ArrayUtils`, and write in it the functions for
the three exercises that follow. Use `L3 ArrayUtilsTest` to test your
solutions. (This will run tests for all three problems below, but you
can of course solve them one at a time; simply ignore the failed tests
for the problems you haven't solved yet.)

1.  We say that a sequence of numbers is _superincreasing_ if every
	number after the first is greater than the sum of all foregoing
	numbers.

	Write a function `static boolean isSuperIncreasing(int[] array)`
	that returns `true` if the given array is superincreasing.
	Remember that the first number in a superincreasing array can
	be any number.

2.  A sequence is a _permutation_ of another if it has the same elements
	(each with the same number of repetitions, if there are any repeated
	elements) but possibly in a different order.

	Write a function `static boolean isPermutation(char[] a, char[] b)`
	that returns `true` if `b` is a permutation of `a`.

	To test the function, we can use the
	[`toCharArray`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#toCharArray())
	method of the `String` class. For example:

	```
	String word1 = "cats";
	String word2 = "scat";
	boolean answer = isPermutation(word1.toCharArray(), word2.toCharArray());
	```

3.  Write a function `static void reverse(int[] array)` that reverses
	the array in place. The function should not return any value, but
	should modify the given array, such that the order of its elements
	is reversed after calling the function. For example:

	```
	int[] numbers = {2, 4, 6, 8};
	reverse(numbers);
	System.out.println(java.util.Arrays.toString(numbers));
	```

	should print `8, 6, 4, 2`.

	(`java.util.Arrays.toString` is a static function that converts
	an array to a printable string representation).


### 6. Extension Exercises 

#### 6.1 Perfect shuffles

A [perfect shuffle](https://en.wikipedia.org/wiki/Faro_shuffle)
is obtained by splitting a sequence in two equal-sized halves,
and then interleaving the elements of the two halves.
In other words, it permutes a sequence _1,2,...2n-1,2n_ into the
sequence _1,n+1,2,n+2,...,n,2n_.

Write a function `static void perfectShuffle(int[] array)` that
performs a perfect shuffle on an array (of integers).
	
_Hint #1_: You can think about how to solve the problem recursively;
the perfect shuffle of _1,...,2n_ is _1,n+1_ followed by the
interleaving of _2,..n_ and _n+2,...,2n_, which is also the
perfect shuffle of _2,..n,n+2,...,2n_.

_Hint #2_: It is of course much easier to make a perfect shuffle
if you create a temporary array to hold a copy of the original
(or perhaps two, to hold one half each). The function
`java.utils.Arrays.copyOf` can be used to make a copy of an
array, or parts of an array.

_Hint #3_: You can find references to several algorithms
for in-place shuffling on the wikipedia page linked above.

You can of course write a nearly identical function to shuffle an
array of, for example, characters, or floating point numbers, or
strings. Nothing in the shuffling function really depends on the type
of elements in the argument array. Can we write, in Java, a general
shuffle function that works on any array? The answer is (almost) yes,
using
[generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html),
as we will see in a few weeks time.

#### 6.2 Counting combinations, revisited

We've seen how to compute the number of ways to choose *k* elements from a
set of *n* options, where each
element chosen counts as one of the _k_.
But what if the elements are different? For example, what
if the elements are of different sizes, or some elements are not as valuable
as others?

Suppose you and your friend have devised a secret language to talk with each
other. In this secret language, the two of you take letters and convert them to
*binary numbers* (numbers with only 0s and 1s). You've created a way to encode
the first eight letters as follows:

```
A -> 0
B -> 00
C -> 001
D -> 010
E -> 0010
F -> 0100
G -> 0110
H -> 0001
```

And before you complete the rest, you decide to test this encoding to see if
it's possible to decode a binary number into a message.

*Spoiler: it's not possible*. But, you decide to investigate further. Maybe
there are only a handful of different ways to decode an encrypted message, and
so you can find the right one by counting all the different possibilities?

**Your task:**
1. Create a class in the `comp1110.lab3` package, called `StringDecoding.java`;
2. In this class, write the method
`public static int countDecodings(String binaryMessage)`, which counts the
number of decodings for a binary message. For example, there are five different
decodings for the string `"00100"`: these are `"ADA"`, `"AF"`, `"CAA"`, `"CB"`,
and `"EA"` (feel free to verify this yourself if you'd like).
3. Test your work using the `L3 StringDecoding` test. Feel free to chat to
your classmates and your tutor if you have doubts!

(Note: this problem was taken from
[this StackOverflow post](https://stackoverflow.com/questions/72578991/count-combinations-in-the-given-string-using-dynamic-programming).
Please don't immediately click that link, because it also contains several
solutions to this problem!)
