// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.NsgSecurityRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the NSG resource settings.
 * 
 */
public final class NetworkSecurityGroupResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityGroupResourceSettingsArgs Empty = new NetworkSecurityGroupResourceSettingsArgs();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/networkSecurityGroups'.
     * 
     */
    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets Security rules of network security group.
     * 
     */
    @Import(name="securityRules")
      private final @Nullable Output<List<NsgSecurityRuleArgs>> securityRules;

    public Output<List<NsgSecurityRuleArgs>> getSecurityRules() {
        return this.securityRules == null ? Output.empty() : this.securityRules;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
      private final Output<String> targetResourceName;

    public Output<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    public NetworkSecurityGroupResourceSettingsArgs(
        Output<String> resourceType,
        @Nullable Output<List<NsgSecurityRuleArgs>> securityRules,
        Output<String> targetResourceName) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.securityRules = securityRules;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
    }

    private NetworkSecurityGroupResourceSettingsArgs() {
        this.resourceType = Output.empty();
        this.securityRules = Output.empty();
        this.targetResourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceType;
        private @Nullable Output<List<NsgSecurityRuleArgs>> securityRules;
        private Output<String> targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.securityRules = defaults.securityRules;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }
        public Builder securityRules(@Nullable Output<List<NsgSecurityRuleArgs>> securityRules) {
            this.securityRules = securityRules;
            return this;
        }
        public Builder securityRules(@Nullable List<NsgSecurityRuleArgs> securityRules) {
            this.securityRules = Output.ofNullable(securityRules);
            return this;
        }
        public Builder securityRules(NsgSecurityRuleArgs... securityRules) {
            return securityRules(List.of(securityRules));
        }
        public Builder targetResourceName(Output<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Output.of(Objects.requireNonNull(targetResourceName));
            return this;
        }        public NetworkSecurityGroupResourceSettingsArgs build() {
            return new NetworkSecurityGroupResourceSettingsArgs(resourceType, securityRules, targetResourceName);
        }
    }
}
