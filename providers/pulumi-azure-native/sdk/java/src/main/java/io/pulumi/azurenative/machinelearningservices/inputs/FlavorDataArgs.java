// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlavorDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlavorDataArgs Empty = new FlavorDataArgs();

    /**
     * Model flavor-specific data.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<Map<String,String>> data;

    public Output<Map<String,String>> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    public FlavorDataArgs(@Nullable Output<Map<String,String>> data) {
        this.data = data;
    }

    private FlavorDataArgs() {
        this.data = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlavorDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> data;

        public Builder() {
    	      // Empty
        }

        public Builder(FlavorDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder data(@Nullable Output<Map<String,String>> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable Map<String,String> data) {
            this.data = Output.ofNullable(data);
            return this;
        }        public FlavorDataArgs build() {
            return new FlavorDataArgs(data);
        }
    }
}
