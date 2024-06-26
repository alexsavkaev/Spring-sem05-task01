package ru.gb.spring.Data.example.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;
}
