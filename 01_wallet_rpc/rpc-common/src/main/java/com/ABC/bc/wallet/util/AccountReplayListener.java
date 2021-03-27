package com.ABC.bc.wallet.util;

import com.ABC.bc.wallet.entity.Account;

public interface AccountReplayListener {

    void replay(Account account);
}
