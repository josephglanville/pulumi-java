// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiagnosticsRefResponse {
    private final @Nullable Boolean enabled;
    private final @Nullable List<String> sinkRefs;

    @OutputCustomType.Constructor({"enabled","sinkRefs"})
    private DiagnosticsRefResponse(
        @Nullable Boolean enabled,
        @Nullable List<String> sinkRefs) {
        this.enabled = enabled;
        this.sinkRefs = sinkRefs;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<String> getSinkRefs() {
        return this.sinkRefs == null ? List.of() : this.sinkRefs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<String> sinkRefs;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.sinkRefs = defaults.sinkRefs;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setSinkRefs(@Nullable List<String> sinkRefs) {
            this.sinkRefs = sinkRefs;
            return this;
        }

        public DiagnosticsRefResponse build() {
            return new DiagnosticsRefResponse(enabled, sinkRefs);
        }
    }
}
