// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersNetworkSourceIpv6Args extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersNetworkSourceIpv6Args Empty = new InsightFiltersNetworkSourceIpv6Args();

    /**
     * A finding's CIDR value.
     * 
     */
    @Import(name="cidr", required=true)
      private final Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr;
    }

    public InsightFiltersNetworkSourceIpv6Args(Output<String> cidr) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
    }

    private InsightFiltersNetworkSourceIpv6Args() {
        this.cidr = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersNetworkSourceIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersNetworkSourceIpv6Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder cidr(Output<String> cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder cidr(String cidr) {
            this.cidr = Output.of(Objects.requireNonNull(cidr));
            return this;
        }        public InsightFiltersNetworkSourceIpv6Args build() {
            return new InsightFiltersNetworkSourceIpv6Args(cidr);
        }
    }
}
