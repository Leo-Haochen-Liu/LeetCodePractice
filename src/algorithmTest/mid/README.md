# COMP1110 Week 2 Lab

Each lab you will have some Tasks and Exercises. *Tasks* must be completed whilst *Additional Exercises* are extra practice related to this lab and/or the lecture content. Even if you don’t finish the lab, it is recommended that you make use of the additional exercises. All the tasks/exercises are done with your labs repo, and the Java tasks/exercises are done in IntelliJ.

This lab contains material from modules
[**J1**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J1) and
[**J5**](https://cs.anu.edu.au/courses/comp1110/lectures/theme/#J5)

**Tasks:**

1. [Gitlab: Pull Upstream Commits](#1-gitlab-pull-upstream-commits)
2. [Programming](#2-programming)
3. [Debugging](#3-debugging)

**Additional Exercises:**

4. [More functions](#4-more-functions)
5. [Extension Exercises](#5-extension-exercises)

## Before the Lab

* Complete your [personal journal](../../../journal.md) for Week 2, commit
  it and push **before** the start of your lab.

## Purpose

In this lab you will learn a little more about GitLab before you write,
test, and debug some small Java programs.

You may use either a lab computer, or your own computer running
natively-installed IntelliJ and Java, or a virtual machine.

**Your tutor will mark your engagement during the lab.**

## Part I: Check-In

During the first 30 minutes you will check in with **your tutor**.
This is your chance to very briefly let your tutor know that you're at the lab, and to look at your journal entry together, and to note any issues you would particularly like to get help with during the lab.
You won't be getting help from your tutor in the first 30 minutes; rather, your tutor will be finding out what peoples' needs are, and they'll be making a plan for how best to help their students during the next 90 minutes.

Getting the lab organized can take time.
While you're waiting for this to happen you can introduce yourself to someone else in your lab, and get started on the lab tasks.

## Part II: Your Lab Tasks

If you have a question or a problem during a lab, chances are someone else is having the same issue. If you get stuck, we encourage you to discuss with other people in your lab as well as your tutor.
Remember that collaboration is allowed, and encouraged, as long as you are not working on an individual assignment.

### 1. GitLab: Pull Upstream Commits

Remember that your lab, homework, and assignment repos are *forks*: your own version of the original (master) repositories.
Once you've forked a repository, your fork is an independent copy, and any changes made to the master repository will not be automatically applied to your fork.

Sometimes you may want to pull changes from the repo from which	you originally forked, and apply those changes to your repo.
For example, in this course, the master labs and homework repos will be updated on an almost weekly basis as the course progresses. Assignment repos may also be updated with corrections or improvements, which you need to merge into your forked repo.

In git, an [*upstream*](http://stackoverflow.com/questions/2739376/definition-of-downstream-and-upstream) repository is the repository from which a fork originally derived.
In your case, the *upstream* repo is the class version (master) of the repo from which your repo was forked.
Git has [advanced mechanisms for pulling changes](https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes) from an upstream repo; we'll explore one mechanism in this lab.

Before the start of this lab, we made some changes to the course version of the `comp1110-labs` repo.
Update your fork of the repo to include these changes using the following steps:

1. Open your `comp1110-labs` repo in IntelliJ.
2. If you have any uncommitted changes, commit them before starting the upstream pull (select **Git > Commit...**).
3. Select **Git > Manage Remotes...** and then click ![add button](../../../assets/icon-add.png) **Add** to add the comp1110 labs repo as a remote upstream repo (Name: `upstream` URL:`https://gitlab.cecs.anu.edu.au/comp1110/comp1110-labs.git`). Click **OK**.
5. Select **Git > Pull...** which will bring up a dialog titled "Pull to master".
6. There are two drop-down menus which allow you to select the remote repository (e.g. "origin") and the branch to pull from (e.g. "main"). 
   Change the remote to `upstream`.
7. You may not have an up-to-date list of the branches in the upstream repo.
   Update the list of branches by typing `Ctrl+F5`.
8. Select the `upstream/main` branch, and click **Pull**.
   Just like in Lab 1, Git should be able to merge the changes automatically.
   If not, you may need to merge, in which case you should consult your tutor if you're unsure what to do.
10. Bring up the **Git** tool window at the bottom of your IntelliJ workspace, and select **Log**, and notice that you now have new changes in your history.
11. Select **Git > Push...** to push the newly merged changes to your fork of the comp1110-labs repo on GitLab.

Go to the GitLab web page for your labs repo, and from the ![Repository sidebar button - file](../../../assets/icon-repository-sidebar.png) **Repository** sidebar menu, use the **Commits** and **Graph** menu options  to see how the changes you pulled have been integrated into your own repo.
 
Once you've merged upstream changes into your forked version of the repository on GitLab, you can merge those changes into any other clones of your forked repo (e.g. on your home computer) using a simple Git pull.

Repeat the above exercise for the homework and assignment repos.
The steps are the same, but you need to change the repo name in steps 1 and 3
(using, for example, `comp1110-homework` instead of `comp1110-labs`).

Note: it is crucial that you **frequently pull from upstream** all the homework, lab and assignment repos.
We will announce (on the course forum) each time we make major changes to these repos, and it would be frustrating to work according to tests or specifications which have changed!
A good habit is to pull from upstream each time you start working on one of these repos. 

### 2. Programming

The following programming tasks exercise simple *imperative* programming, demonstrating *sequence*, *selection*, and *repetition*.

1. **Time**
   (adapted from exercise 2.3 in [Downey's and Mayfield's book](https://greenteapress.com/wp/think-java/)).
    
    **A.**
    
    Inside the package `comp1110.lab2` make a new class called `Time`. Add a main method to this class (Remember: use `psvm` or `main` as the completion shortcut to create the main method). 
    
    **B.**
    
    In your main method, declare variables `hour`, `minute`, `second`,
	and initialise them to values that correspond roughly to the current
	time (using a 24-hour clock).
   
    **C.**

    Write code to calculate and print out the number of seconds since the
	start of the lab time.

    **D.**

    Add code to calculate and print out the number of seconds remaining in
	the lab.

    **E.**

    Add code to calculate and print out the percentage of the lab time
	that has elapsed.
   
	**F.** 

	Compare your `Time` class with that of another (neighbouring) student.
	Do they look the same? Did either of you define any functions that
	were used in the solution?

2. **Writing a function**

	The [triangular numbers](https://en.wikipedia.org/wiki/Triangular_number)
	is the number sequence

		0, 1, 3, 6, 10, 15, 21, ...

	The _n_:th triangular number is defined as the sum of the numbers
	from 0 to _n_, inclusive, that is, _0 + 1 + ... + n_.

	Note that the sequence starts from zero: The zeroth triangular number
	is zero, and the first triangular number is 1.

	There is also closed-form formula for the _n_:th triangular number:
	_T(n) = n (n + 1) / 2_.

	Write a function that, given _n_, computes the _n_:th triangular number.

	**A.**

	Create a new class, called `TriangularNumbers` within the `comp1110.lab2`
	package.

    **B.**
	
	Within this class, define a method with the signature
	
	`static int triangularNumber(int n)`

	and implement the calculation described above in this method. Note
	that the method must `return` (not print) the value.
    
    **C. Test & debug your program**

	Test your program using the `L2 TriangularNumbers` test. If it fails
	any of the tests, look carefully at the output from the failed test:
	what are the argument values, the expected return value, and the
	value that your function returned? Do you agree that the expected
	return value is right? If so, there's an error in your code. If you
	think the expected return value is wrong, the error is probably in
	your understanding of what the function is supposed to do.
	
	**D. (optional)**
	
	You can also add a `main` method to your class, making it runnable.
	Within the main method, you can define your own test cases, call
	your function, and print out the result.

### 3. Debugging

Detecting, understanding and removing errors in code
(known as ["debugging"](https://blog.patracompany.com/the-history-of-the-computer-bug)) is a critically important process in software development.
While we can take active measures to reduce the number of errors introduced
into code, no developer is perfect and the skill to identify and
fix bugs is essential to learn.

In this exercise, you will explore a simple code example that contains
a bug, and try out different debugging techniques.

**A.**

Open the class `Medians` in `comp1110/lab2`.
This class contains a function that computes the median of five integers
(recall that the median is the number that appears in the middle when the
five integers are sorted in order).

The main method of the class contains some test cases, which call the
`medianOf5` method with different permutations of the values 1, 2, 3, 4,
and 5, and prints out the returned value. The median of these five numbers
is 3, so the method should return 3 in all cases.

Run the main method, and observe that this does not happen.

#### Narrowing (code reduction)

First, focus on the test case that fails: You can (temporarily) comment
out the other tests.

The `medianOf5` function calls several supporting functions: as a first
step, check if any of these are behaving incorrectly in the failing case.
Add tests for `maxOf5` and `minOf5` for the failing permutation of numbers
to the main method, and check if they give the right answers. If they
do, we can rule them out as the location of the error in this case.

#### Print Statements

A commonly-used method of debugging is to add print statements at
important points in the program.

The `medianOf5` function has many branching statements. Try to identify
which branch is taken in the failing test case; then add print statements
to them that will show you if the execution is indeed going down the
branches you expect. (Note that you may have to add braces `{ }` around
some branches that consist of a single statement, so that you can add
a print statement.) You can also print out the values of relevant
variables at that point.

#### The _Debugger_ (Breakpoints and Step Through Debugging) 

IntelliJ has a powerful Java debugger built in.
To get started using it, have a look at this
[tutorial](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html).
The debugger allows you to step through the execution of a program,
and inspect the values of variables after every step.
You can also set _breakpoints_, and let the program run until it
reaches one of the breakpoints; this saves you from tediously
stepping through parts of the code that you already know are not
the problem. For example, try setting a breakpoint at the branch
that `medianOf5` takes in the failing test case (where you previously
added a print statement).

**B.**

Once you have found and corrected the error, don't forget to (1) uncomment
and rerun _all_ the test cases, to verify that you have not introduced a
new error in the process of debugging; and (2) remove any print statements
you added.

## Part III: Additional Exercises

These are additional exercises related to the lab and lecture content so far. They are not compulsory, but are great practice, and your tutor will be able to provide assistance and feedback during the lab. You are also welcome to discuss these (and any of the lab tasks) on the course forum.

### 4. More functions

1.  A linear equation in one unknown is an equation of the form

    $$a x = b$$

    where $a$ and $b$ are known constants (numbers) and $x$ is the
	unknown variable.
	This is easy to solve: the answer is
	
	$$x = b / a$$
	
	(and it has no unique solution if $a = 0$).

	A system of two linear equations in two unknowns looks like this:

	$$a_1 x + b_1 y = c_1$$
	$$a_2 x + b_2 y = c_2$$

	where $a_1$, $a_2$, $b_1$, $b_2$, $c_1$ and $c_2$ are the
	known constants, and $x$ and $y$ are the unknowns.
	There are several methods for solving such a system of equations, but
	the one we will try here is by substitution.

	First, find the ratio $r = a_1 / a_2$. It follows that

	$$(b_1 - r b_2) y = c_1 - r c_2$$

	This is a single equation in one unknown, which we know how to solve.
	That gives us the value of $y$, and we can now reorganise one of the
	original equations into

	$$a_1 x = c_1 - b_1 y$$

	Here the value of $y$ is known, so the right-hand side is just an
	arithmetic expression that can be evaluated. This again brings us
	back to a single equation in one unknown, which we know how to solve.

	**A.**
	
	Create a class `LinearEquationSolve`, and write in it a function
	
	```
	static double solve1(double a, double b)
	```
	
	which solves the linear equation $a x = b$ and returns the value
	of $x$.

	**B.**

	A another function
	
	```
	static void solve2(double a1, double b1, double c1, double a2, double b2, double c2)
	```
	
	which solves the system of two linear equations shown above.
	Since we do not yet know enough Java to return a pair of values
	from a function, you can just print the result as
	
	```
	x = ...
	y = ...
	```
	
	instead.

	Does your `solve2` function call `solve1`?

	**C.**
	
	Find some simple test cases for your equation-solving functions,
	and add a main method that calls the functions on those cases.
	(For `solve` you will need to print out the returned value.)

2.  (Adapted from an exercise in Downey's python book)

	An online book retailer offers a 40% discount, if you order more than
	one copy of a book. The shipping and handling fee is $5.50 for the first
	copy, and $2.75 for each additional copy. Write a function that computes
	the total order cost, given the price of a book and the number of copies.

	**A.**

	Create a new class, called `TotalOrderCost` within the `comp1110.lab2`
	package.

	**B.**
	
	Within this class, define a method with the signature
	
	```
	static double totalCost(double bookPrice, int numberOfCopies)
	```

	and implement the calculation described above in this method. Note
	that the method must `return` (not print) the calculated total cost.

	**C.**

	Test your function. For example, if the book price is $25, and the
	order is for one copy, the returned total cost should be `30.50`.
	If the order is instead for four copies, the total cost should be
	`73.75`.

### 5. Extension Exercises 

Extension exercises are intended to give you some more challenging problems.
The exercises below makes use of content that was only hinted at in the
lectures so far.

1.  If you have taken COMP1100, you should already be familiar with
	recursion. Since you now know how to define functions and how to write
	branching code (using `if`-`else`), you already know enough Java to
	write simple (and some not so simple) recursive functions.

	**A.**

	If you didn't do so already, change your implementation of the
	`triangularNumber` function to	use the recursive definition
	(_T(n) = n + T(n-1)_), with a suitable base case. The function
	should still pass the same tests as before.

	**B.**

	Functions can operate on, return, values of other types than numbers.
	Write a recursive function that prints a triangular pattern of `*`,
	like this:

	```
	*
	**
	***
	****
	*****
	```

	The function should be parameterised with the number of lines to
	print. Remember that you can use `+` to concatenate strings.
	You should find this function fairly similar in structure to the
	recursive implementation of `triangularNumber`.

	**C.**

	Modify your function to print the triangular pattern with two
	different characters, `*` and `o`, like this:

	```
	*ooooo
	**oooo
	***ooo
	****oo
	*****o
	```

	This can also be done with a recursive function using string
	concatenation, but it is a bit more complicated.

2.  The functions we have written so far are what is, in Java, called
	"static methods". But there are also non-static methods (called
	"instance methods"). We will see much more of those later in the
	course, but for now, you can explore using a few of the `String`
	class' instance methods.

	For example, the following Java code will get the length of a
	string:
	
	```
	String s = "Hello again";
	int len = s.length();
	```
	
	The general form of an instance method call is
	`object.methodName(arguments)`.
	Note that the `object` does not have to be a variable; it can be
	any expression that evaluates to an object of the right type.

	You can find the documentation of methods in the `String` class
	[here](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html). Try using them to solve the following problems.

	**A.**

	In your `Time` class, instead of setting the values of `hour`,
	`minute` and `second` directly, provide a string of the format
	`hh:mm:ss`, where `hh` is the hour, `mm` the minutes, and `ss`
	the seconds (in 24 hour format); extract these components from
	the string, and use them to set the integer variables. (Note:
	you will likely need to use a (static) function such as
	`Integer.parseInt` to convert the string literals to integers.
	The `substring` and `indexOf` methods of the `String` class may
	be useful.)

	**B.**

	A _palindrome_ is a word (or, generally, string) that reads the same
	backwards as forwards, or, expressed another way, that is the same as
	itself in reverse.
	Some simple examples are `"racecar"` and `"dogged"`, and `"101101"`.
	Write a (recursive) function that determines if a given string is
	a palindrome. (The `substring` and `charAt` methods of the `String`
	class may be useful.)
