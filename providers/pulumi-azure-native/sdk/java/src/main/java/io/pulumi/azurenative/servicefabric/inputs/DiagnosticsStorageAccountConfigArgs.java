// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The storage account information for storing Service Fabric diagnostic logs.
 * 
 */
public final class DiagnosticsStorageAccountConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticsStorageAccountConfigArgs Empty = new DiagnosticsStorageAccountConfigArgs();

    /**
     * The blob endpoint of the azure storage account.
     * 
     */
    @InputImport(name="blobEndpoint", required=true)
      private final Output<String> blobEndpoint;

    public Output<String> getBlobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * The protected diagnostics storage key name.
     * 
     */
    @InputImport(name="protectedAccountKeyName", required=true)
      private final Output<String> protectedAccountKeyName;

    public Output<String> getProtectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }

    /**
     * The secondary protected diagnostics storage key name. If one of the storage account keys is rotated the cluster will fallback to using the other.
     * 
     */
    @InputImport(name="protectedAccountKeyName2")
      private final @Nullable Output<String> protectedAccountKeyName2;

    public Output<String> getProtectedAccountKeyName2() {
        return this.protectedAccountKeyName2 == null ? Output.empty() : this.protectedAccountKeyName2;
    }

    /**
     * The queue endpoint of the azure storage account.
     * 
     */
    @InputImport(name="queueEndpoint", required=true)
      private final Output<String> queueEndpoint;

    public Output<String> getQueueEndpoint() {
        return this.queueEndpoint;
    }

    /**
     * The Azure storage account name.
     * 
     */
    @InputImport(name="storageAccountName", required=true)
      private final Output<String> storageAccountName;

    public Output<String> getStorageAccountName() {
        return this.storageAccountName;
    }

    /**
     * The table endpoint of the azure storage account.
     * 
     */
    @InputImport(name="tableEndpoint", required=true)
      private final Output<String> tableEndpoint;

    public Output<String> getTableEndpoint() {
        return this.tableEndpoint;
    }

    public DiagnosticsStorageAccountConfigArgs(
        Output<String> blobEndpoint,
        Output<String> protectedAccountKeyName,
        @Nullable Output<String> protectedAccountKeyName2,
        Output<String> queueEndpoint,
        Output<String> storageAccountName,
        Output<String> tableEndpoint) {
        this.blobEndpoint = Objects.requireNonNull(blobEndpoint, "expected parameter 'blobEndpoint' to be non-null");
        this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName, "expected parameter 'protectedAccountKeyName' to be non-null");
        this.protectedAccountKeyName2 = protectedAccountKeyName2;
        this.queueEndpoint = Objects.requireNonNull(queueEndpoint, "expected parameter 'queueEndpoint' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.tableEndpoint = Objects.requireNonNull(tableEndpoint, "expected parameter 'tableEndpoint' to be non-null");
    }

    private DiagnosticsStorageAccountConfigArgs() {
        this.blobEndpoint = Output.empty();
        this.protectedAccountKeyName = Output.empty();
        this.protectedAccountKeyName2 = Output.empty();
        this.queueEndpoint = Output.empty();
        this.storageAccountName = Output.empty();
        this.tableEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsStorageAccountConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> blobEndpoint;
        private Output<String> protectedAccountKeyName;
        private @Nullable Output<String> protectedAccountKeyName2;
        private Output<String> queueEndpoint;
        private Output<String> storageAccountName;
        private Output<String> tableEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsStorageAccountConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobEndpoint = defaults.blobEndpoint;
    	      this.protectedAccountKeyName = defaults.protectedAccountKeyName;
    	      this.protectedAccountKeyName2 = defaults.protectedAccountKeyName2;
    	      this.queueEndpoint = defaults.queueEndpoint;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.tableEndpoint = defaults.tableEndpoint;
        }

        public Builder blobEndpoint(Output<String> blobEndpoint) {
            this.blobEndpoint = Objects.requireNonNull(blobEndpoint);
            return this;
        }

        public Builder blobEndpoint(String blobEndpoint) {
            this.blobEndpoint = Output.of(Objects.requireNonNull(blobEndpoint));
            return this;
        }

        public Builder protectedAccountKeyName(Output<String> protectedAccountKeyName) {
            this.protectedAccountKeyName = Objects.requireNonNull(protectedAccountKeyName);
            return this;
        }

        public Builder protectedAccountKeyName(String protectedAccountKeyName) {
            this.protectedAccountKeyName = Output.of(Objects.requireNonNull(protectedAccountKeyName));
            return this;
        }

        public Builder protectedAccountKeyName2(@Nullable Output<String> protectedAccountKeyName2) {
            this.protectedAccountKeyName2 = protectedAccountKeyName2;
            return this;
        }

        public Builder protectedAccountKeyName2(@Nullable String protectedAccountKeyName2) {
            this.protectedAccountKeyName2 = Output.ofNullable(protectedAccountKeyName2);
            return this;
        }

        public Builder queueEndpoint(Output<String> queueEndpoint) {
            this.queueEndpoint = Objects.requireNonNull(queueEndpoint);
            return this;
        }

        public Builder queueEndpoint(String queueEndpoint) {
            this.queueEndpoint = Output.of(Objects.requireNonNull(queueEndpoint));
            return this;
        }

        public Builder storageAccountName(Output<String> storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Output.of(Objects.requireNonNull(storageAccountName));
            return this;
        }

        public Builder tableEndpoint(Output<String> tableEndpoint) {
            this.tableEndpoint = Objects.requireNonNull(tableEndpoint);
            return this;
        }

        public Builder tableEndpoint(String tableEndpoint) {
            this.tableEndpoint = Output.of(Objects.requireNonNull(tableEndpoint));
            return this;
        }
        public DiagnosticsStorageAccountConfigArgs build() {
            return new DiagnosticsStorageAccountConfigArgs(blobEndpoint, protectedAccountKeyName, protectedAccountKeyName2, queueEndpoint, storageAccountName, tableEndpoint);
        }
    }
}
