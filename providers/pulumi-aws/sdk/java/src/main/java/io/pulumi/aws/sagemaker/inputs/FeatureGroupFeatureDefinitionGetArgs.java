// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupFeatureDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupFeatureDefinitionGetArgs Empty = new FeatureGroupFeatureDefinitionGetArgs();

    /**
     * The name of a feature. `feature_name` cannot be any of the following: `is_deleted`, `write_time`, `api_invocation_time`.
     * 
     */
    @Import(name="featureName")
      private final @Nullable Output<String> featureName;

    public Output<String> getFeatureName() {
        return this.featureName == null ? Output.empty() : this.featureName;
    }

    /**
     * The value type of a feature. Valid values are `Integral`, `Fractional`, or `String`.
     * 
     */
    @Import(name="featureType")
      private final @Nullable Output<String> featureType;

    public Output<String> getFeatureType() {
        return this.featureType == null ? Output.empty() : this.featureType;
    }

    public FeatureGroupFeatureDefinitionGetArgs(
        @Nullable Output<String> featureName,
        @Nullable Output<String> featureType) {
        this.featureName = featureName;
        this.featureType = featureType;
    }

    private FeatureGroupFeatureDefinitionGetArgs() {
        this.featureName = Output.empty();
        this.featureType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupFeatureDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> featureName;
        private @Nullable Output<String> featureType;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupFeatureDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureName = defaults.featureName;
    	      this.featureType = defaults.featureType;
        }

        public Builder featureName(@Nullable Output<String> featureName) {
            this.featureName = featureName;
            return this;
        }
        public Builder featureName(@Nullable String featureName) {
            this.featureName = Output.ofNullable(featureName);
            return this;
        }
        public Builder featureType(@Nullable Output<String> featureType) {
            this.featureType = featureType;
            return this;
        }
        public Builder featureType(@Nullable String featureType) {
            this.featureType = Output.ofNullable(featureType);
            return this;
        }        public FeatureGroupFeatureDefinitionGetArgs build() {
            return new FeatureGroupFeatureDefinitionGetArgs(featureName, featureType);
        }
    }
}