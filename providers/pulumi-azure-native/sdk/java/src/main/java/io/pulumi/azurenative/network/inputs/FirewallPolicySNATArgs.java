// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The private IP addresses/IP ranges to which traffic will not be SNAT.
 * 
 */
public final class FirewallPolicySNATArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicySNATArgs Empty = new FirewallPolicySNATArgs();

    /**
     * List of private IP addresses/IP address ranges to not be SNAT.
     * 
     */
    @Import(name="privateRanges")
      private final @Nullable Output<List<String>> privateRanges;

    public Output<List<String>> getPrivateRanges() {
        return this.privateRanges == null ? Codegen.empty() : this.privateRanges;
    }

    public FirewallPolicySNATArgs(@Nullable Output<List<String>> privateRanges) {
        this.privateRanges = privateRanges;
    }

    private FirewallPolicySNATArgs() {
        this.privateRanges = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySNATArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> privateRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySNATArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateRanges = defaults.privateRanges;
        }

        public Builder privateRanges(@Nullable Output<List<String>> privateRanges) {
            this.privateRanges = privateRanges;
            return this;
        }
        public Builder privateRanges(@Nullable List<String> privateRanges) {
            this.privateRanges = Codegen.ofNullable(privateRanges);
            return this;
        }
        public Builder privateRanges(String... privateRanges) {
            return privateRanges(List.of(privateRanges));
        }        public FirewallPolicySNATArgs build() {
            return new FirewallPolicySNATArgs(privateRanges);
        }
    }
}
