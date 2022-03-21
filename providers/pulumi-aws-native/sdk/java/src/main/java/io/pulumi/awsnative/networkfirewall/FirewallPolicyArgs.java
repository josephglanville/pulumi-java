// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="firewallPolicy", required=true)
      private final Output<io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs> firewallPolicy;

    public Output<io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs> getFirewallPolicy() {
        return this.firewallPolicy;
    }

    @Import(name="firewallPolicyName")
      private final @Nullable Output<String> firewallPolicyName;

    public Output<String> getFirewallPolicyName() {
        return this.firewallPolicyName == null ? Output.empty() : this.firewallPolicyName;
    }

    @Import(name="tags")
      private final @Nullable Output<List<FirewallPolicyTagArgs>> tags;

    public Output<List<FirewallPolicyTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public FirewallPolicyArgs(
        @Nullable Output<String> description,
        Output<io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs> firewallPolicy,
        @Nullable Output<String> firewallPolicyName,
        @Nullable Output<List<FirewallPolicyTagArgs>> tags) {
        this.description = description;
        this.firewallPolicy = Objects.requireNonNull(firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
        this.firewallPolicyName = firewallPolicyName;
        this.tags = tags;
    }

    private FirewallPolicyArgs() {
        this.description = Output.empty();
        this.firewallPolicy = Output.empty();
        this.firewallPolicyName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs> firewallPolicy;
        private @Nullable Output<String> firewallPolicyName;
        private @Nullable Output<List<FirewallPolicyTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder firewallPolicy(Output<io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs> firewallPolicy) {
            this.firewallPolicy = Objects.requireNonNull(firewallPolicy);
            return this;
        }
        public Builder firewallPolicy(io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyArgs firewallPolicy) {
            this.firewallPolicy = Output.of(Objects.requireNonNull(firewallPolicy));
            return this;
        }
        public Builder firewallPolicyName(@Nullable Output<String> firewallPolicyName) {
            this.firewallPolicyName = firewallPolicyName;
            return this;
        }
        public Builder firewallPolicyName(@Nullable String firewallPolicyName) {
            this.firewallPolicyName = Output.ofNullable(firewallPolicyName);
            return this;
        }
        public Builder tags(@Nullable Output<List<FirewallPolicyTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<FirewallPolicyTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(FirewallPolicyTagArgs... tags) {
            return tags(List.of(tags));
        }        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(description, firewallPolicy, firewallPolicyName, tags);
        }
    }
}
