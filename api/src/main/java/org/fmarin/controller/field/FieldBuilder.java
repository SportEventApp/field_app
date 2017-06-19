package org.fmarin.controller.field;

public final class FieldBuilder {
    private Long id;
    private String name;

    private FieldBuilder() {
    }

    public static FieldBuilder aField() {
        return new FieldBuilder();
    }

    public FieldBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public FieldBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Field build() {
        return new Field(id, name);
    }
}
