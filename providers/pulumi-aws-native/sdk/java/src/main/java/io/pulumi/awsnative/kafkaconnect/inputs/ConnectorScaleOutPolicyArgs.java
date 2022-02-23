// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Information about the scale out policy of the connector.
 * 
 */
public final class ConnectorScaleOutPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorScaleOutPolicyArgs Empty = new ConnectorScaleOutPolicyArgs();

    /**
     * Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
     * 
     */
    @InputImport(name="cpuUtilizationPercentage", required=true)
      private final Input<Integer> cpuUtilizationPercentage;

    public Input<Integer> getCpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    public ConnectorScaleOutPolicyArgs(Input<Integer> cpuUtilizationPercentage) {
        this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage, "expected parameter 'cpuUtilizationPercentage' to be non-null");
    }

    private ConnectorScaleOutPolicyArgs() {
        this.cpuUtilizationPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorScaleOutPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> cpuUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorScaleOutPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuUtilizationPercentage = defaults.cpuUtilizationPercentage;
        }

        public Builder setCpuUtilizationPercentage(Input<Integer> cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
            return this;
        }

        public Builder setCpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = Input.of(Objects.requireNonNull(cpuUtilizationPercentage));
            return this;
        }
        public ConnectorScaleOutPolicyArgs build() {
            return new ConnectorScaleOutPolicyArgs(cpuUtilizationPercentage);
        }
    }
}
