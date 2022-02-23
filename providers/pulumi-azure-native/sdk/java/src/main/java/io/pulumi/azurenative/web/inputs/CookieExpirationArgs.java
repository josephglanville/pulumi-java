// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.CookieExpirationConvention;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the session cookie's expiration.
 * 
 */
public final class CookieExpirationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CookieExpirationArgs Empty = new CookieExpirationArgs();

    /**
     * The convention used when determining the session cookie's expiration.
     * 
     */
    @InputImport(name="convention")
      private final @Nullable Input<CookieExpirationConvention> convention;

    public Input<CookieExpirationConvention> getConvention() {
        return this.convention == null ? Input.empty() : this.convention;
    }

    /**
     * The time after the request is made when the session cookie should expire.
     * 
     */
    @InputImport(name="timeToExpiration")
      private final @Nullable Input<String> timeToExpiration;

    public Input<String> getTimeToExpiration() {
        return this.timeToExpiration == null ? Input.empty() : this.timeToExpiration;
    }

    public CookieExpirationArgs(
        @Nullable Input<CookieExpirationConvention> convention,
        @Nullable Input<String> timeToExpiration) {
        this.convention = convention;
        this.timeToExpiration = timeToExpiration;
    }

    private CookieExpirationArgs() {
        this.convention = Input.empty();
        this.timeToExpiration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CookieExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CookieExpirationConvention> convention;
        private @Nullable Input<String> timeToExpiration;

        public Builder() {
    	      // Empty
        }

        public Builder(CookieExpirationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convention = defaults.convention;
    	      this.timeToExpiration = defaults.timeToExpiration;
        }

        public Builder setConvention(@Nullable Input<CookieExpirationConvention> convention) {
            this.convention = convention;
            return this;
        }

        public Builder setConvention(@Nullable CookieExpirationConvention convention) {
            this.convention = Input.ofNullable(convention);
            return this;
        }

        public Builder setTimeToExpiration(@Nullable Input<String> timeToExpiration) {
            this.timeToExpiration = timeToExpiration;
            return this;
        }

        public Builder setTimeToExpiration(@Nullable String timeToExpiration) {
            this.timeToExpiration = Input.ofNullable(timeToExpiration);
            return this;
        }
        public CookieExpirationArgs build() {
            return new CookieExpirationArgs(convention, timeToExpiration);
        }
    }
}
