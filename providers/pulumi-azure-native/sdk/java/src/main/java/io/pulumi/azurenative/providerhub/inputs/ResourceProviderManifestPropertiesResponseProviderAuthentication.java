// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResourceProviderManifestPropertiesResponseProviderAuthentication extends io.pulumi.resources.InvokeArgs {

    public static final ResourceProviderManifestPropertiesResponseProviderAuthentication Empty = new ResourceProviderManifestPropertiesResponseProviderAuthentication();

    @Import(name="allowedAudiences", required=true)
      private final List<String> allowedAudiences;

    public List<String> getAllowedAudiences() {
        return this.allowedAudiences;
    }

    public ResourceProviderManifestPropertiesResponseProviderAuthentication(List<String> allowedAudiences) {
        this.allowedAudiences = Objects.requireNonNull(allowedAudiences, "expected parameter 'allowedAudiences' to be non-null");
    }

    private ResourceProviderManifestPropertiesResponseProviderAuthentication() {
        this.allowedAudiences = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedAudiences;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesResponseProviderAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
        }

        public Builder allowedAudiences(List<String> allowedAudiences) {
            this.allowedAudiences = Objects.requireNonNull(allowedAudiences);
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }        public ResourceProviderManifestPropertiesResponseProviderAuthentication build() {
            return new ResourceProviderManifestPropertiesResponseProviderAuthentication(allowedAudiences);
        }
    }
}
