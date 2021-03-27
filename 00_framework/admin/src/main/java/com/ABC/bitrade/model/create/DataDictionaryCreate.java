package com.ABC.bitrade.model.create;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import com.ABC.bitrade.ability.CreateAbility;
import com.ABC.bitrade.entity.DataDictionary;

/**
 * @author Shaoxianjun
 * @Title: ${file_name}
 * @Description:
 * @date 2019/4/1214:24
 */
@Data
public class DataDictionaryCreate implements CreateAbility<DataDictionary> {
    @NotBlank
    private String bond;
    @NotBlank
    private String value;
    private String comment;

    @Override
    public DataDictionary transformation() {
        return new DataDictionary(bond, value, comment);
    }
}
