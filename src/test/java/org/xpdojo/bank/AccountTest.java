package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers.*;


import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
    @Test
    public void startBalanceIsZero() {
        Account account = new Account();
        assertThat( account.balance).isEqualTo(0);
    }
    @Test
//	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat( account.balance).isEqualTo(10);
    }

    @Test
//	@Disabled
    public void depositMultipleAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(100);
        assertThat( account.balance).isEqualTo(110);
    }

    @Test
    public void checkWithdrawalWithNoBalance() {
        Account account = new Account();
        account.withdrawal(10);
        assertThat( account.balance).isEqualTo(0);
    }

    @Test
    public void checkDepositWithdrawalBalance() {
        Account account = new Account();
        account.deposit(100);
        account.withdrawal(10);
        assertThat( account.balance).isEqualTo(90);
    }

    @Test
    public void checkTransferWithNoBalance() {
        Account account = new Account();
        account.transfer(1234, 10);
        assertThat( account.balance).isEqualTo(0);
    }

    @Test
    public void checkDeposittransferBalance() {
        Account account = new Account();
        account.deposit(100);
        account.transfer(1234,10);
        assertThat( account.balance).isEqualTo(90);
    }


}
