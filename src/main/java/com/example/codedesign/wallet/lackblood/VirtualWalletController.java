package com.example.codedesign.wallet.lackblood;

import java.math.BigDecimal;

/**
 * @author sunyajun
 * @date 2020/4/28 4:35 下午
 */
public class VirtualWalletController {

    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

    //查询余额
    public BigDecimal getBalance(Long walletId) {

        return null;
    }

    //出账
    public void debit(Long walletId, BigDecimal amount) {

    }

    //入账
    public void credit(Long walletId, BigDecimal amount) {

    }

    //转账
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
}
