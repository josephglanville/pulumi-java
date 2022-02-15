// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityContactPropertiesResponseAlertNotifications {
    private final @Nullable String minimalSeverity;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"minimalSeverity","state"})
    private SecurityContactPropertiesResponseAlertNotifications(
        @Nullable String minimalSeverity,
        @Nullable String state) {
        this.minimalSeverity = minimalSeverity;
        this.state = state;
    }

    public Optional<String> getMinimalSeverity() {
        return Optional.ofNullable(this.minimalSeverity);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesResponseAlertNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String minimalSeverity;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesResponseAlertNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimalSeverity = defaults.minimalSeverity;
    	      this.state = defaults.state;
        }

        public Builder setMinimalSeverity(@Nullable String minimalSeverity) {
            this.minimalSeverity = minimalSeverity;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public SecurityContactPropertiesResponseAlertNotifications build() {
            return new SecurityContactPropertiesResponseAlertNotifications(minimalSeverity, state);
        }
    }
}