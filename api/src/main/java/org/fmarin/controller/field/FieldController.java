package org.fmarin.controller.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fields")
public class FieldController {

    private final FieldRepository repository;

    @Autowired
    public FieldController(FieldRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Field> list() {
        return (List<Field>) repository.findAll();
    }
}
