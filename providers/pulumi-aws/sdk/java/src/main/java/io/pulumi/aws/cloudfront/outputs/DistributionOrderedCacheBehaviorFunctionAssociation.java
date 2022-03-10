// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionOrderedCacheBehaviorFunctionAssociation {
    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    private final String eventType;
    /**
     * ARN of the Cloudfront function.
     * 
     */
    private final String functionArn;

    @OutputCustomType.Constructor
    private DistributionOrderedCacheBehaviorFunctionAssociation(
        @OutputCustomType.Parameter("eventType") String eventType,
        @OutputCustomType.Parameter("functionArn") String functionArn) {
        this.eventType = eventType;
        this.functionArn = functionArn;
    }

    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
    */
    public String getEventType() {
        return this.eventType;
    }
    /**
     * ARN of the Cloudfront function.
     * 
    */
    public String getFunctionArn() {
        return this.functionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorFunctionAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventType;
        private String functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorFunctionAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionArn = defaults.functionArn;
        }

        public Builder setEventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setFunctionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public DistributionOrderedCacheBehaviorFunctionAssociation build() {
            return new DistributionOrderedCacheBehaviorFunctionAssociation(eventType, functionArn);
        }
    }
}
