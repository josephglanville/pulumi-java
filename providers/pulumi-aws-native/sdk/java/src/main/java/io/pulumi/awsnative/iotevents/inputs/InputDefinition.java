// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.InputAttribute;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * The definition of the input.
 * 
 */
public final class InputDefinition extends io.pulumi.resources.InvokeArgs {

    public static final InputDefinition Empty = new InputDefinition();

    /**
     * The attributes from the JSON payload that are made available by the input. Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage`. Each such message contains a JSON payload, and those attributes (and their paired values) specified here are available for use in the `condition` expressions used by detectors that monitor this input.
     * 
     */
    @Import(name="attributes", required=true)
      private final List<InputAttribute> attributes;

    public List<InputAttribute> getAttributes() {
        return this.attributes;
    }

    public InputDefinition(List<InputAttribute> attributes) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
    }

    private InputDefinition() {
        this.attributes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InputAttribute> attributes;

        public Builder() {
    	      // Empty
        }

        public Builder(InputDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
        }

        public Builder attributes(List<InputAttribute> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(InputAttribute... attributes) {
            return attributes(List.of(attributes));
        }        public InputDefinition build() {
            return new InputDefinition(attributes);
        }
    }
}
