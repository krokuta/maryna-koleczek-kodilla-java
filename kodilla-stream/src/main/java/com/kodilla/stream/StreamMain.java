package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(" jkhgtsdfetgsvdhca oijzqh uwz gswisjiwh ", (poem -> "*** " + poem + " ***"));
        poemBeautifier.beautify(" jkhgtsdfetgsvdhca oijzqh uwz gswisjiwh ", (poem -> poem.replace('s', '$')));
        poemBeautifier.beautify(" jkhgtsdfetgsvdhca oijzqh uwz gswisjiwh ", String::toUpperCase);
        poemBeautifier.beautify(" jkhgtsdfetgsvdhca oijzqh uwz gswisjiwh ", String::trim);
    }
}