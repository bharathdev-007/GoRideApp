package com.dev.gorideapp.entities;

import com.dev.gorideapp.entities.enums.TransactionMethod;
import com.dev.gorideapp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private TransactionType transactionType;
    private TransactionMethod transactionMethod;

    @OneToOne
    private Ride ride;

    private String transactionId;
    @ManyToOne
    private Wallet wallet;

    @CreationTimestamp
    private LocalDateTime timeStamp;


}
