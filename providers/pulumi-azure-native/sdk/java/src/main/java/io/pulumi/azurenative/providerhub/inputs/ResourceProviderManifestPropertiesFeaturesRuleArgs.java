// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.FeaturesPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourceProviderManifestPropertiesFeaturesRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderManifestPropertiesFeaturesRuleArgs Empty = new ResourceProviderManifestPropertiesFeaturesRuleArgs();

    @InputImport(name="requiredFeaturesPolicy", required=true)
      private final Input<Either<String,FeaturesPolicy>> requiredFeaturesPolicy;

    public Input<Either<String,FeaturesPolicy>> getRequiredFeaturesPolicy() {
        return this.requiredFeaturesPolicy;
    }

    public ResourceProviderManifestPropertiesFeaturesRuleArgs(Input<Either<String,FeaturesPolicy>> requiredFeaturesPolicy) {
        this.requiredFeaturesPolicy = Objects.requireNonNull(requiredFeaturesPolicy, "expected parameter 'requiredFeaturesPolicy' to be non-null");
    }

    private ResourceProviderManifestPropertiesFeaturesRuleArgs() {
        this.requiredFeaturesPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesFeaturesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,FeaturesPolicy>> requiredFeaturesPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesFeaturesRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requiredFeaturesPolicy = defaults.requiredFeaturesPolicy;
        }

        public Builder setRequiredFeaturesPolicy(Input<Either<String,FeaturesPolicy>> requiredFeaturesPolicy) {
            this.requiredFeaturesPolicy = Objects.requireNonNull(requiredFeaturesPolicy);
            return this;
        }

        public Builder setRequiredFeaturesPolicy(Either<String,FeaturesPolicy> requiredFeaturesPolicy) {
            this.requiredFeaturesPolicy = Input.of(Objects.requireNonNull(requiredFeaturesPolicy));
            return this;
        }
        public ResourceProviderManifestPropertiesFeaturesRuleArgs build() {
            return new ResourceProviderManifestPropertiesFeaturesRuleArgs(requiredFeaturesPolicy);
        }
    }
}
