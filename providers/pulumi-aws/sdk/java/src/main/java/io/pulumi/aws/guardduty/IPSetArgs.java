// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPSetArgs Empty = new IPSetArgs();

    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     * 
     */
    @Import(name="activate", required=true)
      private final Output<Boolean> activate;

    public Output<Boolean> getActivate() {
        return this.activate;
    }

    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Import(name="detectorId", required=true)
      private final Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    @Import(name="format", required=true)
      private final Output<String> format;

    public Output<String> getFormat() {
        return this.format;
    }

    /**
     * The URI of the file that contains the IPSet.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * The friendly name to identify the IPSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IPSetArgs(
        Output<Boolean> activate,
        Output<String> detectorId,
        Output<String> format,
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.activate = Objects.requireNonNull(activate, "expected parameter 'activate' to be non-null");
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private IPSetArgs() {
        this.activate = Output.empty();
        this.detectorId = Output.empty();
        this.format = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> activate;
        private Output<String> detectorId;
        private Output<String> format;
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IPSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activate = defaults.activate;
    	      this.detectorId = defaults.detectorId;
    	      this.format = defaults.format;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder activate(Output<Boolean> activate) {
            this.activate = Objects.requireNonNull(activate);
            return this;
        }
        public Builder activate(Boolean activate) {
            this.activate = Output.of(Objects.requireNonNull(activate));
            return this;
        }
        public Builder detectorId(Output<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }
        public Builder detectorId(String detectorId) {
            this.detectorId = Output.of(Objects.requireNonNull(detectorId));
            return this;
        }
        public Builder format(Output<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder format(String format) {
            this.format = Output.of(Objects.requireNonNull(format));
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public IPSetArgs build() {
            return new IPSetArgs(activate, detectorId, format, location, name, tags);
        }
    }
}
