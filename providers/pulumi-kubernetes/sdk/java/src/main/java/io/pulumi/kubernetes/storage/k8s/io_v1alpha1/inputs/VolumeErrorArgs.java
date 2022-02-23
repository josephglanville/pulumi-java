// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeError captures an error encountered during a volume operation.
 * 
 */
public final class VolumeErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeErrorArgs Empty = new VolumeErrorArgs();

    /**
     * String detailing the error encountered during Attach or Detach operation. This string maybe logged, so it should not contain sensitive information.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Time the error was encountered.
     * 
     */
    @InputImport(name="time")
      private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    public VolumeErrorArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> time) {
        this.message = message;
        this.time = time;
    }

    private VolumeErrorArgs() {
        this.message = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }
        public VolumeErrorArgs build() {
            return new VolumeErrorArgs(message, time);
        }
    }
}
