package com.wallet.fina_mana.responses;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResponse {
    private long id;
    private String amount;
    private String image;
    private String description;
    private LocalDateTime time;
    private String type;
    private long category_id;
    private String categoryName;
    private long wallet_id;
    private String walletName;
//    private String walletIcon;
}
