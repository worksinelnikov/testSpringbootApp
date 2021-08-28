package com.sinol.testSpringbootApp.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Builder(toBuilder = true)
@Data
public class Person {
    @NonNull
    private UUID id;
    @NonNull
    private String name;
    @NonNull
    @Builder.Default
    private Date birth = new Date();
    @NonNull
    private String email;
    @Singular
    private Set<String> addresses;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", email='" + email + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
