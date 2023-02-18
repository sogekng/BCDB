package com.DASFN.BCDB.FeingClient.FeingDTO;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FeingDTO implements Serializable{

    @JsonProperty("value")
    private List<ValueDTO> value;


    public FeingDTO() {
    }

    public FeingDTO(List<ValueDTO> value) {
        this.value = value;
    }
}
