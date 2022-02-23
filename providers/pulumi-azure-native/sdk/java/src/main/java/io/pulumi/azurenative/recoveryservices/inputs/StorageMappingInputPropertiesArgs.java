// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Storage mapping input properties.
 * 
 */
public final class StorageMappingInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageMappingInputPropertiesArgs Empty = new StorageMappingInputPropertiesArgs();

    /**
     * The ID of the storage object.
     * 
     */
    @InputImport(name="targetStorageClassificationId")
      private final @Nullable Input<String> targetStorageClassificationId;

    public Input<String> getTargetStorageClassificationId() {
        return this.targetStorageClassificationId == null ? Input.empty() : this.targetStorageClassificationId;
    }

    public StorageMappingInputPropertiesArgs(@Nullable Input<String> targetStorageClassificationId) {
        this.targetStorageClassificationId = targetStorageClassificationId;
    }

    private StorageMappingInputPropertiesArgs() {
        this.targetStorageClassificationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageMappingInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> targetStorageClassificationId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageMappingInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetStorageClassificationId = defaults.targetStorageClassificationId;
        }

        public Builder setTargetStorageClassificationId(@Nullable Input<String> targetStorageClassificationId) {
            this.targetStorageClassificationId = targetStorageClassificationId;
            return this;
        }

        public Builder setTargetStorageClassificationId(@Nullable String targetStorageClassificationId) {
            this.targetStorageClassificationId = Input.ofNullable(targetStorageClassificationId);
            return this;
        }
        public StorageMappingInputPropertiesArgs build() {
            return new StorageMappingInputPropertiesArgs(targetStorageClassificationId);
        }
    }
}
