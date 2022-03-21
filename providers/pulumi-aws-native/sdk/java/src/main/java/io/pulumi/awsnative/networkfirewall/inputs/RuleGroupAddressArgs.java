// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupAddressArgs Empty = new RuleGroupAddressArgs();

    @Import(name="addressDefinition", required=true)
      private final Output<String> addressDefinition;

    public Output<String> getAddressDefinition() {
        return this.addressDefinition;
    }

    public RuleGroupAddressArgs(Output<String> addressDefinition) {
        this.addressDefinition = Objects.requireNonNull(addressDefinition, "expected parameter 'addressDefinition' to be non-null");
    }

    private RuleGroupAddressArgs() {
        this.addressDefinition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> addressDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDefinition = defaults.addressDefinition;
        }

        public Builder addressDefinition(Output<String> addressDefinition) {
            this.addressDefinition = Objects.requireNonNull(addressDefinition);
            return this;
        }
        public Builder addressDefinition(String addressDefinition) {
            this.addressDefinition = Output.of(Objects.requireNonNull(addressDefinition));
            return this;
        }        public RuleGroupAddressArgs build() {
            return new RuleGroupAddressArgs(addressDefinition);
        }
    }
}
