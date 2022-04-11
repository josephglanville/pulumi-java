// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fms.inputs;

import io.pulumi.awsnative.fms.enums.PolicySecurityServicePolicyDataPropertiesType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityServicePolicyDataPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityServicePolicyDataPropertiesArgs Empty = new SecurityServicePolicyDataPropertiesArgs();

    @Import(name="managedServiceData")
      private final @Nullable Output<String> managedServiceData;

    public Output<String> getManagedServiceData() {
        return this.managedServiceData == null ? Codegen.empty() : this.managedServiceData;
    }

    @Import(name="type", required=true)
      private final Output<PolicySecurityServicePolicyDataPropertiesType> type;

    public Output<PolicySecurityServicePolicyDataPropertiesType> getType() {
        return this.type;
    }

    public SecurityServicePolicyDataPropertiesArgs(
        @Nullable Output<String> managedServiceData,
        Output<PolicySecurityServicePolicyDataPropertiesType> type) {
        this.managedServiceData = managedServiceData;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecurityServicePolicyDataPropertiesArgs() {
        this.managedServiceData = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityServicePolicyDataPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> managedServiceData;
        private Output<PolicySecurityServicePolicyDataPropertiesType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityServicePolicyDataPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedServiceData = defaults.managedServiceData;
    	      this.type = defaults.type;
        }

        public Builder managedServiceData(@Nullable Output<String> managedServiceData) {
            this.managedServiceData = managedServiceData;
            return this;
        }
        public Builder managedServiceData(@Nullable String managedServiceData) {
            this.managedServiceData = Codegen.ofNullable(managedServiceData);
            return this;
        }
        public Builder type(Output<PolicySecurityServicePolicyDataPropertiesType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(PolicySecurityServicePolicyDataPropertiesType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SecurityServicePolicyDataPropertiesArgs build() {
            return new SecurityServicePolicyDataPropertiesArgs(managedServiceData, type);
        }
    }
}
