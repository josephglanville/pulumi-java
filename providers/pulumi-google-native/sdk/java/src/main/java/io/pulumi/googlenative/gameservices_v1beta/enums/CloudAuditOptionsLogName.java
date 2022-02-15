// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CloudAuditOptionsLogName {
        UnspecifiedLogName("UNSPECIFIED_LOG_NAME"),
        AdminActivity("ADMIN_ACTIVITY"),
        DataAccess("DATA_ACCESS");

        private final String value;

        CloudAuditOptionsLogName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudAuditOptionsLogName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }