// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FleetIdentityProvider {
    /**
     * The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    private final String samlMetadata;
    /**
     * The type of identity provider.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private FleetIdentityProvider(
        @OutputCustomType.Parameter("samlMetadata") String samlMetadata,
        @OutputCustomType.Parameter("type") String type) {
        this.samlMetadata = samlMetadata;
        this.type = type;
    }

    /**
     * The SAML metadata document provided by the customer’s identity provider.
     * 
    */
    public String getSamlMetadata() {
        return this.samlMetadata;
    }
    /**
     * The type of identity provider.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIdentityProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String samlMetadata;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIdentityProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samlMetadata = defaults.samlMetadata;
    	      this.type = defaults.type;
        }

        public Builder setSamlMetadata(String samlMetadata) {
            this.samlMetadata = Objects.requireNonNull(samlMetadata);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FleetIdentityProvider build() {
            return new FleetIdentityProvider(samlMetadata, type);
        }
    }
}
