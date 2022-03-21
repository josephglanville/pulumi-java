// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a Power BI output data source.
 * 
 */
public final class PowerBIOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PowerBIOutputDataSourceArgs Empty = new PowerBIOutputDataSourceArgs();

    /**
     * The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="dataset")
      private final @Nullable Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset == null ? Output.empty() : this.dataset;
    }

    /**
     * The ID of the Power BI group.
     * 
     */
    @Import(name="groupId")
      private final @Nullable Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId == null ? Output.empty() : this.groupId;
    }

    /**
     * The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
     * 
     */
    @Import(name="groupName")
      private final @Nullable Output<String> groupName;

    public Output<String> getGroupName() {
        return this.groupName == null ? Output.empty() : this.groupName;
    }

    /**
     * A refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="refreshToken")
      private final @Nullable Output<String> refreshToken;

    public Output<String> getRefreshToken() {
        return this.refreshToken == null ? Output.empty() : this.refreshToken;
    }

    /**
     * The name of the Power BI table under the specified dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<String> table;

    public Output<String> getTable() {
        return this.table == null ? Output.empty() : this.table;
    }

    /**
     * The user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserDisplayName")
      private final @Nullable Output<String> tokenUserDisplayName;

    public Output<String> getTokenUserDisplayName() {
        return this.tokenUserDisplayName == null ? Output.empty() : this.tokenUserDisplayName;
    }

    /**
     * The user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserPrincipalName")
      private final @Nullable Output<String> tokenUserPrincipalName;

    public Output<String> getTokenUserPrincipalName() {
        return this.tokenUserPrincipalName == null ? Output.empty() : this.tokenUserPrincipalName;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'PowerBI'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PowerBIOutputDataSourceArgs(
        @Nullable Output<String> dataset,
        @Nullable Output<String> groupId,
        @Nullable Output<String> groupName,
        @Nullable Output<String> refreshToken,
        @Nullable Output<String> table,
        @Nullable Output<String> tokenUserDisplayName,
        @Nullable Output<String> tokenUserPrincipalName,
        Output<String> type) {
        this.dataset = dataset;
        this.groupId = groupId;
        this.groupName = groupName;
        this.refreshToken = refreshToken;
        this.table = table;
        this.tokenUserDisplayName = tokenUserDisplayName;
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PowerBIOutputDataSourceArgs() {
        this.dataset = Output.empty();
        this.groupId = Output.empty();
        this.groupName = Output.empty();
        this.refreshToken = Output.empty();
        this.table = Output.empty();
        this.tokenUserDisplayName = Output.empty();
        this.tokenUserPrincipalName = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerBIOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataset;
        private @Nullable Output<String> groupId;
        private @Nullable Output<String> groupName;
        private @Nullable Output<String> refreshToken;
        private @Nullable Output<String> table;
        private @Nullable Output<String> tokenUserDisplayName;
        private @Nullable Output<String> tokenUserPrincipalName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerBIOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.refreshToken = defaults.refreshToken;
    	      this.table = defaults.table;
    	      this.tokenUserDisplayName = defaults.tokenUserDisplayName;
    	      this.tokenUserPrincipalName = defaults.tokenUserPrincipalName;
    	      this.type = defaults.type;
        }

        public Builder dataset(@Nullable Output<String> dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder dataset(@Nullable String dataset) {
            this.dataset = Output.ofNullable(dataset);
            return this;
        }
        public Builder groupId(@Nullable Output<String> groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = Output.ofNullable(groupId);
            return this;
        }
        public Builder groupName(@Nullable Output<String> groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = Output.ofNullable(groupName);
            return this;
        }
        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = Output.ofNullable(refreshToken);
            return this;
        }
        public Builder table(@Nullable Output<String> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = Output.ofNullable(table);
            return this;
        }
        public Builder tokenUserDisplayName(@Nullable Output<String> tokenUserDisplayName) {
            this.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }
        public Builder tokenUserDisplayName(@Nullable String tokenUserDisplayName) {
            this.tokenUserDisplayName = Output.ofNullable(tokenUserDisplayName);
            return this;
        }
        public Builder tokenUserPrincipalName(@Nullable Output<String> tokenUserPrincipalName) {
            this.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }
        public Builder tokenUserPrincipalName(@Nullable String tokenUserPrincipalName) {
            this.tokenUserPrincipalName = Output.ofNullable(tokenUserPrincipalName);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public PowerBIOutputDataSourceArgs build() {
            return new PowerBIOutputDataSourceArgs(dataset, groupId, groupName, refreshToken, table, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}
