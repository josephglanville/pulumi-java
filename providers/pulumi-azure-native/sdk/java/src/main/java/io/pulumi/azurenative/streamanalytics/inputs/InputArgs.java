// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.ReferenceInputPropertiesArgs;
import io.pulumi.azurenative.streamanalytics.inputs.StreamInputPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * 
 */
public final class InputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputArgs Empty = new InputArgs();

    /**
     * Resource name
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties;

    public Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public InputArgs(
        @Nullable Input<String> name,
        @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties) {
        this.name = name;
        this.properties = properties;
    }

    private InputArgs() {
        this.name = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(InputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public InputArgs build() {
            return new InputArgs(name, properties);
        }
    }
}
