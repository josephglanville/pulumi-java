// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IPv4FirewallRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPv4FirewallRuleResponse Empty = new IPv4FirewallRuleResponse();

    @InputImport(name="firewallRuleName")
    private final @Nullable String firewallRuleName;

    public Optional<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Optional.empty() : Optional.ofNullable(this.firewallRuleName);
    }

    @InputImport(name="rangeEnd")
    private final @Nullable String rangeEnd;

    public Optional<String> getRangeEnd() {
        return this.rangeEnd == null ? Optional.empty() : Optional.ofNullable(this.rangeEnd);
    }

    @InputImport(name="rangeStart")
    private final @Nullable String rangeStart;

    public Optional<String> getRangeStart() {
        return this.rangeStart == null ? Optional.empty() : Optional.ofNullable(this.rangeStart);
    }

    public IPv4FirewallRuleResponse(
        @Nullable String firewallRuleName,
        @Nullable String rangeEnd,
        @Nullable String rangeStart) {
        this.firewallRuleName = firewallRuleName;
        this.rangeEnd = rangeEnd;
        this.rangeStart = rangeStart;
    }

    private IPv4FirewallRuleResponse() {
        this.firewallRuleName = null;
        this.rangeEnd = null;
        this.rangeStart = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPv4FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String firewallRuleName;
        private @Nullable String rangeEnd;
        private @Nullable String rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(IPv4FirewallRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder setFirewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder setRangeEnd(@Nullable String rangeEnd) {
            this.rangeEnd = rangeEnd;
            return this;
        }

        public Builder setRangeStart(@Nullable String rangeStart) {
            this.rangeStart = rangeStart;
            return this;
        }

        public IPv4FirewallRuleResponse build() {
            return new IPv4FirewallRuleResponse(firewallRuleName, rangeEnd, rangeStart);
        }
    }
}
