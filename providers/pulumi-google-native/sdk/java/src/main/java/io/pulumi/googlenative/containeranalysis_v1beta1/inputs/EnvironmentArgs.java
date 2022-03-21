// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines an object for the environment field in in-toto links. The suggested fields are "variables", "filesystem", and "workdir".
 * 
 */
public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="customValues")
      private final @Nullable Output<Map<String,String>> customValues;

    public Output<Map<String,String>> getCustomValues() {
        return this.customValues == null ? Output.empty() : this.customValues;
    }

    public EnvironmentArgs(@Nullable Output<Map<String,String>> customValues) {
        this.customValues = customValues;
    }

    private EnvironmentArgs() {
        this.customValues = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> customValues;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customValues = defaults.customValues;
        }

        public Builder customValues(@Nullable Output<Map<String,String>> customValues) {
            this.customValues = customValues;
            return this;
        }
        public Builder customValues(@Nullable Map<String,String> customValues) {
            this.customValues = Output.ofNullable(customValues);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(customValues);
        }
    }
}
