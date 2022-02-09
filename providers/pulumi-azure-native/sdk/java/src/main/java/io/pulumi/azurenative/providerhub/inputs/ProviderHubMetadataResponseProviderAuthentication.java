// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ProviderHubMetadataResponseProviderAuthentication extends io.pulumi.resources.InvokeArgs {

    public static final ProviderHubMetadataResponseProviderAuthentication Empty = new ProviderHubMetadataResponseProviderAuthentication();

    @InputImport(name="allowedAudiences", required=true)
    private final List<String> allowedAudiences;

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    public ProviderHubMetadataResponseProviderAuthentication(List<String> allowedAudiences) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
    }

    private ProviderHubMetadataResponseProviderAuthentication() {
        this.allowedAudiences = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderHubMetadataResponseProviderAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderHubMetadataResponseProviderAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder setAllowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }

        public ProviderHubMetadataResponseProviderAuthentication build() {
            return new ProviderHubMetadataResponseProviderAuthentication(allowedAudiences);
        }
    }
}
