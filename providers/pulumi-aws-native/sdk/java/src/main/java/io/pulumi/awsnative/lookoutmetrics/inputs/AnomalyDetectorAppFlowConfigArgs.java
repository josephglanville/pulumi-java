// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AnomalyDetectorAppFlowConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorAppFlowConfigArgs Empty = new AnomalyDetectorAppFlowConfigArgs();

    @Import(name="flowName", required=true)
      private final Output<String> flowName;

    public Output<String> getFlowName() {
        return this.flowName;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public AnomalyDetectorAppFlowConfigArgs(
        Output<String> flowName,
        Output<String> roleArn) {
        this.flowName = Objects.requireNonNull(flowName, "expected parameter 'flowName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnomalyDetectorAppFlowConfigArgs() {
        this.flowName = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorAppFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> flowName;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorAppFlowConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowName = defaults.flowName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder flowName(Output<String> flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }
        public Builder flowName(String flowName) {
            this.flowName = Output.of(Objects.requireNonNull(flowName));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public AnomalyDetectorAppFlowConfigArgs build() {
            return new AnomalyDetectorAppFlowConfigArgs(flowName, roleArn);
        }
    }
}
