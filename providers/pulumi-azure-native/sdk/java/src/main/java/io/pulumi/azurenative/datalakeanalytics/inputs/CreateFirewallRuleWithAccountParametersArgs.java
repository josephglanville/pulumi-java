// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new firewall rule while creating a new Data Lake Analytics account.
 * 
 */
public final class CreateFirewallRuleWithAccountParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateFirewallRuleWithAccountParametersArgs Empty = new CreateFirewallRuleWithAccountParametersArgs();

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="endIpAddress", required=true)
      private final Output<String> endIpAddress;

    public Output<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The unique name of the firewall rule to create.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="startIpAddress", required=true)
      private final Output<String> startIpAddress;

    public Output<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public CreateFirewallRuleWithAccountParametersArgs(
        Output<String> endIpAddress,
        Output<String> name,
        Output<String> startIpAddress) {
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private CreateFirewallRuleWithAccountParametersArgs() {
        this.endIpAddress = Codegen.empty();
        this.name = Codegen.empty();
        this.startIpAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateFirewallRuleWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endIpAddress;
        private Output<String> name;
        private Output<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateFirewallRuleWithAccountParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(Output<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }
        public Builder endIpAddress(String endIpAddress) {
            this.endIpAddress = Output.of(Objects.requireNonNull(endIpAddress));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder startIpAddress(Output<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }
        public Builder startIpAddress(String startIpAddress) {
            this.startIpAddress = Output.of(Objects.requireNonNull(startIpAddress));
            return this;
        }        public CreateFirewallRuleWithAccountParametersArgs build() {
            return new CreateFirewallRuleWithAccountParametersArgs(endIpAddress, name, startIpAddress);
        }
    }
}
