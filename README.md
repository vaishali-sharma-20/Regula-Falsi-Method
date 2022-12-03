# Regula-Falsi-Method
In mathematics, an ancient method of solving an equation in one variable is the false position method (method of false position) or regula falsi method. In simple words, the method is described as the trial and error approach of using “false” or “test” values for the variable and then altering the test value according to the result. Here, Code of Regula-Falsi Method of Computer Oriented Numerical Methods in Java Language.
# Project title

Secant Method


## Motivation

A University Assignment. Clearly Used to Solve anhy Porblem and Perform Computer Oriented Prolblems .


## Method and results

Start
Read values of x0, x1 and e
*Here x0 and x1 are the two initial guesses
e is the degree of accuracy or the absolute error i.e. the stopping criteria*
Computer function values f(x0) and f(x1)
Check whether the product of f(x0) and f(x1) is negative or not.
If it is positive take another initial guesses.
If it is negative then goto step 5.
Determine:
x = [x0*f(x1) – x1*f(x0)] / (f(x1) – f(x0))
Check whether the product of f(x1) and f(x) is negative or not.
If it is negative, then assign x0 = x;
If it is positive, assign x1 = x;
Check whether the value of f(x) is greater than 0.00001 or not.
If yes, goto step 5.
If no, goto step 8.
*Here the value 0.00001 is the desired degree of accuracy, and hence the stopping criteria.*
Display the root as x.
Stop


## Repository overview

Provide an overview of the directory structure and files, for example:

├── README.md
├── out
├── Regula_Falsi.iml
├── .idea
│   ├── misc.xml
│   ├── modules.xml
|   ├── vcs.xml
│   └── workspace.xml
└── src
    ├── Regula_Falsi.java



## More resources

Referenced from Computer oriented Numerical Method Book By Rajaraman and our Faculty Dr. Shaligram Prajapat.


## About

You can say it has been part of a class you've taken at International Institute of Professional Studies, Indore.

