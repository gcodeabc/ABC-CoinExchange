package com.ABC.bitrade.handler;

import com.ABC.bitrade.entity.ChatMessageRecord;
import com.ABC.bitrade.entity.HistoryChatMessage;
import com.ABC.bitrade.entity.HistoryMessagePage;

public interface MessageHandler {

    void handleMessage(ChatMessageRecord message);

    HistoryMessagePage getHistoryMessage(HistoryChatMessage message);
}
