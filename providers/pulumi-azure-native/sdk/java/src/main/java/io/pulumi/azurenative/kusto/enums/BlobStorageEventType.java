// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BlobStorageEventType {
        Microsoft_Storage_BlobCreated("Microsoft.Storage.BlobCreated"),
        Microsoft_Storage_BlobRenamed("Microsoft.Storage.BlobRenamed");

        private final String value;

        BlobStorageEventType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BlobStorageEventType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
