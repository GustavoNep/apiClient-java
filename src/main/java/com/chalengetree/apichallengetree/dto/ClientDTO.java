package com.chalengetree.apichallengetree.dto;

import com.chalengetree.apichallengetree.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    @NotBlank(message = "Required field")
    private String name;
    @NotBlank(message = "Required field")
    private String cpf;
    @Positive(message = "Income must be positive")
    private Double income;
    @PastOrPresent(message = "Invalid birth date")
    private LocalDate birthDate;
    @NotNull(message = "Required field")
    @Positive(message = "Number of children must be positive")
    private Integer children;
    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }
    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
