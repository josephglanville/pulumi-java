// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventSourceMappingDestinationConfigOnFailureGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingDestinationConfigOnFailureGetArgs Empty = new EventSourceMappingDestinationConfigOnFailureGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    public EventSourceMappingDestinationConfigOnFailureGetArgs(Output<String> destinationArn) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
    }

    private EventSourceMappingDestinationConfigOnFailureGetArgs() {
        this.destinationArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfigOnFailureGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfigOnFailureGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }        public EventSourceMappingDestinationConfigOnFailureGetArgs build() {
            return new EventSourceMappingDestinationConfigOnFailureGetArgs(destinationArn);
        }
    }
}
