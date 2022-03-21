// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionEventInvokeConfigDestinationConfigOnSuccess {
    /**
     * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
     * 
     */
    private final String destination;

    @CustomType.Constructor
    private FunctionEventInvokeConfigDestinationConfigOnSuccess(@CustomType.Parameter("destination") String destination) {
        this.destination = destination;
    }

    /**
     * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
     * 
    */
    public String getDestination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfigOnSuccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigOnSuccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }        public FunctionEventInvokeConfigDestinationConfigOnSuccess build() {
            return new FunctionEventInvokeConfigDestinationConfigOnSuccess(destination);
        }
    }
}
