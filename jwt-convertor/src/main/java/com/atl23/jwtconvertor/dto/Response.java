package com.atl23.jwtconvertor.dto;

import com.atl23.jwtconvertor.util.SecurityStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {
    private SecurityStatus status;
    private String message;
}
