package com.ABC.bitrade.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABC.bitrade.controller.BaseController;
import com.ABC.bitrade.entity.DataDictionary;
import com.ABC.bitrade.service.DataDictionaryService;
import com.ABC.bitrade.util.MessageResult;

/**
 * @author GS
 * @Title: ${file_name}
 * @Description:
 * @date 2018/4/1214:21
 */
@RestController
@RequestMapping("data-dictionary")
public class DataDictionaryContrller extends BaseController {
    @Autowired
    private DataDictionaryService service;

    @GetMapping("{bond}")
    public MessageResult get(@PathVariable("bond") String bond) {
        DataDictionary data = service.findByBond(bond);
        if (data == null) {
            return error("validate bond");
        }
        return success((Object) data.getValue());
    }

}
