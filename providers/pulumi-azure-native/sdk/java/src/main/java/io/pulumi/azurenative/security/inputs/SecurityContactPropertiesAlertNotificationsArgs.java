// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.MinimalSeverity;
import io.pulumi.azurenative.security.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications about new security alerts
 * 
 */
public final class SecurityContactPropertiesAlertNotificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContactPropertiesAlertNotificationsArgs Empty = new SecurityContactPropertiesAlertNotificationsArgs();

    /**
     * Defines the minimal alert severity which will be sent as email notifications
     * 
     */
    @Import(name="minimalSeverity")
      private final @Nullable Output<Either<String,MinimalSeverity>> minimalSeverity;

    public Output<Either<String,MinimalSeverity>> getMinimalSeverity() {
        return this.minimalSeverity == null ? Output.empty() : this.minimalSeverity;
    }

    /**
     * Defines if email notifications will be sent about new security alerts
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,State>> state;

    public Output<Either<String,State>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public SecurityContactPropertiesAlertNotificationsArgs(
        @Nullable Output<Either<String,MinimalSeverity>> minimalSeverity,
        @Nullable Output<Either<String,State>> state) {
        this.minimalSeverity = minimalSeverity;
        this.state = state;
    }

    private SecurityContactPropertiesAlertNotificationsArgs() {
        this.minimalSeverity = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,MinimalSeverity>> minimalSeverity;
        private @Nullable Output<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesAlertNotificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimalSeverity = defaults.minimalSeverity;
    	      this.state = defaults.state;
        }

        public Builder minimalSeverity(@Nullable Output<Either<String,MinimalSeverity>> minimalSeverity) {
            this.minimalSeverity = minimalSeverity;
            return this;
        }
        public Builder minimalSeverity(@Nullable Either<String,MinimalSeverity> minimalSeverity) {
            this.minimalSeverity = Output.ofNullable(minimalSeverity);
            return this;
        }
        public Builder state(@Nullable Output<Either<String,State>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,State> state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public SecurityContactPropertiesAlertNotificationsArgs build() {
            return new SecurityContactPropertiesAlertNotificationsArgs(minimalSeverity, state);
        }
    }
}
