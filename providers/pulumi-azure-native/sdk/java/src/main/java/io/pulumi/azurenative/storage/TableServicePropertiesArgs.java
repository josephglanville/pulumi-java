// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.CorsRulesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableServicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableServicePropertiesArgs Empty = new TableServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Specifies CORS rules for the Table service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Table service.
     * 
     */
    @Import(name="cors")
      private final @Nullable Output<CorsRulesArgs> cors;

    public Output<CorsRulesArgs> getCors() {
        return this.cors == null ? Output.empty() : this.cors;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Table Service within the specified storage account. Table Service Name must be 'default'
     * 
     */
    @Import(name="tableServiceName")
      private final @Nullable Output<String> tableServiceName;

    public Output<String> getTableServiceName() {
        return this.tableServiceName == null ? Output.empty() : this.tableServiceName;
    }

    public TableServicePropertiesArgs(
        Output<String> accountName,
        @Nullable Output<CorsRulesArgs> cors,
        Output<String> resourceGroupName,
        @Nullable Output<String> tableServiceName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.cors = cors;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableServiceName = tableServiceName;
    }

    private TableServicePropertiesArgs() {
        this.accountName = Output.empty();
        this.cors = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tableServiceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<CorsRulesArgs> cors;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tableServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TableServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.cors = defaults.cors;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableServiceName = defaults.tableServiceName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder cors(@Nullable Output<CorsRulesArgs> cors) {
            this.cors = cors;
            return this;
        }
        public Builder cors(@Nullable CorsRulesArgs cors) {
            this.cors = Output.ofNullable(cors);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tableServiceName(@Nullable Output<String> tableServiceName) {
            this.tableServiceName = tableServiceName;
            return this;
        }
        public Builder tableServiceName(@Nullable String tableServiceName) {
            this.tableServiceName = Output.ofNullable(tableServiceName);
            return this;
        }        public TableServicePropertiesArgs build() {
            return new TableServicePropertiesArgs(accountName, cors, resourceGroupName, tableServiceName);
        }
    }
}
