// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Radius Server Settings.
 * 
 */
public final class RadiusServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RadiusServerArgs Empty = new RadiusServerArgs();

    /**
     * The address of this radius server.
     * 
     */
    @Import(name="radiusServerAddress", required=true)
      private final Output<String> radiusServerAddress;

    public Output<String> getRadiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * The initial score assigned to this radius server.
     * 
     */
    @Import(name="radiusServerScore")
      private final @Nullable Output<Double> radiusServerScore;

    public Output<Double> getRadiusServerScore() {
        return this.radiusServerScore == null ? Output.empty() : this.radiusServerScore;
    }

    /**
     * The secret used for this radius server.
     * 
     */
    @Import(name="radiusServerSecret")
      private final @Nullable Output<String> radiusServerSecret;

    public Output<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Output.empty() : this.radiusServerSecret;
    }

    public RadiusServerArgs(
        Output<String> radiusServerAddress,
        @Nullable Output<Double> radiusServerScore,
        @Nullable Output<String> radiusServerSecret) {
        this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress, "expected parameter 'radiusServerAddress' to be non-null");
        this.radiusServerScore = radiusServerScore;
        this.radiusServerSecret = radiusServerSecret;
    }

    private RadiusServerArgs() {
        this.radiusServerAddress = Output.empty();
        this.radiusServerScore = Output.empty();
        this.radiusServerSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> radiusServerAddress;
        private @Nullable Output<Double> radiusServerScore;
        private @Nullable Output<String> radiusServerSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(RadiusServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerScore = defaults.radiusServerScore;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
        }

        public Builder radiusServerAddress(Output<String> radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }
        public Builder radiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Output.of(Objects.requireNonNull(radiusServerAddress));
            return this;
        }
        public Builder radiusServerScore(@Nullable Output<Double> radiusServerScore) {
            this.radiusServerScore = radiusServerScore;
            return this;
        }
        public Builder radiusServerScore(@Nullable Double radiusServerScore) {
            this.radiusServerScore = Output.ofNullable(radiusServerScore);
            return this;
        }
        public Builder radiusServerSecret(@Nullable Output<String> radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = Output.ofNullable(radiusServerSecret);
            return this;
        }        public RadiusServerArgs build() {
            return new RadiusServerArgs(radiusServerAddress, radiusServerScore, radiusServerSecret);
        }
    }
}
