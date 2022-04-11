// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.azurenative.orbital.inputs.EndPointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact Profile Link Channel
 * 
 */
public final class ContactProfileLinkChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactProfileLinkChannelArgs Empty = new ContactProfileLinkChannelArgs();

    /**
     * Bandwidth in MHz
     * 
     */
    @Import(name="bandwidthMHz", required=true)
      private final Output<Double> bandwidthMHz;

    public Output<Double> getBandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Center Frequency in MHz
     * 
     */
    @Import(name="centerFrequencyMHz", required=true)
      private final Output<Double> centerFrequencyMHz;

    public Output<Double> getCenterFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Configuration for decoding
     * 
     */
    @Import(name="decodingConfiguration")
      private final @Nullable Output<String> decodingConfiguration;

    public Output<String> getDecodingConfiguration() {
        return this.decodingConfiguration == null ? Codegen.empty() : this.decodingConfiguration;
    }

    /**
     * Configuration for demodulation
     * 
     */
    @Import(name="demodulationConfiguration")
      private final @Nullable Output<String> demodulationConfiguration;

    public Output<String> getDemodulationConfiguration() {
        return this.demodulationConfiguration == null ? Codegen.empty() : this.demodulationConfiguration;
    }

    /**
     * Configuration for encoding
     * 
     */
    @Import(name="encodingConfiguration")
      private final @Nullable Output<String> encodingConfiguration;

    public Output<String> getEncodingConfiguration() {
        return this.encodingConfiguration == null ? Codegen.empty() : this.encodingConfiguration;
    }

    /**
     * Customer End point to store/retrieve data during a contact.
     * 
     */
    @Import(name="endPoint", required=true)
      private final Output<EndPointArgs> endPoint;

    public Output<EndPointArgs> getEndPoint() {
        return this.endPoint;
    }

    /**
     * Configuration for modulation
     * 
     */
    @Import(name="modulationConfiguration")
      private final @Nullable Output<String> modulationConfiguration;

    public Output<String> getModulationConfiguration() {
        return this.modulationConfiguration == null ? Codegen.empty() : this.modulationConfiguration;
    }

    public ContactProfileLinkChannelArgs(
        Output<Double> bandwidthMHz,
        Output<Double> centerFrequencyMHz,
        @Nullable Output<String> decodingConfiguration,
        @Nullable Output<String> demodulationConfiguration,
        @Nullable Output<String> encodingConfiguration,
        Output<EndPointArgs> endPoint,
        @Nullable Output<String> modulationConfiguration) {
        this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz, "expected parameter 'bandwidthMHz' to be non-null");
        this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz, "expected parameter 'centerFrequencyMHz' to be non-null");
        this.decodingConfiguration = decodingConfiguration;
        this.demodulationConfiguration = demodulationConfiguration;
        this.encodingConfiguration = encodingConfiguration;
        this.endPoint = Objects.requireNonNull(endPoint, "expected parameter 'endPoint' to be non-null");
        this.modulationConfiguration = modulationConfiguration;
    }

    private ContactProfileLinkChannelArgs() {
        this.bandwidthMHz = Codegen.empty();
        this.centerFrequencyMHz = Codegen.empty();
        this.decodingConfiguration = Codegen.empty();
        this.demodulationConfiguration = Codegen.empty();
        this.encodingConfiguration = Codegen.empty();
        this.endPoint = Codegen.empty();
        this.modulationConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactProfileLinkChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> bandwidthMHz;
        private Output<Double> centerFrequencyMHz;
        private @Nullable Output<String> decodingConfiguration;
        private @Nullable Output<String> demodulationConfiguration;
        private @Nullable Output<String> encodingConfiguration;
        private Output<EndPointArgs> endPoint;
        private @Nullable Output<String> modulationConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactProfileLinkChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthMHz = defaults.bandwidthMHz;
    	      this.centerFrequencyMHz = defaults.centerFrequencyMHz;
    	      this.decodingConfiguration = defaults.decodingConfiguration;
    	      this.demodulationConfiguration = defaults.demodulationConfiguration;
    	      this.encodingConfiguration = defaults.encodingConfiguration;
    	      this.endPoint = defaults.endPoint;
    	      this.modulationConfiguration = defaults.modulationConfiguration;
        }

        public Builder bandwidthMHz(Output<Double> bandwidthMHz) {
            this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
            return this;
        }
        public Builder bandwidthMHz(Double bandwidthMHz) {
            this.bandwidthMHz = Output.of(Objects.requireNonNull(bandwidthMHz));
            return this;
        }
        public Builder centerFrequencyMHz(Output<Double> centerFrequencyMHz) {
            this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
            return this;
        }
        public Builder centerFrequencyMHz(Double centerFrequencyMHz) {
            this.centerFrequencyMHz = Output.of(Objects.requireNonNull(centerFrequencyMHz));
            return this;
        }
        public Builder decodingConfiguration(@Nullable Output<String> decodingConfiguration) {
            this.decodingConfiguration = decodingConfiguration;
            return this;
        }
        public Builder decodingConfiguration(@Nullable String decodingConfiguration) {
            this.decodingConfiguration = Codegen.ofNullable(decodingConfiguration);
            return this;
        }
        public Builder demodulationConfiguration(@Nullable Output<String> demodulationConfiguration) {
            this.demodulationConfiguration = demodulationConfiguration;
            return this;
        }
        public Builder demodulationConfiguration(@Nullable String demodulationConfiguration) {
            this.demodulationConfiguration = Codegen.ofNullable(demodulationConfiguration);
            return this;
        }
        public Builder encodingConfiguration(@Nullable Output<String> encodingConfiguration) {
            this.encodingConfiguration = encodingConfiguration;
            return this;
        }
        public Builder encodingConfiguration(@Nullable String encodingConfiguration) {
            this.encodingConfiguration = Codegen.ofNullable(encodingConfiguration);
            return this;
        }
        public Builder endPoint(Output<EndPointArgs> endPoint) {
            this.endPoint = Objects.requireNonNull(endPoint);
            return this;
        }
        public Builder endPoint(EndPointArgs endPoint) {
            this.endPoint = Output.of(Objects.requireNonNull(endPoint));
            return this;
        }
        public Builder modulationConfiguration(@Nullable Output<String> modulationConfiguration) {
            this.modulationConfiguration = modulationConfiguration;
            return this;
        }
        public Builder modulationConfiguration(@Nullable String modulationConfiguration) {
            this.modulationConfiguration = Codegen.ofNullable(modulationConfiguration);
            return this;
        }        public ContactProfileLinkChannelArgs build() {
            return new ContactProfileLinkChannelArgs(bandwidthMHz, centerFrequencyMHz, decodingConfiguration, demodulationConfiguration, encodingConfiguration, endPoint, modulationConfiguration);
        }
    }
}
