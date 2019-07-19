package com.dimitar.di.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FakeDataSource {
    private String name;
    private String password;
    private String URL;
}
