// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.azurenative.timeseriesinsights.inputs.LocalTimestampResponseTimeZoneOffset;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the local timestamp property. It contains the format of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
 * 
 */
public final class LocalTimestampResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocalTimestampResponse Empty = new LocalTimestampResponse();

    /**
     * An enum that represents the format of the local timestamp property that needs to be set.
     * 
     */
    @InputImport(name="format")
      private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * An object that represents the offset information for the local timestamp format specified. Should not be specified for LocalTimestampFormat - Embedded.
     * 
     */
    @InputImport(name="timeZoneOffset")
      private final @Nullable LocalTimestampResponseTimeZoneOffset timeZoneOffset;

    public Optional<LocalTimestampResponseTimeZoneOffset> getTimeZoneOffset() {
        return this.timeZoneOffset == null ? Optional.empty() : Optional.ofNullable(this.timeZoneOffset);
    }

    public LocalTimestampResponse(
        @Nullable String format,
        @Nullable LocalTimestampResponseTimeZoneOffset timeZoneOffset) {
        this.format = format;
        this.timeZoneOffset = timeZoneOffset;
    }

    private LocalTimestampResponse() {
        this.format = null;
        this.timeZoneOffset = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalTimestampResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private @Nullable LocalTimestampResponseTimeZoneOffset timeZoneOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalTimestampResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.timeZoneOffset = defaults.timeZoneOffset;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setTimeZoneOffset(@Nullable LocalTimestampResponseTimeZoneOffset timeZoneOffset) {
            this.timeZoneOffset = timeZoneOffset;
            return this;
        }
        public LocalTimestampResponse build() {
            return new LocalTimestampResponse(format, timeZoneOffset);
        }
    }
}
