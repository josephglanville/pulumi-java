// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InputDataBindingResponse extends io.pulumi.resources.InvokeArgs {

    public static final InputDataBindingResponse Empty = new InputDataBindingResponse();

    /**
     * ARM resource ID of the registered dataVersion.
     * 
     */
    @Import(name="dataId")
      private final @Nullable String dataId;

    public Optional<String> getDataId() {
        return this.dataId == null ? Optional.empty() : Optional.ofNullable(this.dataId);
    }

    /**
     * Mechanism for accessing the data artifact.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * Location of data inside the container process.
     * 
     */
    @Import(name="pathOnCompute")
      private final @Nullable String pathOnCompute;

    public Optional<String> getPathOnCompute() {
        return this.pathOnCompute == null ? Optional.empty() : Optional.ofNullable(this.pathOnCompute);
    }

    public InputDataBindingResponse(
        @Nullable String dataId,
        @Nullable String mode,
        @Nullable String pathOnCompute) {
        this.dataId = dataId;
        this.mode = mode;
        this.pathOnCompute = pathOnCompute;
    }

    private InputDataBindingResponse() {
        this.dataId = null;
        this.mode = null;
        this.pathOnCompute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputDataBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataId;
        private @Nullable String mode;
        private @Nullable String pathOnCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(InputDataBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.mode = defaults.mode;
    	      this.pathOnCompute = defaults.pathOnCompute;
        }

        public Builder dataId(@Nullable String dataId) {
            this.dataId = dataId;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder pathOnCompute(@Nullable String pathOnCompute) {
            this.pathOnCompute = pathOnCompute;
            return this;
        }        public InputDataBindingResponse build() {
            return new InputDataBindingResponse(dataId, mode, pathOnCompute);
        }
    }
}
