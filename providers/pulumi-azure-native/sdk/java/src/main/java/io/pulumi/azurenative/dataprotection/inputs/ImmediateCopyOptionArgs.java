// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Immediate copy Option
 * 
 */
public final class ImmediateCopyOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImmediateCopyOptionArgs Empty = new ImmediateCopyOptionArgs();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'ImmediateCopyOption'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    public ImmediateCopyOptionArgs(Input<String> objectType) {
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private ImmediateCopyOptionArgs() {
        this.objectType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImmediateCopyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImmediateCopyOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }
        public ImmediateCopyOptionArgs build() {
            return new ImmediateCopyOptionArgs(objectType);
        }
    }
}
