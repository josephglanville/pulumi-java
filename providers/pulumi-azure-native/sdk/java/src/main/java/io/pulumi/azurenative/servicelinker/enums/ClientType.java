// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ClientType {
        None("none"),
        Dotnet("dotnet"),
        Java("java"),
        Python("python"),
        Go("go"),
        Php("php"),
        Ruby("ruby"),
        Django("django"),
        Nodejs("nodejs"),
        SpringBoot("springBoot");

        private final String value;

        ClientType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClientType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
