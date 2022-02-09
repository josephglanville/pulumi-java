// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureDataLakeStoreOutputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeStoreOutputDataSourceResponse Empty = new AzureDataLakeStoreOutputDataSourceResponse();

    @InputImport(name="accountName")
    private final @Nullable String accountName;

    public Optional<String> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    @InputImport(name="dateFormat")
    private final @Nullable String dateFormat;

    public Optional<String> getDateFormat() {
        return this.dateFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFormat);
    }

    @InputImport(name="filePathPrefix")
    private final @Nullable String filePathPrefix;

    public Optional<String> getFilePathPrefix() {
        return this.filePathPrefix == null ? Optional.empty() : Optional.ofNullable(this.filePathPrefix);
    }

    @InputImport(name="refreshToken")
    private final @Nullable String refreshToken;

    public Optional<String> getRefreshToken() {
        return this.refreshToken == null ? Optional.empty() : Optional.ofNullable(this.refreshToken);
    }

    @InputImport(name="tenantId")
    private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    @InputImport(name="timeFormat")
    private final @Nullable String timeFormat;

    public Optional<String> getTimeFormat() {
        return this.timeFormat == null ? Optional.empty() : Optional.ofNullable(this.timeFormat);
    }

    @InputImport(name="tokenUserDisplayName")
    private final @Nullable String tokenUserDisplayName;

    public Optional<String> getTokenUserDisplayName() {
        return this.tokenUserDisplayName == null ? Optional.empty() : Optional.ofNullable(this.tokenUserDisplayName);
    }

    @InputImport(name="tokenUserPrincipalName")
    private final @Nullable String tokenUserPrincipalName;

    public Optional<String> getTokenUserPrincipalName() {
        return this.tokenUserPrincipalName == null ? Optional.empty() : Optional.ofNullable(this.tokenUserPrincipalName);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AzureDataLakeStoreOutputDataSourceResponse(
        @Nullable String accountName,
        @Nullable String dateFormat,
        @Nullable String filePathPrefix,
        @Nullable String refreshToken,
        @Nullable String tenantId,
        @Nullable String timeFormat,
        @Nullable String tokenUserDisplayName,
        @Nullable String tokenUserPrincipalName,
        String type) {
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

    private AzureDataLakeStoreOutputDataSourceResponse() {
        this.accountName = null;
        this.dateFormat = null;
        this.filePathPrefix = null;
        this.refreshToken = null;
        this.tenantId = null;
        this.timeFormat = null;
        this.tokenUserDisplayName = null;
        this.tokenUserPrincipalName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountName;
        private @Nullable String dateFormat;
        private @Nullable String filePathPrefix;
        private @Nullable String refreshToken;
        private @Nullable String tenantId;
        private @Nullable String timeFormat;
        private @Nullable String tokenUserDisplayName;
        private @Nullable String tokenUserPrincipalName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreOutputDataSourceResponse defaults) {
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

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setDateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setFilePathPrefix(@Nullable String filePathPrefix) {
            this.filePathPrefix = filePathPrefix;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTimeFormat(@Nullable String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        public Builder setTokenUserDisplayName(@Nullable String tokenUserDisplayName) {
            this.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }

        public Builder setTokenUserPrincipalName(@Nullable String tokenUserPrincipalName) {
            this.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureDataLakeStoreOutputDataSourceResponse build() {
            return new AzureDataLakeStoreOutputDataSourceResponse(accountName, dateFormat, filePathPrefix, refreshToken, tenantId, timeFormat, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}
