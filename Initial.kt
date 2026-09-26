{\rtf1\ansi\ansicpg1251\cocoartf2870
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 fun fibonacci(n: Int): List<Int> \{\
    val sequence = mutableListOf<Int>()\
    var a = 0\
    var b = 1\
\
    repeat(n) \{\
        sequence.add(a)\
        val next = a + b\
        a = b\
        b = next\
    \}\
\
    return sequence\
\}\
\
fun main() \{\
    print("How many Fibonacci numbers do you want? ")\
\
    val input = readlnOrNull()\
    val count = input?.toIntOrNull()\
\
    if (count == null || count <= 0) \{\
        println("Please enter a positive integer.")\
        return\
    \}\
\
    val result = fibonacci(count)\
    println("First $count Fibonacci numbers: $result")\
\}}