// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private endpoint resource from Microsoft.Network provider.
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponsePrivateEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponsePrivateEndpoint Empty = new PrivateEndpointConnectionPropertiesResponsePrivateEndpoint();

    /**
     * The resource id of the private endpoint resource from Microsoft.Network provider.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public PrivateEndpointConnectionPropertiesResponsePrivateEndpoint(@Nullable String id) {
        this.id = id;
    }

    private PrivateEndpointConnectionPropertiesResponsePrivateEndpoint() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponsePrivateEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponsePrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public PrivateEndpointConnectionPropertiesResponsePrivateEndpoint build() {
            return new PrivateEndpointConnectionPropertiesResponsePrivateEndpoint(id);
        }
    }
}
