// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceProviderManifestPropertiesResponseFeaturesRule {
    private final String requiredFeaturesPolicy;

    @OutputCustomType.Constructor({"requiredFeaturesPolicy"})
    private ResourceProviderManifestPropertiesResponseFeaturesRule(String requiredFeaturesPolicy) {
        this.requiredFeaturesPolicy = Objects.requireNonNull(requiredFeaturesPolicy);
    }

    public String getRequiredFeaturesPolicy() {
        return this.requiredFeaturesPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesResponseFeaturesRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requiredFeaturesPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesResponseFeaturesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requiredFeaturesPolicy = defaults.requiredFeaturesPolicy;
        }

        public Builder setRequiredFeaturesPolicy(String requiredFeaturesPolicy) {
            this.requiredFeaturesPolicy = Objects.requireNonNull(requiredFeaturesPolicy);
            return this;
        }

        public ResourceProviderManifestPropertiesResponseFeaturesRule build() {
            return new ResourceProviderManifestPropertiesResponseFeaturesRule(requiredFeaturesPolicy);
        }
    }
}
