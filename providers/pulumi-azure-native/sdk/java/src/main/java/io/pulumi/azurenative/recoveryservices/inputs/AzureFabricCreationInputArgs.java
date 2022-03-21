// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Fabric provider specific settings.
 * 
 */
public final class AzureFabricCreationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFabricCreationInputArgs Empty = new AzureFabricCreationInputArgs();

    /**
     * Gets the class type.
     * Expected value is 'Azure'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    public AzureFabricCreationInputArgs(
        @Nullable Output<String> instanceType,
        @Nullable Output<String> location) {
        this.instanceType = instanceType;
        this.location = location;
    }

    private AzureFabricCreationInputArgs() {
        this.instanceType = Output.empty();
        this.location = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFabricCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFabricCreationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.location = defaults.location;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }        public AzureFabricCreationInputArgs build() {
            return new AzureFabricCreationInputArgs(instanceType, location);
        }
    }
}
