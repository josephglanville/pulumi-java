// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAliasArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAliasArgs Empty = new GetAliasArgs();

    @Import(name="aliasId", required=true)
      private final String aliasId;

    public String getAliasId() {
        return this.aliasId;
    }

    @Import(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @Import(name="keystoreId", required=true)
      private final String keystoreId;

    public String getKeystoreId() {
        return this.keystoreId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetAliasArgs(
        String aliasId,
        String environmentId,
        String keystoreId,
        String organizationId) {
        this.aliasId = Objects.requireNonNull(aliasId, "expected parameter 'aliasId' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.keystoreId = Objects.requireNonNull(keystoreId, "expected parameter 'keystoreId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetAliasArgs() {
        this.aliasId = null;
        this.environmentId = null;
        this.keystoreId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasId;
        private String environmentId;
        private String keystoreId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasId = defaults.aliasId;
    	      this.environmentId = defaults.environmentId;
    	      this.keystoreId = defaults.keystoreId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder aliasId(String aliasId) {
            this.aliasId = Objects.requireNonNull(aliasId);
            return this;
        }
        public Builder environmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }
        public Builder keystoreId(String keystoreId) {
            this.keystoreId = Objects.requireNonNull(keystoreId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetAliasArgs build() {
            return new GetAliasArgs(aliasId, environmentId, keystoreId, organizationId);
        }
    }
}
