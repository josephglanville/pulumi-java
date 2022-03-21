// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowArgs Empty = new GetFlowArgs();

    /**
     * Name of the flow.
     * 
     */
    @Import(name="flowName", required=true)
      private final String flowName;

    public String getFlowName() {
        return this.flowName;
    }

    public GetFlowArgs(String flowName) {
        this.flowName = Objects.requireNonNull(flowName, "expected parameter 'flowName' to be non-null");
    }

    private GetFlowArgs() {
        this.flowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowName = defaults.flowName;
        }

        public Builder flowName(String flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }        public GetFlowArgs build() {
            return new GetFlowArgs(flowName);
        }
    }
}
