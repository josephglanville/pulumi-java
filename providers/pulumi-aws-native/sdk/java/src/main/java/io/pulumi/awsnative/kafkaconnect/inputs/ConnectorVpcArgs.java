// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information about a VPC used with the connector.
 * 
 */
public final class ConnectorVpcArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorVpcArgs Empty = new ConnectorVpcArgs();

    /**
     * The AWS security groups to associate with the elastic network interfaces in order to specify what the connector has access to.
     * 
     */
    @InputImport(name="securityGroups", required=true)
      private final Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * The list of subnets to connect to in the virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets.
     * 
     */
    @InputImport(name="subnets", required=true)
      private final Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets;
    }

    public ConnectorVpcArgs(
        Input<List<String>> securityGroups,
        Input<List<String>> subnets) {
        this.securityGroups = Objects.requireNonNull(securityGroups, "expected parameter 'securityGroups' to be non-null");
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
    }

    private ConnectorVpcArgs() {
        this.securityGroups = Input.empty();
        this.subnets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroups;
        private Input<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorVpcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder setSecurityGroups(Input<List<String>> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Input.of(Objects.requireNonNull(securityGroups));
            return this;
        }

        public Builder setSubnets(Input<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Input.of(Objects.requireNonNull(subnets));
            return this;
        }
        public ConnectorVpcArgs build() {
            return new ConnectorVpcArgs(securityGroups, subnets);
        }
    }
}
