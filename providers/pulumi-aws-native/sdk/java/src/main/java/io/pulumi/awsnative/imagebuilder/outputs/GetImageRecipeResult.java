// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.ImageRecipeAdditionalInstanceConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageRecipeResult {
    /**
     * Specify additional settings and launch scripts for your build instances.
     * 
     */
    private final @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration;
    /**
     * The Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    private final @Nullable String arn;

    @CustomType.Constructor
    private GetImageRecipeResult(
        @CustomType.Parameter("additionalInstanceConfiguration") @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration,
        @CustomType.Parameter("arn") @Nullable String arn) {
        this.additionalInstanceConfiguration = additionalInstanceConfiguration;
        this.arn = arn;
    }

    /**
     * Specify additional settings and launch scripts for your build instances.
     * 
    */
    public Optional<ImageRecipeAdditionalInstanceConfiguration> getAdditionalInstanceConfiguration() {
        return Optional.ofNullable(this.additionalInstanceConfiguration);
    }
    /**
     * The Amazon Resource Name (ARN) of the image recipe.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration;
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInstanceConfiguration = defaults.additionalInstanceConfiguration;
    	      this.arn = defaults.arn;
        }

        public Builder additionalInstanceConfiguration(@Nullable ImageRecipeAdditionalInstanceConfiguration additionalInstanceConfiguration) {
            this.additionalInstanceConfiguration = additionalInstanceConfiguration;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }        public GetImageRecipeResult build() {
            return new GetImageRecipeResult(additionalInstanceConfiguration, arn);
        }
    }
}
