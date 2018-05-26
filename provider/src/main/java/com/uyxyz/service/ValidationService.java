package com.uyxyz.service;

import com.uyxyz.service.pojo.ValidationParameter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public interface ValidationService {

    @interface Save{}

    void save(ValidationParameter parameter);

    @interface Update{}

    void update(ValidationParameter parameter);

    void delete(
            @Min(value = 1, message = "id must bigger than 1") long id,
            @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);
}
