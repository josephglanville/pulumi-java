// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Azure Data Lake Store output data source.
 * 
 */
public final class AzureDataLakeStoreOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreOutputDataSourceArgs Empty = new AzureDataLakeStoreOutputDataSourceArgs();

    /**
     * The name of the Azure Data Lake Store account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName == null ? Output.empty() : this.accountName;
    }

    /**
     * The date format. Wherever {date} appears in filePathPrefix, the value of this property is used as the date format instead.
     * 
     */
    @Import(name="dateFormat")
      private final @Nullable Output<String> dateFormat;

    public Output<String> getDateFormat() {
        return this.dateFormat == null ? Output.empty() : this.dateFormat;
    }

    /**
     * The location of the file to which the output should be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="filePathPrefix")
      private final @Nullable Output<String> filePathPrefix;

    public Output<String> getFilePathPrefix() {
        return this.filePathPrefix == null ? Output.empty() : this.filePathPrefix;
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
     * The tenant id of the user used to obtain the refresh token. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * The time format. Wherever {time} appears in filePathPrefix, the value of this property is used as the time format instead.
     * 
     */
    @Import(name="timeFormat")
      private final @Nullable Output<String> timeFormat;

    public Output<String> getTimeFormat() {
        return this.timeFormat == null ? Output.empty() : this.timeFormat;
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
     * Expected value is 'Microsoft.DataLake/Accounts'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AzureDataLakeStoreOutputDataSourceArgs(
        @Nullable Output<String> accountName,
        @Nullable Output<String> dateFormat,
        @Nullable Output<String> filePathPrefix,
        @Nullable Output<String> refreshToken,
        @Nullable Output<String> tenantId,
        @Nullable Output<String> timeFormat,
        @Nullable Output<String> tokenUserDisplayName,
        @Nullable Output<String> tokenUserPrincipalName,
        Output<String> type) {
        this.accountName = accountName;
        this.dateFormat = dateFormat;
        this.filePathPrefix = filePathPrefix;
        this.refreshToken = refreshToken;
        this.tenantId = tenantId;
        this.timeFormat = timeFormat;
        this.tokenUserDisplayName = tokenUserDisplayName;
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataLakeStoreOutputDataSourceArgs() {
        this.accountName = Output.empty();
        this.dateFormat = Output.empty();
        this.filePathPrefix = Output.empty();
        this.refreshToken = Output.empty();
        this.tenantId = Output.empty();
        this.timeFormat = Output.empty();
        this.tokenUserDisplayName = Output.empty();
        this.tokenUserPrincipalName = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountName;
        private @Nullable Output<String> dateFormat;
        private @Nullable Output<String> filePathPrefix;
        private @Nullable Output<String> refreshToken;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<String> timeFormat;
        private @Nullable Output<String> tokenUserDisplayName;
        private @Nullable Output<String> tokenUserPrincipalName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dateFormat = defaults.dateFormat;
    	      this.filePathPrefix = defaults.filePathPrefix;
    	      this.refreshToken = defaults.refreshToken;
    	      this.tenantId = defaults.tenantId;
    	      this.timeFormat = defaults.timeFormat;
    	      this.tokenUserDisplayName = defaults.tokenUserDisplayName;
    	      this.tokenUserPrincipalName = defaults.tokenUserPrincipalName;
    	      this.type = defaults.type;
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Output.ofNullable(accountName);
            return this;
        }
        public Builder dateFormat(@Nullable Output<String> dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public Builder dateFormat(@Nullable String dateFormat) {
            this.dateFormat = Output.ofNullable(dateFormat);
            return this;
        }
        public Builder filePathPrefix(@Nullable Output<String> filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            return this;
        }
        public Builder filePathPrefix(@Nullable String filePathPrefix) {
            this.filePathPrefix = Output.ofNullable(filePathPrefix);
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
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }
        public Builder timeFormat(@Nullable Output<String> timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public Builder timeFormat(@Nullable String timeFormat) {
            this.timeFormat = Output.ofNullable(timeFormat);
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
        }        public AzureDataLakeStoreOutputDataSourceArgs build() {
            return new AzureDataLakeStoreOutputDataSourceArgs(accountName, dateFormat, filePathPrefix, refreshToken, tenantId, timeFormat, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}
