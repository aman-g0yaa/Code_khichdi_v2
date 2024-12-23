package com.curiosity.codekhichidi;

public class Problem {

    private String problem;

    // Getters and Setters
    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        return "model{" +
                "problem='" + problem + '\'' +
                '}';
    }

}