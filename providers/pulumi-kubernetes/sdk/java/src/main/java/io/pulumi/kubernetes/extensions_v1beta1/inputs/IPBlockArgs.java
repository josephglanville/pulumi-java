// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DEPRECATED 1.9 - This group version of IPBlock is deprecated by networking/v1/IPBlock. IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
 * 
 */
public final class IPBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPBlockArgs Empty = new IPBlockArgs();

    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24"
     * 
     */
    @InputImport(name="cidr", required=true)
      private final Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr;
    }

    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range
     * 
     */
    @InputImport(name="except")
      private final @Nullable Output<List<String>> except;

    public Output<List<String>> getExcept() {
        return this.except == null ? Output.empty() : this.except;
    }

    public IPBlockArgs(
        Output<String> cidr,
        @Nullable Output<List<String>> except) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
        this.except = except;
    }

    private IPBlockArgs() {
        this.cidr = Output.empty();
        this.except = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cidr;
        private @Nullable Output<List<String>> except;

        public Builder() {
    	      // Empty
        }

        public Builder(IPBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.except = defaults.except;
        }

        public Builder cidr(Output<String> cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder cidr(String cidr) {
            this.cidr = Output.of(Objects.requireNonNull(cidr));
            return this;
        }

        public Builder except(@Nullable Output<List<String>> except) {
            this.except = except;
            return this;
        }

        public Builder except(@Nullable List<String> except) {
            this.except = Output.ofNullable(except);
            return this;
        }
        public IPBlockArgs build() {
            return new IPBlockArgs(cidr, except);
        }
    }
}
