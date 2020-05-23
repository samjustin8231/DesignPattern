package com.example.codedesign.wallet.manyblood;

import com.example.codedesign.wallet.lackblood.InsufficientBalanceException;

import java.math.BigDecimal;

/**
 * @author sunyajun
 * @date 2020/4/28 4:48 下午
 */
public class VirtualWallet {

    // Domain领域模型(充血模型)
    private Long id;
    private Long createTime = System.currentTimeMillis();
    ;
    private BigDecimal balance = BigDecimal.ZERO;
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public void freeze(BigDecimal amount) {
    }

    public void unfreeze(BigDecimal amount) {
    }

    public void increaseOverdraftAmount(BigDecimal amount) {
    }

    public void decreaseOverdraftAmount(BigDecimal amount) {
    }

    public void closeOverdraft() {
    }

    public void openOverdraft() {
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public BigDecimal getAvaliableBalance() {
        BigDecimal totalAvaliableBalance = this.balance.subtract(this.frozenAmount);
        if (isAllowedOverdraft) {
            totalAvaliableBalance = totalAvaliableBalance.add(this.overdraftAmount);
        }
        return totalAvaliableBalance;
    }

    public void debit(BigDecimal amount) {
        BigDecimal totalAvaliableBalance = getAvaliableBalance();
        if (totalAvaliableBalance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException();
        }
        this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException();
        }
        this.balance.add(amount);
    }
}
