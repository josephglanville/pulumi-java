// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowSlackSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSlackSourcePropertiesArgs Empty = new FlowSlackSourcePropertiesArgs();

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public FlowSlackSourcePropertiesArgs(Output<String> object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowSlackSourcePropertiesArgs() {
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSlackSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSlackSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public FlowSlackSourcePropertiesArgs build() {
            return new FlowSlackSourcePropertiesArgs(object);
        }
    }
}
