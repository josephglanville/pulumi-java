// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomCopyOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomCopyOptionArgs Empty = new CustomCopyOptionArgs();

    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    @InputImport(name="objectType", required=true)
    private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    public CustomCopyOptionArgs(
        @Nullable Input<String> duration,
        Input<String> objectType) {
        this.duration = duration;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private CustomCopyOptionArgs() {
        this.duration = Input.empty();
        this.objectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomCopyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> duration;
        private Input<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomCopyOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public CustomCopyOptionArgs build() {
            return new CustomCopyOptionArgs(duration, objectType);
        }
    }
}
