// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConsoleProfileResponse {
    /**
     * The URL to access the cluster console (immutable).
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private ConsoleProfileResponse(@CustomType.Parameter("url") @Nullable String url) {
        this.url = url;
    }

    /**
     * The URL to access the cluster console (immutable).
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsoleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsoleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public ConsoleProfileResponse build() {
            return new ConsoleProfileResponse(url);
        }
    }
}
