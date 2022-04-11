// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.plant.enums.ContainerBrightness;
import io.pulumi.plant.enums.ContainerColor;
import io.pulumi.plant.enums.ContainerSize;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    @Import(name="brightness")
      private final @Nullable Output<ContainerBrightness> brightness;

    public Output<ContainerBrightness> getBrightness() {
        return this.brightness == null ? Codegen.empty() : this.brightness;
    }

    @Import(name="color")
      private final @Nullable Output<Either<ContainerColor,String>> color;

    public Output<Either<ContainerColor,String>> getColor() {
        return this.color == null ? Codegen.empty() : this.color;
    }

    @Import(name="material")
      private final @Nullable Output<String> material;

    public Output<String> getMaterial() {
        return this.material == null ? Codegen.empty() : this.material;
    }

    @Import(name="size", required=true)
      private final Output<ContainerSize> size;

    public Output<ContainerSize> getSize() {
        return this.size;
    }

    public ContainerArgs(
        @Nullable Output<ContainerBrightness> brightness,
        @Nullable Output<Either<ContainerColor,String>> color,
        @Nullable Output<String> material,
        Output<ContainerSize> size) {
        this.brightness = brightness == null ? Codegen.ofNullable(io.pulumi.plant.enums.ContainerBrightness.One) : brightness;
        this.color = color;
        this.material = material;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
    }

    private ContainerArgs() {
        this.brightness = Codegen.empty();
        this.color = Codegen.empty();
        this.material = Codegen.empty();
        this.size = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerBrightness> brightness;
        private @Nullable Output<Either<ContainerColor,String>> color;
        private @Nullable Output<String> material;
        private Output<ContainerSize> size;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.color = defaults.color;
    	      this.material = defaults.material;
    	      this.size = defaults.size;
        }

        public Builder brightness(@Nullable Output<ContainerBrightness> brightness) {
            this.brightness = brightness;
            return this;
        }
        public Builder brightness(@Nullable ContainerBrightness brightness) {
            this.brightness = Codegen.ofNullable(brightness);
            return this;
        }
        public Builder color(@Nullable Output<Either<ContainerColor,String>> color) {
            this.color = color;
            return this;
        }
        public Builder color(@Nullable Either<ContainerColor,String> color) {
            this.color = Codegen.ofNullable(color);
            return this;
        }
        public Builder material(@Nullable Output<String> material) {
            this.material = material;
            return this;
        }
        public Builder material(@Nullable String material) {
            this.material = Codegen.ofNullable(material);
            return this;
        }
        public Builder size(Output<ContainerSize> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder size(ContainerSize size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }        public ContainerArgs build() {
            return new ContainerArgs(brightness, color, material, size);
        }
    }
}
