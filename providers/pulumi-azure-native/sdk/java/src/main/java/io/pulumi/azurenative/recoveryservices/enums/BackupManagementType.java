// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum BackupManagementType {
        Invalid("Invalid"),
        AzureIaasVM("AzureIaasVM"),
        MAB("MAB"),
        DPM("DPM"),
        AzureBackupServer("AzureBackupServer"),
        AzureSql("AzureSql"),
        AzureStorage("AzureStorage"),
        AzureWorkload("AzureWorkload"),
        DefaultBackup("DefaultBackup");

        private final String value;

        BackupManagementType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupManagementType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }