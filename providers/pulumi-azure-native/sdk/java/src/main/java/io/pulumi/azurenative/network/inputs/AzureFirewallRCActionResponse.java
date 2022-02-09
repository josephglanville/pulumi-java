// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFirewallRCActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallRCActionResponse Empty = new AzureFirewallRCActionResponse();

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AzureFirewallRCActionResponse(@Nullable String type) {
        this.type = type;
    }

    private AzureFirewallRCActionResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallRCActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallRCActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public AzureFirewallRCActionResponse build() {
            return new AzureFirewallRCActionResponse(type);
        }
    }
}
