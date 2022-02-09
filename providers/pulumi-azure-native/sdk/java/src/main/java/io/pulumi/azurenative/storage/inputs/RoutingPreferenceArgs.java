// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.RoutingChoice;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutingPreferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingPreferenceArgs Empty = new RoutingPreferenceArgs();

    @InputImport(name="publishInternetEndpoints")
    private final @Nullable Input<Boolean> publishInternetEndpoints;

    public Input<Boolean> getPublishInternetEndpoints() {
        return this.publishInternetEndpoints == null ? Input.empty() : this.publishInternetEndpoints;
    }

    @InputImport(name="publishMicrosoftEndpoints")
    private final @Nullable Input<Boolean> publishMicrosoftEndpoints;

    public Input<Boolean> getPublishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints == null ? Input.empty() : this.publishMicrosoftEndpoints;
    }

    @InputImport(name="routingChoice")
    private final @Nullable Input<Either<String,RoutingChoice>> routingChoice;

    public Input<Either<String,RoutingChoice>> getRoutingChoice() {
        return this.routingChoice == null ? Input.empty() : this.routingChoice;
    }

    public RoutingPreferenceArgs(
        @Nullable Input<Boolean> publishInternetEndpoints,
        @Nullable Input<Boolean> publishMicrosoftEndpoints,
        @Nullable Input<Either<String,RoutingChoice>> routingChoice) {
        this.publishInternetEndpoints = publishInternetEndpoints;
        this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
        this.routingChoice = routingChoice;
    }

    private RoutingPreferenceArgs() {
        this.publishInternetEndpoints = Input.empty();
        this.publishMicrosoftEndpoints = Input.empty();
        this.routingChoice = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> publishInternetEndpoints;
        private @Nullable Input<Boolean> publishMicrosoftEndpoints;
        private @Nullable Input<Either<String,RoutingChoice>> routingChoice;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPreferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishInternetEndpoints = defaults.publishInternetEndpoints;
    	      this.publishMicrosoftEndpoints = defaults.publishMicrosoftEndpoints;
    	      this.routingChoice = defaults.routingChoice;
        }

        public Builder setPublishInternetEndpoints(@Nullable Input<Boolean> publishInternetEndpoints) {
            this.publishInternetEndpoints = publishInternetEndpoints;
            return this;
        }

        public Builder setPublishInternetEndpoints(@Nullable Boolean publishInternetEndpoints) {
            this.publishInternetEndpoints = Input.ofNullable(publishInternetEndpoints);
            return this;
        }

        public Builder setPublishMicrosoftEndpoints(@Nullable Input<Boolean> publishMicrosoftEndpoints) {
            this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
            return this;
        }

        public Builder setPublishMicrosoftEndpoints(@Nullable Boolean publishMicrosoftEndpoints) {
            this.publishMicrosoftEndpoints = Input.ofNullable(publishMicrosoftEndpoints);
            return this;
        }

        public Builder setRoutingChoice(@Nullable Input<Either<String,RoutingChoice>> routingChoice) {
            this.routingChoice = routingChoice;
            return this;
        }

        public Builder setRoutingChoice(@Nullable Either<String,RoutingChoice> routingChoice) {
            this.routingChoice = Input.ofNullable(routingChoice);
            return this;
        }

        public RoutingPreferenceArgs build() {
            return new RoutingPreferenceArgs(publishInternetEndpoints, publishMicrosoftEndpoints, routingChoice);
        }
    }
}
