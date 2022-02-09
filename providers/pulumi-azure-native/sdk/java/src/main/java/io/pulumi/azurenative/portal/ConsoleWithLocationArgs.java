// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsoleWithLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsoleWithLocationArgs Empty = new ConsoleWithLocationArgs();

    @InputImport(name="consoleName")
    private final @Nullable Input<String> consoleName;

    public Input<String> getConsoleName() {
        return this.consoleName == null ? Input.empty() : this.consoleName;
    }

    @InputImport(name="location", required=true)
    private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    public ConsoleWithLocationArgs(
        @Nullable Input<String> consoleName,
        Input<String> location) {
        this.consoleName = consoleName;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private ConsoleWithLocationArgs() {
        this.consoleName = Input.empty();
        this.location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsoleWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consoleName;
        private Input<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsoleWithLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleName = defaults.consoleName;
    	      this.location = defaults.location;
        }

        public Builder setConsoleName(@Nullable Input<String> consoleName) {
            this.consoleName = consoleName;
            return this;
        }

        public Builder setConsoleName(@Nullable String consoleName) {
            this.consoleName = Input.ofNullable(consoleName);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public ConsoleWithLocationArgs build() {
            return new ConsoleWithLocationArgs(consoleName, location);
        }
    }
}
