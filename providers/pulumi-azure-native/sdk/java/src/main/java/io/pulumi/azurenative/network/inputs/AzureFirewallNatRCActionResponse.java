// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureFirewall NAT Rule Collection Action.
 * 
 */
public final class AzureFirewallNatRCActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNatRCActionResponse Empty = new AzureFirewallNatRCActionResponse();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AzureFirewallNatRCActionResponse(@Nullable String type) {
        this.type = type;
    }

    private AzureFirewallNatRCActionResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNatRCActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNatRCActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public AzureFirewallNatRCActionResponse build() {
            return new AzureFirewallNatRCActionResponse(type);
        }
    }
}
