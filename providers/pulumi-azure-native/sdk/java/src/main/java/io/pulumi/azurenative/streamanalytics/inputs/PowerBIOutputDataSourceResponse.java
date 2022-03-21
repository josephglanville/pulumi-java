// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Power BI output data source.
 * 
 */
public final class PowerBIOutputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PowerBIOutputDataSourceResponse Empty = new PowerBIOutputDataSourceResponse();

    /**
     * The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="dataset")
      private final @Nullable String dataset;

    public Optional<String> getDataset() {
        return this.dataset == null ? Optional.empty() : Optional.ofNullable(this.dataset);
    }

    /**
     * The ID of the Power BI group.
     * 
     */
    @Import(name="groupId")
      private final @Nullable String groupId;

    public Optional<String> getGroupId() {
        return this.groupId == null ? Optional.empty() : Optional.ofNullable(this.groupId);
    }

    /**
     * The name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
     * 
     */
    @Import(name="groupName")
      private final @Nullable String groupName;

    public Optional<String> getGroupName() {
        return this.groupName == null ? Optional.empty() : Optional.ofNullable(this.groupName);
    }

    /**
     * A refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="refreshToken")
      private final @Nullable String refreshToken;

    public Optional<String> getRefreshToken() {
        return this.refreshToken == null ? Optional.empty() : Optional.ofNullable(this.refreshToken);
    }

    /**
     * The name of the Power BI table under the specified dataset. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="table")
      private final @Nullable String table;

    public Optional<String> getTable() {
        return this.table == null ? Optional.empty() : Optional.ofNullable(this.table);
    }

    /**
     * The user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserDisplayName")
      private final @Nullable String tokenUserDisplayName;

    public Optional<String> getTokenUserDisplayName() {
        return this.tokenUserDisplayName == null ? Optional.empty() : Optional.ofNullable(this.tokenUserDisplayName);
    }

    /**
     * The user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     * 
     */
    @Import(name="tokenUserPrincipalName")
      private final @Nullable String tokenUserPrincipalName;

    public Optional<String> getTokenUserPrincipalName() {
        return this.tokenUserPrincipalName == null ? Optional.empty() : Optional.ofNullable(this.tokenUserPrincipalName);
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'PowerBI'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PowerBIOutputDataSourceResponse(
        @Nullable String dataset,
        @Nullable String groupId,
        @Nullable String groupName,
        @Nullable String refreshToken,
        @Nullable String table,
        @Nullable String tokenUserDisplayName,
        @Nullable String tokenUserPrincipalName,
        String type) {
        this.dataset = dataset;
        this.groupId = groupId;
        this.groupName = groupName;
        this.refreshToken = refreshToken;
        this.table = table;
        this.tokenUserDisplayName = tokenUserDisplayName;
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PowerBIOutputDataSourceResponse() {
        this.dataset = null;
        this.groupId = null;
        this.groupName = null;
        this.refreshToken = null;
        this.table = null;
        this.tokenUserDisplayName = null;
        this.tokenUserPrincipalName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerBIOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataset;
        private @Nullable String groupId;
        private @Nullable String groupName;
        private @Nullable String refreshToken;
        private @Nullable String table;
        private @Nullable String tokenUserDisplayName;
        private @Nullable String tokenUserPrincipalName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerBIOutputDataSourceResponse defaults) {
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

        public Builder dataset(@Nullable String dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = table;
            return this;
        }
        public Builder tokenUserDisplayName(@Nullable String tokenUserDisplayName) {
            this.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }
        public Builder tokenUserPrincipalName(@Nullable String tokenUserPrincipalName) {
            this.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public PowerBIOutputDataSourceResponse build() {
            return new PowerBIOutputDataSourceResponse(dataset, groupId, groupName, refreshToken, table, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}
