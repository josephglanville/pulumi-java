// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The TLS certificate properties of the connected registry login server.
 * 
 */
public final class TlsCertificatePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsCertificatePropertiesResponse Empty = new TlsCertificatePropertiesResponse();

    /**
     * Indicates the location of the certificates.
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The type of certificate location.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public TlsCertificatePropertiesResponse(
        String location,
        String type) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TlsCertificatePropertiesResponse() {
        this.location = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.type = defaults.type;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TlsCertificatePropertiesResponse build() {
            return new TlsCertificatePropertiesResponse(location, type);
        }
    }
}
