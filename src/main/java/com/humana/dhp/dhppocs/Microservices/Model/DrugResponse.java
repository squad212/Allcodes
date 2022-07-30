package com.humana.dhp.dhppocs.Microservices.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DrugResponse {
    private String drugmsg;
}
