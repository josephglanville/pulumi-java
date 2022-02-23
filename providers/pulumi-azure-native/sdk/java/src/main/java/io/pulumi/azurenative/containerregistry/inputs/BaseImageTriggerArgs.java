// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.BaseImageTriggerType;
import io.pulumi.azurenative.containerregistry.enums.TriggerStatus;
import io.pulumi.azurenative.containerregistry.enums.UpdateTriggerPayloadType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The trigger based on base image dependency.
 * 
 */
public final class BaseImageTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final BaseImageTriggerArgs Empty = new BaseImageTriggerArgs();

    /**
     * The type of the auto trigger for base image dependency updates.
     * 
     */
    @InputImport(name="baseImageTriggerType", required=true)
      private final Input<Either<String,BaseImageTriggerType>> baseImageTriggerType;

    public Input<Either<String,BaseImageTriggerType>> getBaseImageTriggerType() {
        return this.baseImageTriggerType;
    }

    /**
     * The name of the trigger.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The current status of trigger.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,TriggerStatus>> status;

    public Input<Either<String,TriggerStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The endpoint URL for receiving update triggers.
     * 
     */
    @InputImport(name="updateTriggerEndpoint")
      private final @Nullable Input<String> updateTriggerEndpoint;

    public Input<String> getUpdateTriggerEndpoint() {
        return this.updateTriggerEndpoint == null ? Input.empty() : this.updateTriggerEndpoint;
    }

    /**
     * Type of Payload body for Base image update triggers.
     * 
     */
    @InputImport(name="updateTriggerPayloadType")
      private final @Nullable Input<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType;

    public Input<Either<String,UpdateTriggerPayloadType>> getUpdateTriggerPayloadType() {
        return this.updateTriggerPayloadType == null ? Input.empty() : this.updateTriggerPayloadType;
    }

    public BaseImageTriggerArgs(
        Input<Either<String,BaseImageTriggerType>> baseImageTriggerType,
        Input<String> name,
        @Nullable Input<Either<String,TriggerStatus>> status,
        @Nullable Input<String> updateTriggerEndpoint,
        @Nullable Input<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType) {
        this.baseImageTriggerType = Objects.requireNonNull(baseImageTriggerType, "expected parameter 'baseImageTriggerType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = status == null ? Input.ofLeft("Enabled") : status;
        this.updateTriggerEndpoint = updateTriggerEndpoint;
        this.updateTriggerPayloadType = updateTriggerPayloadType;
    }

    private BaseImageTriggerArgs() {
        this.baseImageTriggerType = Input.empty();
        this.name = Input.empty();
        this.status = Input.empty();
        this.updateTriggerEndpoint = Input.empty();
        this.updateTriggerPayloadType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaseImageTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,BaseImageTriggerType>> baseImageTriggerType;
        private Input<String> name;
        private @Nullable Input<Either<String,TriggerStatus>> status;
        private @Nullable Input<String> updateTriggerEndpoint;
        private @Nullable Input<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(BaseImageTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageTriggerType = defaults.baseImageTriggerType;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.updateTriggerEndpoint = defaults.updateTriggerEndpoint;
    	      this.updateTriggerPayloadType = defaults.updateTriggerPayloadType;
        }

        public Builder setBaseImageTriggerType(Input<Either<String,BaseImageTriggerType>> baseImageTriggerType) {
            this.baseImageTriggerType = Objects.requireNonNull(baseImageTriggerType);
            return this;
        }

        public Builder setBaseImageTriggerType(Either<String,BaseImageTriggerType> baseImageTriggerType) {
            this.baseImageTriggerType = Input.of(Objects.requireNonNull(baseImageTriggerType));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,TriggerStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,TriggerStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setUpdateTriggerEndpoint(@Nullable Input<String> updateTriggerEndpoint) {
            this.updateTriggerEndpoint = updateTriggerEndpoint;
            return this;
        }

        public Builder setUpdateTriggerEndpoint(@Nullable String updateTriggerEndpoint) {
            this.updateTriggerEndpoint = Input.ofNullable(updateTriggerEndpoint);
            return this;
        }

        public Builder setUpdateTriggerPayloadType(@Nullable Input<Either<String,UpdateTriggerPayloadType>> updateTriggerPayloadType) {
            this.updateTriggerPayloadType = updateTriggerPayloadType;
            return this;
        }

        public Builder setUpdateTriggerPayloadType(@Nullable Either<String,UpdateTriggerPayloadType> updateTriggerPayloadType) {
            this.updateTriggerPayloadType = Input.ofNullable(updateTriggerPayloadType);
            return this;
        }
        public BaseImageTriggerArgs build() {
            return new BaseImageTriggerArgs(baseImageTriggerType, name, status, updateTriggerEndpoint, updateTriggerPayloadType);
        }
    }
}
