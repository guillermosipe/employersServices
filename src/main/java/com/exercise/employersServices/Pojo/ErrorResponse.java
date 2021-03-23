package com.exercise.employersServices.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
    @JsonProperty("error")
    private String error;

    @JsonProperty("description")
    private String description;

    public ErrorResponse(String error, String description) {
        super();
        this.error = error;
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public String getDescription() {
        return description;
    }

}
