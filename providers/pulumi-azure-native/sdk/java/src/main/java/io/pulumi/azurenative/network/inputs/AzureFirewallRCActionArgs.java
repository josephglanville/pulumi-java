// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.AzureFirewallRCActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the AzureFirewallRCAction.
 * 
 */
public final class AzureFirewallRCActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallRCActionArgs Empty = new AzureFirewallRCActionArgs();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,AzureFirewallRCActionType>> type;

    public Output<Either<String,AzureFirewallRCActionType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AzureFirewallRCActionArgs(@Nullable Output<Either<String,AzureFirewallRCActionType>> type) {
        this.type = type;
    }

    private AzureFirewallRCActionArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallRCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AzureFirewallRCActionType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallRCActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,AzureFirewallRCActionType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,AzureFirewallRCActionType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public AzureFirewallRCActionArgs build() {
            return new AzureFirewallRCActionArgs(type);
        }
    }
}
