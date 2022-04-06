// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionOrderedCacheBehaviorFunctionAssociationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorFunctionAssociationGetArgs Empty = new DistributionOrderedCacheBehaviorFunctionAssociationGetArgs();

    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    @Import(name="eventType", required=true)
      private final Output<String> eventType;

    public Output<String> getEventType() {
        return this.eventType;
    }

    /**
     * ARN of the Cloudfront function.
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> getFunctionArn() {
        return this.functionArn;
    }

    public DistributionOrderedCacheBehaviorFunctionAssociationGetArgs(
        Output<String> eventType,
        Output<String> functionArn) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
    }

    private DistributionOrderedCacheBehaviorFunctionAssociationGetArgs() {
        this.eventType = Output.empty();
        this.functionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorFunctionAssociationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> eventType;
        private Output<String> functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorFunctionAssociationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionArn = defaults.functionArn;
        }

        public Builder eventType(Output<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder eventType(String eventType) {
            this.eventType = Output.of(Objects.requireNonNull(eventType));
            return this;
        }
        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }        public DistributionOrderedCacheBehaviorFunctionAssociationGetArgs build() {
            return new DistributionOrderedCacheBehaviorFunctionAssociationGetArgs(eventType, functionArn);
        }
    }
}