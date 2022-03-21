// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a time zone from the [IANA Time Zone Database](https://www.iana.org/time-zones).
 * 
 */
public final class TimeZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeZoneArgs Empty = new TimeZoneArgs();

    /**
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public TimeZoneArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> version) {
        this.id = id;
        this.version = version;
    }

    private TimeZoneArgs() {
        this.id = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public TimeZoneArgs build() {
            return new TimeZoneArgs(id, version);
        }
    }
}
