package com.humana.dhp.dhppocs.Microservices.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GreetingResponse {
    private String greeting;
}
