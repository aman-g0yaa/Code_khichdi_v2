package com.curiosity.codekhichidi.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.curiosity.codekhichidi.Problem;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class HelloController {

    ArrayList<String> problems = new ArrayList<String>();

    HelloController() {
        Problem problem = new Problem();
        problem.setProblem("problem1");
        problems.add(problem.getProblem());
    }

    @GetMapping("/problem")
    public String getProblem() {
        return problems.toString();
    }

    @GetMapping("/problem/{id}")
    public String getProblemById(@PathVariable String id) {
        return problems.get(Integer.parseInt(id));
    }

    @PostMapping("/problem")
    public String postProblem(@RequestBody Problem entity) {
        problems.add(entity.getProblem());
        return entity.getProblem();
    }

    @PutMapping("path/{id}")
    public String putProblem(@PathVariable String id, @RequestBody String entity) {

        if (problems.size() > Integer.parseInt(id)) {
            problems.set(Integer.parseInt(id), entity);
            return entity;
        }
        Problem problem = new Problem();
        problem.setProblem(entity);
        return postProblem(problem);

    }

    @PatchMapping("path/{id}")
    public String patchProblem(@PathVariable String id, @RequestBody String entity) {
        problems.set(Integer.parseInt(id), entity);
        return entity;
    }

    @DeleteMapping("/problem/{id}")
    public String deleteProblemById(@PathVariable String id) {

        return problems.remove(Integer.parseInt(id));

    }

}
