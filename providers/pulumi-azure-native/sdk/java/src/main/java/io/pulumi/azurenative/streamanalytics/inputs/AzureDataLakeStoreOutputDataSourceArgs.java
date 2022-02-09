// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureDataLakeStoreOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeStoreOutputDataSourceArgs Empty = new AzureDataLakeStoreOutputDataSourceArgs();

    @InputImport(name="accountName")
    private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    @InputImport(name="dateFormat")
    private final @Nullable Input<String> dateFormat;

    public Input<String> getDateFormat() {
        return this.dateFormat == null ? Input.empty() : this.dateFormat;
    }

    @InputImport(name="filePathPrefix")
    private final @Nullable Input<String> filePathPrefix;

    public Input<String> getFilePathPrefix() {
        return this.filePathPrefix == null ? Input.empty() : this.filePathPrefix;
    }

    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    @InputImport(name="timeFormat")
    private final @Nullable Input<String> timeFormat;

    public Input<String> getTimeFormat() {
        return this.timeFormat == null ? Input.empty() : this.timeFormat;
    }

    @InputImport(name="tokenUserDisplayName")
    private final @Nullable Input<String> tokenUserDisplayName;

    public Input<String> getTokenUserDisplayName() {
        return this.tokenUserDisplayName == null ? Input.empty() : this.tokenUserDisplayName;
    }

    @InputImport(name="tokenUserPrincipalName")
    private final @Nullable Input<String> tokenUserPrincipalName;

    public Input<String> getTokenUserPrincipalName() {
        return this.tokenUserPrincipalName == null ? Input.empty() : this.tokenUserPrincipalName;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureDataLakeStoreOutputDataSourceArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<String> dateFormat,
        @Nullable Input<String> filePathPrefix,
        @Nullable Input<String> refreshToken,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> timeFormat,
        @Nullable Input<String> tokenUserDisplayName,
        @Nullable Input<String> tokenUserPrincipalName,
        Input<String> type) {
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
        this.accountName = Input.empty();
        this.dateFormat = Input.empty();
        this.filePathPrefix = Input.empty();
        this.refreshToken = Input.empty();
        this.tenantId = Input.empty();
        this.timeFormat = Input.empty();
        this.tokenUserDisplayName = Input.empty();
        this.tokenUserPrincipalName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<String> dateFormat;
        private @Nullable Input<String> filePathPrefix;
        private @Nullable Input<String> refreshToken;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> timeFormat;
        private @Nullable Input<String> tokenUserDisplayName;
        private @Nullable Input<String> tokenUserPrincipalName;
        private Input<String> type;

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

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder setDateFormat(@Nullable Input<String> dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setDateFormat(@Nullable String dateFormat) {
            this.dateFormat = Input.ofNullable(dateFormat);
            return this;
        }

        public Builder setFilePathPrefix(@Nullable Input<String> filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            return this;
        }

        public Builder setFilePathPrefix(@Nullable String filePathPrefix) {
            this.filePathPrefix = Input.ofNullable(filePathPrefix);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder setTimeFormat(@Nullable Input<String> timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        public Builder setTimeFormat(@Nullable String timeFormat) {
            this.timeFormat = Input.ofNullable(timeFormat);
            return this;
        }

        public Builder setTokenUserDisplayName(@Nullable Input<String> tokenUserDisplayName) {
            this.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }

        public Builder setTokenUserDisplayName(@Nullable String tokenUserDisplayName) {
            this.tokenUserDisplayName = Input.ofNullable(tokenUserDisplayName);
            return this;
        }

        public Builder setTokenUserPrincipalName(@Nullable Input<String> tokenUserPrincipalName) {
            this.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }

        public Builder setTokenUserPrincipalName(@Nullable String tokenUserPrincipalName) {
            this.tokenUserPrincipalName = Input.ofNullable(tokenUserPrincipalName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AzureDataLakeStoreOutputDataSourceArgs build() {
            return new AzureDataLakeStoreOutputDataSourceArgs(accountName, dateFormat, filePathPrefix, refreshToken, tenantId, timeFormat, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}
