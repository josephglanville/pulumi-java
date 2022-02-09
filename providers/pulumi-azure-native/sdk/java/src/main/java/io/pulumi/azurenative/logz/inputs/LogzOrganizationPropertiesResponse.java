// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogzOrganizationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogzOrganizationPropertiesResponse Empty = new LogzOrganizationPropertiesResponse();

    @InputImport(name="companyName")
    private final @Nullable String companyName;

    public Optional<String> getCompanyName() {
        return this.companyName == null ? Optional.empty() : Optional.ofNullable(this.companyName);
    }

    @InputImport(name="enterpriseAppId")
    private final @Nullable String enterpriseAppId;

    public Optional<String> getEnterpriseAppId() {
        return this.enterpriseAppId == null ? Optional.empty() : Optional.ofNullable(this.enterpriseAppId);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="singleSignOnUrl")
    private final @Nullable String singleSignOnUrl;

    public Optional<String> getSingleSignOnUrl() {
        return this.singleSignOnUrl == null ? Optional.empty() : Optional.ofNullable(this.singleSignOnUrl);
    }

    public LogzOrganizationPropertiesResponse(
        @Nullable String companyName,
        @Nullable String enterpriseAppId,
        String id,
        @Nullable String singleSignOnUrl) {
        this.companyName = companyName;
        this.enterpriseAppId = enterpriseAppId;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.singleSignOnUrl = singleSignOnUrl;
    }

    private LogzOrganizationPropertiesResponse() {
        this.companyName = null;
        this.enterpriseAppId = null;
        this.id = null;
        this.singleSignOnUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogzOrganizationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String companyName;
        private @Nullable String enterpriseAppId;
        private String id;
        private @Nullable String singleSignOnUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LogzOrganizationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.companyName = defaults.companyName;
    	      this.enterpriseAppId = defaults.enterpriseAppId;
    	      this.id = defaults.id;
    	      this.singleSignOnUrl = defaults.singleSignOnUrl;
        }

        public Builder setCompanyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setEnterpriseAppId(@Nullable String enterpriseAppId) {
            this.enterpriseAppId = enterpriseAppId;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setSingleSignOnUrl(@Nullable String singleSignOnUrl) {
            this.singleSignOnUrl = singleSignOnUrl;
            return this;
        }

        public LogzOrganizationPropertiesResponse build() {
            return new LogzOrganizationPropertiesResponse(companyName, enterpriseAppId, id, singleSignOnUrl);
        }
    }
}
