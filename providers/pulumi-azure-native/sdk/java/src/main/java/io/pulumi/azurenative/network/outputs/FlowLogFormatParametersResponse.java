// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowLogFormatParametersResponse {
    /**
     * The file type of flow log.
     * 
     */
    private final @Nullable String type;
    /**
     * The version (revision) of the flow log.
     * 
     */
    private final @Nullable Integer version;

    @CustomType.Constructor
    private FlowLogFormatParametersResponse(
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("version") @Nullable Integer version) {
        this.type = type;
        this.version = version;
    }

    /**
     * The file type of flow log.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The version (revision) of the flow log.
     * 
    */
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogFormatParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogFormatParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }        public FlowLogFormatParametersResponse build() {
            return new FlowLogFormatParametersResponse(type, version);
        }
    }
}
