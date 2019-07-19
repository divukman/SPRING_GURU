package com.dimitar.di.examplebeans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FakeJmsBroker {

    private String username;
    private String password;
    private String url;

}
