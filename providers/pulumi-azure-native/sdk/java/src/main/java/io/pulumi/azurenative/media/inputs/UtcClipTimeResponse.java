// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UtcClipTimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final UtcClipTimeResponse Empty = new UtcClipTimeResponse();

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="time", required=true)
    private final String time;

    public String getTime() {
        return this.time;
    }

    public UtcClipTimeResponse(
        String odataType,
        String time) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private UtcClipTimeResponse() {
        this.odataType = null;
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UtcClipTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(UtcClipTimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }

        public UtcClipTimeResponse build() {
            return new UtcClipTimeResponse(odataType, time);
        }
    }
}
