// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MapConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MapConfigurationArgs Empty = new MapConfigurationArgs();

    @Import(name="style", required=true)
      private final Output<String> style;

    public Output<String> getStyle() {
        return this.style;
    }

    public MapConfigurationArgs(Output<String> style) {
        this.style = Objects.requireNonNull(style, "expected parameter 'style' to be non-null");
    }

    private MapConfigurationArgs() {
        this.style = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> style;

        public Builder() {
    	      // Empty
        }

        public Builder(MapConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.style = defaults.style;
        }

        public Builder style(Output<String> style) {
            this.style = Objects.requireNonNull(style);
            return this;
        }
        public Builder style(String style) {
            this.style = Output.of(Objects.requireNonNull(style));
            return this;
        }        public MapConfigurationArgs build() {
            return new MapConfigurationArgs(style);
        }
    }
}
