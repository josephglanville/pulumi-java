// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Geo-physical location to run a web test from. You must specify one or more locations for the test to run from.
 * 
 */
public final class WebTestGeolocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTestGeolocationArgs Empty = new WebTestGeolocationArgs();

    /**
     * Location ID for the webtest to run from.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    public WebTestGeolocationArgs(@Nullable Input<String> location) {
        this.location = location;
    }

    private WebTestGeolocationArgs() {
        this.location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestGeolocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestGeolocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }
        public WebTestGeolocationArgs build() {
            return new WebTestGeolocationArgs(location);
        }
    }
}
