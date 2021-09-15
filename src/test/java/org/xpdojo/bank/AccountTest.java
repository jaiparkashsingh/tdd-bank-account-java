package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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
}
