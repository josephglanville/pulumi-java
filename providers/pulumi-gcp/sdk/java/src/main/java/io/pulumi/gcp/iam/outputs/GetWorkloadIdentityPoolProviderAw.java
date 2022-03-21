// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWorkloadIdentityPoolProviderAw {
    private final String accountId;

    @CustomType.Constructor
    private GetWorkloadIdentityPoolProviderAw(@CustomType.Parameter("accountId") String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderAw defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolProviderAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }        public GetWorkloadIdentityPoolProviderAw build() {
            return new GetWorkloadIdentityPoolProviderAw(accountId);
        }
    }
}
