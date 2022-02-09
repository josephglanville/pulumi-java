// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DebugSettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final DebugSettingResponse Empty = new DebugSettingResponse();

    @InputImport(name="detailLevel")
    private final @Nullable String detailLevel;

    public Optional<String> getDetailLevel() {
        return this.detailLevel == null ? Optional.empty() : Optional.ofNullable(this.detailLevel);
    }

    public DebugSettingResponse(@Nullable String detailLevel) {
        this.detailLevel = detailLevel;
    }

    private DebugSettingResponse() {
        this.detailLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String detailLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailLevel = defaults.detailLevel;
        }

        public Builder setDetailLevel(@Nullable String detailLevel) {
            this.detailLevel = detailLevel;
            return this;
        }

        public DebugSettingResponse build() {
            return new DebugSettingResponse(detailLevel);
        }
    }
}
