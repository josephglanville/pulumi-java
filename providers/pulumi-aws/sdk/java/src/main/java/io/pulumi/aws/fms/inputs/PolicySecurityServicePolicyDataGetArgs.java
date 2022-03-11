// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySecurityServicePolicyDataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySecurityServicePolicyDataGetArgs Empty = new PolicySecurityServicePolicyDataGetArgs();

    /**
     * Details about the service that are specific to the service type, in JSON format. For service type `SHIELD_ADVANCED`, this is an empty string. Examples depending on `type` can be found in the [AWS Firewall Manager SecurityServicePolicyData API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html).
     * 
     */
    @InputImport(name="managedServiceData")
      private final @Nullable Output<String> managedServiceData;

    public Output<String> getManagedServiceData() {
        return this.managedServiceData == null ? Output.empty() : this.managedServiceData;
    }

    /**
     * The service that the policy is using to protect the resources. For the current list of supported types, please refer to the [AWS Firewall Manager SecurityServicePolicyData API Type Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html#fms-Type-SecurityServicePolicyData-Type).
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PolicySecurityServicePolicyDataGetArgs(
        @Nullable Output<String> managedServiceData,
        Output<String> type) {
        this.managedServiceData = managedServiceData;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PolicySecurityServicePolicyDataGetArgs() {
        this.managedServiceData = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySecurityServicePolicyDataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> managedServiceData;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySecurityServicePolicyDataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedServiceData = defaults.managedServiceData;
    	      this.type = defaults.type;
        }

        public Builder managedServiceData(@Nullable Output<String> managedServiceData) {
            this.managedServiceData = managedServiceData;
            return this;
        }

        public Builder managedServiceData(@Nullable String managedServiceData) {
            this.managedServiceData = Output.ofNullable(managedServiceData);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public PolicySecurityServicePolicyDataGetArgs build() {
            return new PolicySecurityServicePolicyDataGetArgs(managedServiceData, type);
        }
    }
}
