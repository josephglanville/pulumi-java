// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Duration based custom options to copy
 * 
 */
public final class CustomCopyOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomCopyOptionArgs Empty = new CustomCopyOptionArgs();

    /**
     * Data copied after given timespan
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> getDuration() {
        return this.duration == null ? Output.empty() : this.duration;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'CustomCopyOption'.
     * 
     */
    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType;
    }

    public CustomCopyOptionArgs(
        @Nullable Output<String> duration,
        Output<String> objectType) {
        this.duration = duration;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private CustomCopyOptionArgs() {
        this.duration = Output.empty();
        this.objectType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomCopyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> duration;
        private Output<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomCopyOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable String duration) {
            this.duration = Output.ofNullable(duration);
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }        public CustomCopyOptionArgs build() {
            return new CustomCopyOptionArgs(duration, objectType);
        }
    }
}
