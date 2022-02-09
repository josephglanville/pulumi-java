// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.DeinterlaceMode;
import io.pulumi.azurenative.media.enums.DeinterlaceParity;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeinterlaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeinterlaceArgs Empty = new DeinterlaceArgs();

    @InputImport(name="mode")
    private final @Nullable Input<Either<String,DeinterlaceMode>> mode;

    public Input<Either<String,DeinterlaceMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="parity")
    private final @Nullable Input<Either<String,DeinterlaceParity>> parity;

    public Input<Either<String,DeinterlaceParity>> getParity() {
        return this.parity == null ? Input.empty() : this.parity;
    }

    public DeinterlaceArgs(
        @Nullable Input<Either<String,DeinterlaceMode>> mode,
        @Nullable Input<Either<String,DeinterlaceParity>> parity) {
        this.mode = mode;
        this.parity = parity;
    }

    private DeinterlaceArgs() {
        this.mode = Input.empty();
        this.parity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeinterlaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DeinterlaceMode>> mode;
        private @Nullable Input<Either<String,DeinterlaceParity>> parity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeinterlaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.parity = defaults.parity;
        }

        public Builder setMode(@Nullable Input<Either<String,DeinterlaceMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,DeinterlaceMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setParity(@Nullable Input<Either<String,DeinterlaceParity>> parity) {
            this.parity = parity;
            return this;
        }

        public Builder setParity(@Nullable Either<String,DeinterlaceParity> parity) {
            this.parity = Input.ofNullable(parity);
            return this;
        }

        public DeinterlaceArgs build() {
            return new DeinterlaceArgs(mode, parity);
        }
    }
}
