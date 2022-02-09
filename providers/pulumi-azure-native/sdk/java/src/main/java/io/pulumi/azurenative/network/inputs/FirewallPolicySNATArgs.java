// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicySNATArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicySNATArgs Empty = new FirewallPolicySNATArgs();

    @InputImport(name="privateRanges")
    private final @Nullable Input<List<String>> privateRanges;

    public Input<List<String>> getPrivateRanges() {
        return this.privateRanges == null ? Input.empty() : this.privateRanges;
    }

    public FirewallPolicySNATArgs(@Nullable Input<List<String>> privateRanges) {
        this.privateRanges = privateRanges;
    }

    private FirewallPolicySNATArgs() {
        this.privateRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySNATArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> privateRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySNATArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateRanges = defaults.privateRanges;
        }

        public Builder setPrivateRanges(@Nullable Input<List<String>> privateRanges) {
            this.privateRanges = privateRanges;
            return this;
        }

        public Builder setPrivateRanges(@Nullable List<String> privateRanges) {
            this.privateRanges = Input.ofNullable(privateRanges);
            return this;
        }

        public FirewallPolicySNATArgs build() {
            return new FirewallPolicySNATArgs(privateRanges);
        }
    }
}
