// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RadiusServerResponse {
    /**
     * The address of this radius server.
     * 
     */
    private final String radiusServerAddress;
    /**
     * The initial score assigned to this radius server.
     * 
     */
    private final @Nullable Double radiusServerScore;
    /**
     * The secret used for this radius server.
     * 
     */
    private final @Nullable String radiusServerSecret;

    @CustomType.Constructor
    private RadiusServerResponse(
        @CustomType.Parameter("radiusServerAddress") String radiusServerAddress,
        @CustomType.Parameter("radiusServerScore") @Nullable Double radiusServerScore,
        @CustomType.Parameter("radiusServerSecret") @Nullable String radiusServerSecret) {
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerScore = radiusServerScore;
        this.radiusServerSecret = radiusServerSecret;
    }

    /**
     * The address of this radius server.
     * 
    */
    public String getRadiusServerAddress() {
        return this.radiusServerAddress;
    }
    /**
     * The initial score assigned to this radius server.
     * 
    */
    public Optional<Double> getRadiusServerScore() {
        return Optional.ofNullable(this.radiusServerScore);
    }
    /**
     * The secret used for this radius server.
     * 
    */
    public Optional<String> getRadiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String radiusServerAddress;
        private @Nullable Double radiusServerScore;
        private @Nullable String radiusServerSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(RadiusServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerScore = defaults.radiusServerScore;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
        }

        public Builder radiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }
        public Builder radiusServerScore(@Nullable Double radiusServerScore) {
            this.radiusServerScore = radiusServerScore;
            return this;
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }        public RadiusServerResponse build() {
            return new RadiusServerResponse(radiusServerAddress, radiusServerScore, radiusServerSecret);
        }
    }
}
