// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authentication keys.
 * 
 */
public final class CreateServiceRequestKeysArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateServiceRequestKeysArgs Empty = new CreateServiceRequestKeysArgs();

    /**
     * The primary key.
     * 
     */
    @InputImport(name="primaryKey")
      private final @Nullable Input<String> primaryKey;

    public Input<String> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    /**
     * The secondary key.
     * 
     */
    @InputImport(name="secondaryKey")
      private final @Nullable Input<String> secondaryKey;

    public Input<String> getSecondaryKey() {
        return this.secondaryKey == null ? Input.empty() : this.secondaryKey;
    }

    public CreateServiceRequestKeysArgs(
        @Nullable Input<String> primaryKey,
        @Nullable Input<String> secondaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
    }

    private CreateServiceRequestKeysArgs() {
        this.primaryKey = Input.empty();
        this.secondaryKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateServiceRequestKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> primaryKey;
        private @Nullable Input<String> secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateServiceRequestKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setPrimaryKey(@Nullable Input<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
            return this;
        }

        public Builder setSecondaryKey(@Nullable Input<String> secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = Input.ofNullable(secondaryKey);
            return this;
        }
        public CreateServiceRequestKeysArgs build() {
            return new CreateServiceRequestKeysArgs(primaryKey, secondaryKey);
        }
    }
}
