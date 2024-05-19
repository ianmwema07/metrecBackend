package com.metrec.backend.Dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Builder
public class TransactionDto {
    BigInteger id;
    String name;
    String purpose;
    String channel;
    LocalDateTime dateTime;
}
