// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetWorkloadIdentityPoolProviderOidc extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolProviderOidc Empty = new GetWorkloadIdentityPoolProviderOidc();

    @InputImport(name="allowedAudiences", required=true)
    private final List<String> allowedAudiences;

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    @InputImport(name="issuerUri", required=true)
    private final String issuerUri;

    public String getIssuerUri() {
        return this.issuerUri;
    }

    public GetWorkloadIdentityPoolProviderOidc(
        List<String> allowedAudiences,
        String issuerUri) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
        this.issuerUri = Objects.requireNonNull(issuerUri, "expected parameter 'issuerUri' to be non-null");
    }

    private GetWorkloadIdentityPoolProviderOidc() {
        this.allowedAudiences = List.of();
        this.issuerUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;
        private String issuerUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolProviderOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
        }

        public Builder setAllowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }

        public Builder setIssuerUri(String issuerUri) {
            this.issuerUri = Objects.requireNonNull(issuerUri);
            return this;
        }

        public GetWorkloadIdentityPoolProviderOidc build() {
            return new GetWorkloadIdentityPoolProviderOidc(allowedAudiences, issuerUri);
        }
    }
}